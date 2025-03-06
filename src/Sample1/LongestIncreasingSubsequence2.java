package Sample1;

import java.util.*;

public class LongestIncreasingSubsequence2 {
    public static List<Integer> findLIS(int[] nums) {
        int n = nums.length;
        int[] dp = new int[n];
        int[] prev = new int[n];
        Arrays.fill(dp, 1);
        Arrays.fill(prev, -1);

        int maxLength = 1, lastIndex = 0;

        for (int i = 1; i < n; i++) {
            for (int j = 0; j < i; j++) {
                if (nums[j] < nums[i] && dp[j] + 1 > dp[i]) {
                    dp[i] = dp[j] + 1;
                    prev[i] = j;
                }
            }
            if (dp[i] > maxLength) {
                maxLength = dp[i];
                lastIndex = i;
            }
        }

        List<Integer> lis = new ArrayList<>();
        for (int i = lastIndex; i >= 0; i = prev[i]) {
            lis.add(nums[i]);
            if (prev[i] == -1) break;
        }

        Collections.reverse(lis);
        return lis;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter the length of the array: ");
        int size = s.nextInt();

        s.nextLine();
        int[] list = new int[size];

        System.out.print("Enter the elements: ");
        String[] input = s.nextLine().split("\\s+");

        for (int i = 0; i < input.length; i++) {
            list[i] = Integer.parseInt(input[i]);
        }

        System.out.print(findLIS(list));

    }
}
