public class NumRows {

    public static void main(String[] args) {
        NumRows nr = new NumRows();
        System.out.println(nr.convert("AB", 1));
    }

    public String convert(String s, int numRows) {
        if (numRows == 1) {
            return s;
        }

        int[][] arr = new int[numRows][s.length()];
        int[] index = new int[s.length()];
        int i = 0;
        boolean inverted = false;
        for (char c : s.toCharArray()) {
            arr[i][index[i]] = c;
            index[i]++;

            if(i == numRows - 1 && !inverted) {
                i--;
                inverted = true;
                continue;
            }

            if(i == 0 && inverted) {
                i++;
                inverted = false;
                continue;
            }

            if (i < numRows - 1 && !inverted) {
                i++;
            }  else if (i < numRows - 1 && inverted) {
                i--;
            }
        }

        String r = "";
        for (i = 0; i < arr.length; i++) {
            for (int j = 0; i < index.length && j < index[i]; j++) {
                r +=  (char)arr[i][j] ;
            }
        }

        return r;
    }
}
