package Sample1.LongestIncreasingSubSeq;

import java.util.Arrays;

public class Main {
    static int lisEndingAtIdx(int[] arr, int idx, int[] memo) {
        if (idx == 0) return 1;

        if (memo[idx] != -1) {
            return memo[idx];
        }

        int max = 1;

        for (int prev = 0; prev < idx; prev++) {
            if (arr[prev] < arr[idx]) {
                max = Math.max(max, lisEndingAtIdx(arr, prev, memo) + 1);
            }
            memo[idx] = max;
        }
        return memo[idx];
    }

    static int lis(int[] arr) {
        int n = arr.length;

        int[] memo = new int[n];
        Arrays.fill(memo, -1);

        int res = 1;
        for (int i = 0; i < n; i++) {
            res = Math.max(res, lisEndingAtIdx(arr, i, memo));
        }
        return res;
    }

    public static void main(String[] args) {
        int[] arr = {10, 22, 9, 33, 21, 50, 41, 60};
        System.out.println(lis(arr));
    }
}
