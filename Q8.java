
//8. Write a Java Program to find whether given number is Leap year or NOT? 
import java.util.Scanner;

public class Q8 {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a year:");
        int year = sc.nextInt();
        if (year % 4 == 0 && year % 100 == 0 && year % 400 == 0) {
            System.out.println("Given year is a leap year ");
        } else {
            System.out.println("Given year is not a leap year ");
        }
        sc.close();

    }
}
