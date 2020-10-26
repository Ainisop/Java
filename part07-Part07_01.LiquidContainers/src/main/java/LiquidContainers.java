
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        int first = 0;
        int second = 0;

        Scanner scan = new Scanner(System.in);

        System.out.println("First: " + first + "/100");
        System.out.println("Second: " + second + "/100");

        while (true) {
            System.out.print("> ");
            String input = scan.nextLine();

            if (input.equals("quit")) {
                break;

            }

            String[] parts = input.split(" ");
            String command = parts[0];
            int amount = Integer.valueOf(parts[1]);

            if (command.equals("add")) {
                if (amount < 0) {
                    first = first;
                } else if (first + amount >= 100) {
                    first = 100;
                } else {
                    first = first + amount;
                }
            }
            if (command.equals("move")) {
                if (first - amount < 0) {
                    second = second + first;
                    if (second >= 100) {
                        second = 100;
                    }
                    first = 0;
                } else if (amount < 0) {
                    first = first;
                    second = second;
                } else {
                    first = first - amount;
                    second = second + amount;
                    if (second >= 100) {
                        second = 100;
                    }
                }
            }
            if (command.equals("remove")) {
                if (amount > second) {
                    second = 0;
                } else if (amount <= 0) {
                    second = second;
                } else {
                    second = second - amount;
                }

            }

            System.out.println("First: " + first + "/100");
            System.out.println("Second: " + second + "/100");

        }
    }

}
