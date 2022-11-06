import java.util.Scanner;  // Import the Scanner class

public class Task4 {
    public static void main(String[] args) {
        Scanner scann = new Scanner(System.in);
        System.out.print("Enter number1:");
        int num1 = scann.nextInt();
        System.out.print("Enter number2:");
        int num2 = scann.nextInt();

        if (num1 < num2) {
            Integer number = num1;
            num1 = num2;
            num2 = number;
        }
        Integer res;
        do {
            res = num1 % num2;
            num1 = num2;
            num2 = res;
        } while (res != 0);
        System.out.print("Greatest common divisor:" + num1);
    }
}

