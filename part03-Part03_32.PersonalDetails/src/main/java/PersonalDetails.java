
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int length = 0;
        int longest = 0;
        int year = 0;
        int count = 0;

        String name = "text";
        while (true) {
            String text = String.valueOf(scanner.nextLine());
            if (text.equals("")) {
                break;
            }
            String[] pieces = text.split(",");
            length = pieces[0].length();
            if (length > longest) {
                longest = length;
                name = pieces[0];
            }
            year = year + Integer.valueOf(pieces[1]);
            count++;

        }
        System.out.println("Longest name: " + name);
        System.out.println("Average of the birth years: " + (1.0 * year / count));

    }
}
