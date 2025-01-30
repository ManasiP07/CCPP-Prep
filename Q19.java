//21. Write a Java Program to print Prime Numbers from 1 to N. 

import java.util.Scanner;

public class Q19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of N: ");
        int N = sc.nextInt();

        System.out.println("Prime numbers between 1 to " + N + " are:");
        for (int num = 2; num <= N; num++) {
            if (isPrime(num)) {
                System.out.println(num + " ");
            }
        }
        sc.close();

    }

    public static boolean isPrime(int num) {
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
