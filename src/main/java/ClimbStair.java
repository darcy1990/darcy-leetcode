public class ClimbStair {

    private int[] ways = new int[1000];

    public int climbStairs(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }

        if (ways[n - 1] > 0) {
            return ways[n -1];
        }

        int way = climbStairs(n - 1) + climbStairs(n - 2);
        ways[n -1] = way;

        return way;
    }
}
