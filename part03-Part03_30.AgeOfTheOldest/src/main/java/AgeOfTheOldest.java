
import java.util.Scanner;

public class AgeOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age = 0;
        int oldest = 0;
        
        while (true) {
            String text = String.valueOf(scanner.nextLine());
            if (text.equals("")) {
                break;
            }
            String[] pieces = text.split(",");

            age = Integer.valueOf(pieces[1]);

            System.out.println(age);
            if (age > oldest) {
                oldest = age;
            }
        }
        System.out.println("Name of the oldest: " + oldest);
    }

}
