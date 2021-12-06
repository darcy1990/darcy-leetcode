import java.util.LinkedList;

/**
 * @Author: Zhongming Yuan
 * @Date: 2021/3/29 6:07 下午
 */
public class WordDictionary {

    private TrieNode root = new TrieNode();

    class TrieNode {
        TrieNode preNode = null;
        boolean isEnd = false;
        int deep = 0;//做hash使用，防止一个单词里面有多个char的时候hash是一样的，可能导致删除出错
        char content = 0;
        LinkedList<TrieNode> child = new LinkedList<>();

        TrieNode() {
        }

        TrieNode(char content) {
            this.content = content;
        }

        @Override
        public String toString() {
            return content + "";
        }

        @Override
        public int hashCode() {
            return content + deep;
        }

        @Override
        public boolean equals(Object obj) {
            return obj instanceof TrieNode && (((TrieNode) obj).content == content);
        }

        void setPreNode(TrieNode node) {
            preNode = node;
        }

        TrieNode getPreNode() {
            return preNode;
        }

        /**
         * child中是否有此Node
         *
         * @param character 保存的char
         * @return 存在返回不存在返回Null
         */
        TrieNode getNode(Character character) {
            for (TrieNode aChild : child) {
                if (aChild.content == character) {
                    return aChild;
                }
            }
            return null;
        }
    }

    /** Initialize your data structure here. */
    public WordDictionary() {

    }

    public void addWord(String word) {
        int deep = 0;
        TrieNode currNode = root;
        while (deep < word.length()) {
            /*
             * 判断当前node的child，如果为空直接添加，不为空，查找是否含有，不含有则添加并设为currNode，含有则找到并设置为currNode
             */
            char c = word.charAt(deep);
            if (currNode.child.contains(new TrieNode(c))) {
                currNode = currNode.getNode(c);
            } else {
                TrieNode node = new TrieNode(c);
                node.setPreNode(currNode);
                node.deep = deep + 1;
                currNode.child.add(node);
                currNode = node;
            }
            if (deep == word.length() - 1) {
                currNode.isEnd = true;
            }
            deep++;
        }
    }

    public boolean search(String word) {
        return search(root, word, 0);
    }

    private boolean search(TrieNode currNode, String word, int deep) {
        while (deep < word.length()) {
            char c = word.charAt(deep);
            if (c == '.') {
                if (currNode.child.isEmpty()) {
                    return false;
                }
                for (TrieNode n : currNode.child) {
                    if (deep == word.length() - 1 && n.isEnd) {
                        return true;
                    }
                    // notice No ++deep !, cause deep will increase with loop
                    int d = deep + 1;
                    if (search(n, word, d)) {
                        return true;
                    }
                }
                return false;
            } else {
                if (currNode.child.contains(new TrieNode(c))) {
                    currNode = currNode.getNode(c);
                } else {
                    return false;
                }
                if (deep == word.length() - 1) {
                    return currNode.isEnd;
                }
                deep++;
            }
        }
        return false;
    }
}
