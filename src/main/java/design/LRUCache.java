package design;

import java.util.HashMap;

public class LRUCache {

    public static void main(String[] args) {
        LRUCache lru = new LRUCache(2);
        lru.get(2);
        lru.put(2, 6);
        lru.get(1);
        lru.put(1, 5);
        lru.put(1, 2);
        lru.get(1);
        lru.get(2);
    }

    private HashMap<Integer, Integer> map = null;

    private int capacity;

    private DoubleLinkedList dll = new DoubleLinkedList();

    public LRUCache(int capacity) {
        this.capacity = capacity;
        map = new HashMap<>(capacity);
    }

    public int get(int key) {
        if (!map.containsKey(key)) {
            return -1;
        }

        ListNode k = dll.head;
        while (k != null) {
            if (k.val == key) {
                dll.moveTail(k);
            }
            k = k.next;
        }

        return map.get(key);
    }

    public void put(int key, int value) {
        if (map.containsKey(key)) {
            ListNode k = dll.head;
            while (k != null) {
                if (k.val == key) {
                    dll.moveTail(k);
                }
                k = k.next;
            }
            map.put(key, value);
        } else {
            if (map.size() >= capacity) {
                int k = dll.removeHead();
                map.remove(k);
            }

            dll.put(key);
            map.put(key, value);
        }
    }

    private static class DoubleLinkedList {

        private ListNode head = null;
        private ListNode tail = null;

        public void moveTail(ListNode k) {
            ListNode t = head;
            ListNode pre = null;
            while (t != null && t.next != null) {
                if (t == k) {
                    if (pre == null) {
                        tail.next = head;
                        head = head.next;
                        tail = tail.next;
                        tail.next = null;
                    } else {
                        pre.next = k.next;
                        tail.next = k;
                        tail = k;
                        tail.next = null;
                    }
                    break;
                }
                pre = t;
                t = t.next;
            }
        }

        public int removeHead() {
            // remove head
            int h = head.val;
            head = head.next;

            return h;
        }

        public void put(int key) {
            // append
            if (head == null) {
                head = new ListNode(key);
                tail = head;
            } else {
                tail.next = new ListNode(key);
                tail = tail.next;
            }
        }
    }

    public static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
}
