
import java.util.Scanner;

public class IsItTrue {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Give a string: ");
        String text = String.valueOf(scanner.nextLine());
        if (!(text.equals("true"))) {
            System.out.println("Try again!");

        } else {
            System.out.println("You got it right!");
        }

    }
}
