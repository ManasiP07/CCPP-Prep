//10. Write a Java Program to print all the Factors of the Given number.

import java.util.Scanner;

public class Q10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        for (int i = 2; i <= num; i++) {
            if (num % i == 0) {
                System.out.println("Factors of " + num + " is: " + i);
            }
        }
        sc.close();
    }
}
