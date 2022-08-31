package number;

public class RangeBitwiseAnd {

    public int rangeBitwiseAnd(int left, int right) {
        int ansLeft = left;
        int c = 1;
        while (left <= right - c) {
            ansLeft &= left + c;

            c *= 2;
        }

        int ansRight = right;
        int d = 1;
        while (right - d >= left) {
            ansRight &= right - d;

            d *= 2;
        }

        return ansLeft & ansRight;
    }

}
