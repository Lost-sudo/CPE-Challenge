package Sample1;

import java.util.Arrays;

public class MaximumSumOfLIS {
    public static int maxSumLIS(int[] arr) {
        int n = arr.length;
        int[] dp = Arrays.copyOf(arr, n);

        for (int i = 1; i < n; i++) {
            for (int j = 0; j < i; j++) {
                if (arr[j] < arr[i] && dp[i] < dp[j] + arr[i]) {
                    dp[i] = dp[j] + arr[i];
                }
            }
        }

        return Arrays.stream(dp).max().getAsInt();
    }

    public static void main(String[] args) {
        int[] nums = {1, 101, 2, 3, 100, 4, 5};
        System.out.println(maxSumLIS(nums));
    }
}
