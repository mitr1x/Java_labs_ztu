
import java.util.Scanner;

public class Main4 {


    public static void main(String[] args) {

        checkCredentials();

    }

    public static void checkCredentials() {
        String login;
        String password;
        String confirmPassword;
        System.out.println("Enter Login: ");
        Scanner sc = new Scanner(System.in);
        login = sc.nextLine();
        System.out.println("Enter your Password: ");
        password = sc.nextLine();
        System.out.println("Confirm Password: ");
        confirmPassword = sc.nextLine();


        if (login.length() < 20 && login.matches("^[a-zA-Z0-9]+$")  &&
                password.length() < 20 && password.matches("^[a-zA-Z0-9]+$") && (password.equals(confirmPassword)
                || login.contains("_") || password.contains("_") )) {
            System.out.println("You are in");
        } else System.out.println("Wrong login or password...");
    }
}

