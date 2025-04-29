import java.util.Scanner;

public class Challenge5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int guess;
        int secretNumber = 7;

        do {
            System.out.print("Guess the number between 1 and 10: ");
            guess = scanner.nextInt();
        } while (guess != secretNumber);

        System.out.println("Congratulations! You guessed it right.");
        scanner.close();
    }
}
