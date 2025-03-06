package Sample5;

import java.util.Scanner;

public class NextGreatest {
    static void nextGreatest(int[] arr) {
        int n = arr.length;
        int max_value = -1;

        for (int i = n - 1; i >= 0; i--) {
            int temp = arr[i];
            arr[i] = max_value;
            max_value = Math.max(max_value, temp);
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int[] arr = new int[s.nextInt()];

        System.out.print("Enter the number of elements in the array: \n");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = s.nextInt();
        }

        nextGreatest(arr);

        System.out.print("Modified array: ");
        for (int number : arr) {
            System.out.print(number + " ");
        }
    }
}
