package Sample1;

import java.util.Arrays;
import java.util.Scanner;

public class LongestBitonicSubsequence {
    public static int findLBS(int[] nums) {
        int n = nums.length;
        int[] inc = new int[n];
        int[] dec = new int[n];

        Arrays.fill(inc, 1);
        Arrays.fill(dec, 1);

        for (int i = 1; i < n; i++) {
            for (int j = 0; j < i; j++) {
                if (nums[j] < nums[i]) {
                    inc[i] = Math.max(inc[i], inc[j] + 1);
                }
            }
        }

        for (int i = n - 2; i >= 0; i--) {
            for (int j = n - 1; j > i; j--) {
                if (nums[j] < nums[i]) {
                    dec[i] = Math.max(dec[i], dec[j] + 1);
                }
            }
        }

        int maxLBS = 0;
        for (int i = 0; i < n; i++) {
            maxLBS = Math.max(maxLBS, inc[i] + dec[i] - 1);
        }

        return maxLBS;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter the length of the array: ");
        int size = s.nextInt();

        s.nextLine();

        int[] list = new int[size];

        System.out.print("Enter the elements of the array: ");
        String[] input = s.nextLine().split("\\s+");

        for (int i = 0; i < list.length; i++) {
            list[i] = Integer.parseInt(input[i]);
        }

        s.close();

        System.out.print("The Longest Bitonic Subsequence Length: " + findLBS(list));
    }
}
