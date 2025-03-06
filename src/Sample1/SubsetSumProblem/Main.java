package Sample1.SubsetSumProblem;

import java.util.Arrays;

public class Main {
    static boolean isSubsetSumRec(int[] arr, int n, int sum, int[][] memo) {
        if (sum == 0) return true;
        if (n <= 0) return false;

        if (memo[n][sum] != -1) {
            return memo[n][sum] == 1;
        }

        if (arr[n - 1] > sum) {
            memo[n][sum] = isSubsetSumRec(arr, n-1, sum, memo) ? 1 : 0;
        } else {
            memo[n][sum] = isSubsetSumRec(arr, n - 1, sum, memo) || isSubsetSumRec(arr, n -1, sum - arr[n-1], memo) ? 1 : 0;
        }

        return memo[n][sum]  == 1;
    }

    static boolean isSubsetSum(int[] arr, int sum) {
        int n = arr.length;
        int[][] memo = new int[n+1][sum + 1];
        for (int[] row : memo) {
            Arrays.fill(row, -1);
        }

        return isSubsetSumRec(arr, n, sum, memo);
    }

    public static void main(String[] args) {
        int[] arr = {1, 5, 3, 7, 4};
        int sum = 12;

        System.out.println(isSubsetSum(arr, sum));
    }
}
