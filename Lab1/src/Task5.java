import java.util.Scanner;

public class Task5{
    public static void main(String[] args) {
        Scanner scanner  = new Scanner(System.in);
        System.out.print("Enter number:");
        int n = scanner.nextInt();
        int sum = 0;
        while(n != 0){
            //Суммирование цифр числа
            sum += (n % 10);
            n/=10;
        }
        System.out.println(sum + " ");

    }
}