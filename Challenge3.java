import java.util.Scanner;

public class LicenseEligibility {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = input.nextInt();

        if (age >= 18) {
            System.out.println("You are eligible for a full driver's license.");
        } else if (age >= 16) {
            System.out.println("You are eligible for a learner's permit.");
        } else {
            System.out.println("You are not eligible for a driver's license yet.");
        }

        input.close();
    }
}
