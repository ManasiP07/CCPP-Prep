//22. Write a Java Program to check whether the given number is Armstrong Number or NOT. 

import java.util.Scanner;

public class Q22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        int ogNum = num;
        int sum = 0;
        while (num > 0) {
            int digit = num % 10;
            sum = sum + digit * digit * digit;
            num = num / 10;
        }
        if (sum == ogNum) {
            System.out.println("Given number is armstrong number: ");
        } else {
            System.out.println("Given number is not armstrong number: ");
        }

        sc.close();
    }
}
