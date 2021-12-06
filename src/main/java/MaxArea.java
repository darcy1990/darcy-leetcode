public class MaxArea {

    public static void main(String[] args) {
        MaxArea m = new MaxArea();
        int a = m.maxArea(new int[]{1,8,6,2,5,4,8,3,7});
        System.out.println(a);
    }

    public int maxArea(int[] height) {
        int l = 0;
        int r = height.length - 1;
        int max = 0;
        while(l < r) {
            max = Math.max(max, (r - l) * Math.min(height[l], height[r]));
            if (height[l] < height[r]) {
                l++;
            } else {
                r--;
            }
        }

        return max;
    }
}
