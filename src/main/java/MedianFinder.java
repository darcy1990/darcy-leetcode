import java.util.TreeMap;

/**
 * @Author: Zhongming Yuan
 * @Date: 2021/11/5 5:39 下午
 */
public class MedianFinder {

    private TreeMap<Integer, Integer> treeMap;

    private Integer currentMedian;

    // 当前中位数的最大索引
    private int currentIndex;

    int s;

    public MedianFinder() {
        treeMap = new TreeMap<>();
    }

    public void addNum(int num) {
        if (treeMap.containsKey(num)) {
            treeMap.put(num, treeMap.get(num) + 1);
        } else {
            treeMap.put(num, 1);
        }

        if (currentMedian == null) {
            s++;
            currentMedian = num;
            currentIndex = 1;
            return;
        }

        s++;
        if (num <= currentMedian) currentIndex++;

        int m = s % 2 == 0 ? s / 2 : s / 2 + 1;
        int c = treeMap.get(currentMedian);
        if (m <= currentIndex - c) {
            currentIndex -= treeMap.get(currentMedian);
            currentMedian = treeMap.lowerKey(currentMedian);
        }  else if (m > currentIndex){
            currentMedian = treeMap.higherKey(currentMedian);
            currentIndex += treeMap.get(currentMedian);
        }
    }

    public double findMedian() {
        if (s % 2 != 0) {
            return currentMedian;
        }

        if (s / 2 + 1 <= currentIndex) {
            return currentMedian;
        }

        return (double)(currentMedian + treeMap.higherKey(currentMedian)) / 2;
    }
}
