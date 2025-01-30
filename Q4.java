//4. Swap two numbers without using third variable approach 1. 

import java.util.Scanner;

public class Q4 {
    public static void swapTwoNumbers(int x, int y) {
        x = x * y; // 6
        y = x / y; // 2
        x = x / y; // 3
        System.out.println("Numbers after swapping is: ");
        System.out.println("First number is: " + x);
        System.out.println("Second number is: " + y);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int num1 = sc.nextInt();// 2
        System.out.println("Enter second number: ");
        int num2 = sc.nextInt();// 3
        Q4.swapTwoNumbers(num1, num2);
        sc.close();

    }
}
