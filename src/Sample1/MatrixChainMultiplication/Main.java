package Sample1.MatrixChainMultiplication;

import java.util.Arrays;

public class Main {
    static int minMultRec(int[] arr, int i, int j, int[][] memo) {
        if (i + 1 == j) {
            return 0;
        }

        if (memo[i][j] != -1) {
            return memo[i][j];
        }

        int res = Integer.MAX_VALUE;

        for (int k = i + 1; k < j; k++) {
            int current = minMultRec(arr, i, k, memo) + minMultRec(arr, k, j, memo) + arr[i] * arr[k] * arr[j];
            res = Math.min(current, res);
        }

        memo[i][j] = res;
        return res;
    }

    static int matrixMultiplication(int[] arr) {
        int n = arr.length;
        int[][] memo = new int[n][n];
        for (int[] row : memo) {
            Arrays.fill(row,-1);
        }
        return minMultRec(arr, 0, n - 1, memo);
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 3};
        System.out.println(matrixMultiplication(arr));
    }
}
