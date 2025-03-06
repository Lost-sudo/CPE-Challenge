package Sample3;

import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int num = s.nextInt();

        s.nextLine();

        for (int i = 1; i <= num; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.print("FizzBuzz\n");
            } else if (i % 3 == 0) {
                System.out.print("Fizz\n");
            } else if (i % 5 == 0) {
                System.out.print("Buzz\n");
            } else {
                System.out.print(i + "\n");
            }
        }
    }
}
