
//12. Write a Java Program to find the smallest of 3 numbers(a,b,c) without using < or > symbol? 
import java.util.Scanner;

public class Q12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();

        int minAB = (num1 + num2 - Math.abs(num1 - num2)) / 2;
        int min = (minAB + num3 - Math.abs(minAB - num3)) / 2;
        System.out.println("Smallest number is: " + min);
        sc.close();
    }
}
