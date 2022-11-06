import java.util.Scanner;  // Import the Scanner class

public class Task2 {
    public static void main(String[] args) {
        Scanner scann = new Scanner(System.in);
        System.out.print("Enter number1:");
        int num1 = scann.nextInt();
        System.out.print("Enter number2:");
        int num2 = scann.nextInt();

        int Sum = num1 + num2;  // Read user input
        System.out.println("Sum is: " + Sum);  // Output user input
    }
}
