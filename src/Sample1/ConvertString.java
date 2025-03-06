package Sample1;

import java.util.HashMap;
import java.util.Scanner;

public class ConvertString {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter string 1: ");
        String str1 = s.nextLine();
        System.out.print("Enter string 2: ");
        String str2 = s.nextLine();

        System.out.println("The minimum operations to convert a string to another is: " + findMinOps(str1, str2));
    }

    public static int findMinOps(String s1, String s2) {
        HashMap<String, Integer> memo = new HashMap<>();
        return findMinOpsMethod(s1, s2, 0, 0, memo);
    }

    public static int findMinOpsMethod(String s1, String s2, int i1, int i2, HashMap<String, Integer> memo) {
        if (i1 == s1.length()) return s2.length() - i2;
        if (i2 == s2.length()) return s1.length() - i1;

        String key = i1 + "," + i2;
        if (memo.containsKey(key)) return memo.get(key);

        if (s1.charAt(i1) == s2.charAt(i2)) {
            memo.put(key, findMinOpsMethod(s1, s2, i1+1, i2+1, memo));
        } else {
            int deleteOps = 1 + findMinOpsMethod(s1, s2, i1+1, i2, memo);
            int insertOps = 1 + findMinOpsMethod(s1, s2, i1, i2+1, memo);
            int replaceOps = 1 + findMinOpsMethod(s1, s2, i1+1, i2+1, memo);

            memo.put(key, Math.min(deleteOps, Math.min(insertOps, replaceOps)));
        }

        return memo.get(key);

    }
}
