//18. Check whether the Given Number is a Palindrome or NOT. 

import java.util.Scanner;

public class Q18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = sc.nextInt();
        int revNum = num;
        int rev = 0;

        while (num > 0) {
            int digit = num % 10;
            rev = rev * 10 + digit;
            num = num / 10;
        }
        if (rev == revNum) {
            System.out.println("Given number is palindrome number: ");
        } else {
            System.out.println("Given number is not a palindrome number: ");
        }
        sc.close();

    }

}
