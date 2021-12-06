public class RomanToInt {

    public static void main(String[] args) {
        RomanToInt r = new RomanToInt();
        System.out.println(r.romanToInt("MCMXCIV"));
    }

    public int romanToInt(String s) {
        int v = 0;
        String segment = s.substring(0, 1);
        for (int i = 1; i < s.length(); i++) {
            String c = s.substring(i, i + 1);
            String pre = s.substring(i - 1, i);
            if (Roman.getRoman(c).value > Roman.getRoman(pre).value) {
                segment += c;
            } else {
                v += get(segment);

                // reset;
                segment = c;
            }
        }

        if (segment.length() > 0) {
            v += get(segment);
        }

        return v;
    }

    private int get(String segment) {
        if (segment.length() > 1) {
            return Roman.getRoman(segment.substring(1, 2)).value - Roman.getRoman(segment.substring(0, 1)).value;
        } else {
            return Roman.getRoman(segment).value;
        }
    }

    private enum Roman {

        I("I", 1),

        V("V", 5),

        X("X", 10),

        L("L", 50),

        C("C", 100),

        D("D", 500),

        M("M", 1000)
        ;

        private String s;

        private Integer value;

        Roman(String s, Integer value) {
            this.s = s;
            this.value = value;
        }

        public static Roman getRoman(String s) {
            for (Roman r : Roman.values()) {
                if (s.equals(r.s)) {
                    return r;
                }
            }

            return null;
        }

        public String getS() {
            return s;
        }

        public Integer getValue() {
            return value;
        }
    }
}
