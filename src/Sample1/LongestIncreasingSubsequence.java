package Sample1;

import java.util.*;

public class LongestIncreasingSubsequence {
    public static int lengthOfLIS(int[] numbers) {
        int n = numbers.length;
        int[] dp = new int[n];
        Arrays.fill(dp, 1);

        int maxValue = 1;

        for (int i = 1; i < n; i++) {
            for (int j = 0; j < i; j++) {
                if (numbers[j] < numbers[i]) {
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }
            }
            maxValue = Math.max(maxValue, dp[i]);
        }
        return maxValue;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter the number of integers in the list: ");
        int size = s.nextInt();

        s.nextLine();

        int[] list = new int[size];

        System.out.print("Enter the integers: \n");
        String[] input = s.nextLine().split("\\s+");


        for (int i = 0; i < input.length; i++) {
            list[i] = Integer.parseInt(input[i]);
        }

        System.out.print("The length of the longest increasing subsequence is: " + lengthOfLIS(list));
    }
}
