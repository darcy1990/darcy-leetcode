package array;

public class MoveZeroes {

    public void moveZeroes(int[] nums) {
        int c = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                c++;
            } else if (c > 0) {
                nums[i - c] = nums[i];
                nums[i] = 0;
            }
        }
    }
}
