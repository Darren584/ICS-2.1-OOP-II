import java.util.Scanner;

public class VendingMachine {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String command = "";

        System.out.println("Type 'buy' to get a snack. Type anything else to stop:");
        command = input.next();

        while ("buy".equalsIgnoreCase(command)) {
            System.out.println("Take your snack!");
            command = input.next();
        }

        input.close();
    }
}
