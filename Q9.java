//9.Write a Java Program to print the digits of a Given Number. 

import java.util.Scanner;

public class Q9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = sc.nextInt();
        while (num > 0) {
            int n = num % 10;
            System.out.println(n);
            num = num / 10;
        }
        sc.close();
    }
}
