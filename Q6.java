//6. Swap two numbers without using third variable approach 3. 

import java.util.Scanner;

public class Q6 {
    public static void swapTwoNumbers(int x, int y) {
        x = x ^ y;
        y = x ^ y;
        x = x ^ y;
        System.out.println("Numbers after swapping is: ");
        System.out.println("First number is: " + x);
        System.out.println("Second number is: " + y);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int num1 = sc.nextInt();
        System.out.println("Enter second number: ");
        int num2 = sc.nextInt();
        Q6.swapTwoNumbers(num1, num2);
        sc.close();
    }

}
