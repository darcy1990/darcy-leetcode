package string;

public class CanConstruct {

    public boolean canConstruct(String ransomNote, String magazine) {
        int[] a = new int[26];
        int[] b = new int[26];
        for (int i = 0; i < ransomNote.length(); i++) {
            a[ransomNote.charAt(i) - 'a']++;
        }

        for (int i = 0; i < magazine.length(); i++) {
            b[magazine.charAt(i) - 'a']++;
        }

        for (int i = 0; i < a.length; i++) {
            if (a[i] > b[i]) {
                return false;
            }
        }

        return true;
    }
}
