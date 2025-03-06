package Sample1.IsSubsequence;

public class Main {
    public static boolean isSubsequence(String s, String t) {
        int[][] memo = new int[s.length()][t.length()];
        return isSubSeq(s, t, 0, 0, memo);
    }

    private static boolean isSubSeq(String s, String t, int m, int n, int[][] memo) {
        if (m == s.length()) return true;
        if (n == t.length()) return false;

        if (memo[m][n] != 0) return memo[m][n] == 1;

        if (s.charAt(m) == t.charAt(n)) {
            memo[m][n] = isSubSeq(s, t, m+1, n+1, memo) ? 1 : -1;
        } else {
            memo[m][n] = isSubSeq(s, t, m, n+1, memo) ? 1 : -1;
        }

        return memo[m][n] == 1;
    }

    public static void main(String[] args) {
        String s = "abc";
        String t = "ahbgdc";
        System.out.println(isSubsequence(s, t));
    }
}
