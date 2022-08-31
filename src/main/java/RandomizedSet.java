import java.util.*;

public class RandomizedSet {

    private Set<Integer> set;

    private List<Integer> list;

    private Random r = new Random(41);

    public RandomizedSet() {
        set =  new HashSet<>();
        list = new ArrayList<>();
    }

    public boolean insert(int val) {
        if (!set.contains(val)) {
            set.add(val);
            list.add(val);
            return true;
        }

        return false;
    }

    public boolean remove(int val) {
        if (set.contains(val)) {
            set.remove(val);
            return true;
        }

        return false;
    }

    public int getRandom() {
        return list.get(r.nextInt(list.size()));
    }
}
