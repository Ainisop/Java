
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age = 0;
        int oldest = 0;
        String oldestName = "text";
        while (true) {
            String text = String.valueOf(scanner.nextLine());
            if (text.equals("")) {
                break;
            }
            String[] pieces = text.split(",");

            age = Integer.valueOf(pieces[1]);
            String name = pieces[0];

            if (age > oldest) {
                oldest = age;
                oldestName = pieces[0];

            }

        }
        System.out.println("Name of the oldest:" + oldestName);

    }
}
