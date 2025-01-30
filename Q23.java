//23. Write a Java Program to print Armstrong Numbers between 1 to 1000.

public class Q23 {
    public static void main(String[] args) {
        System.out.println("Armstrong numbers between 1 and 1000 are:");
        for (int num = 1; num <= 1000; num++) {
            int sum = 0;
            int ogNum = num;
            int digitCount = 0;
            int temp = num;
            while (temp > 0) {
                temp = temp / 10;
                digitCount++;
            }
            temp = num;
            while (temp > 0) {
                int digit = temp % 10;
                sum = sum + digit * digit * digit;
                temp = temp / 10;
            }
            if (sum == ogNum) {
                System.out.println(ogNum);
            }
        }
    }
}
