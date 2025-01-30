
//3. Write a Java Program to find the Factorial of given number. 
//with recursion
import java.util.Scanner;

public class Q3 {

    public static int factorialNum(int n) {
        if (n == 0 || n == 1) { // base condition
            return 1;
        }
        return n * factorialNum(n - 1);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        int result = Q3.factorialNum(num);
        System.out.println("factorial of " + num + " is : " + result);
        sc.close();
    }

}
