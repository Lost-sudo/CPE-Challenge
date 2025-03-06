package Sample1;

import java.util.Arrays;
import java.util.Scanner;

public class CountLIS {
    public static int countLIS(int[] arr) {
        int n = arr.length;
        int[] dp = new int[n];
        int[] count = new int[n];
        Arrays.fill(dp, 1);
        Arrays.fill(count, 1);

        int maxLength = 1, result = 0;

        for (int i = 1; i < n; i++) {
            for (int j = 0; j < i; j++) {
                if (arr[j] < arr[i]) {
                    if (dp[j] + 1 > dp[i]) {
                        dp[i] = dp[j] + 1;
                        count[i] = count[j];
                    } else if (dp[j] + 1 == dp[i]) {
                        count[i] += count[j];
                    }
                }
            }
            maxLength = Math.max(maxLength, dp[i]);
        }

        for (int i = 0; i < n; i++) {
            if (dp[i] == maxLength) {
                result += count[i];
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = s.nextInt();

        s.nextLine();

        int[] list = new int[size];
        System.out.print("Enter the elements of the array: ");
        String[] input = s.nextLine().split("\\s+");

        for (int i = 0; i < list.length; i++) {
            list[i] = Integer.parseInt(input[i]);
        }

        System.out.print("The number of longest increasing subsequence: " + countLIS(list));
    }
}
