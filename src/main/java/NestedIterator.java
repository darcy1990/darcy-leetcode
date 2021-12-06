import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @Author: Zhongming Yuan
 * @Date: 2021/7/30 5:49 下午
 */
public class NestedIterator implements Iterator<Integer> {

    private int cur = -1;

    private List<Integer> arr = new ArrayList<>();

    public NestedIterator(List<NestedInteger> nestedList) {
        for (int i = 0; i < nestedList.size(); i++) {
            flat(nestedList.get(i));
        }
    }

    private void flat(NestedInteger n) {
        if (n.isInteger()) {
            arr.add(n.getInteger());
        } else {
            List<NestedInteger> nestedList = n.getList();
            for (int i = 0; i < nestedList.size(); i++) {
                flat(nestedList.get(i));
            }
        }
    }

    @Override
    public Integer next() {
        if (cur >= arr.size() - 1) {
            return null;
        }
        return arr.get(++cur);
    }

    @Override
    public boolean hasNext() {
        return cur < arr.size() - 1;
    }
}
