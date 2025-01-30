//16. Write a java program to LCM of TWO given number. 

import java.util.Scanner;

public class Q16 {
    public static int gcd(int x, int y) {
        while (y != 0) {
            int temp = y;
            y = x % y;
            x = temp;
        }
        return x;
    }

    public static int lcm(int x, int y) {
        return (x * y) / gcd(x, y);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int result = lcm(num1, num2);
        System.out.println("LCM of " + num1 + " and " + num2 + " is: " + result);
        sc.close();
    }

}
