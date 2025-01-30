
//1. Check the given number is EVEN or ODD. 
import java.util.Scanner;

class EvenorOdd {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number: ");
        int a = sc.nextInt();
        if (a % 2 == 0) {
            System.out.println("Given number is even");
        } else {
            System.out.println("Given number is odd");
        }
        sc.close();

    }
}