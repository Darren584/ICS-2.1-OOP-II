import java.util.Scanner;

public class Challenge4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your username: ");
        String username = scanner.nextLine();

        System.out.println("Welcome, " + username + "!");
        scanner.close();
    }
}
