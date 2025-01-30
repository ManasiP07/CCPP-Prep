//2. Find the Factorial of a number. 

import java.util.Scanner;

public class Q2 {

    public static void factorialNum(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact = fact * i;

        }
        System.out.println("factorial of " + n + " is : " + fact);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        Q2.factorialNum(num);
        sc.close();
    }

}
