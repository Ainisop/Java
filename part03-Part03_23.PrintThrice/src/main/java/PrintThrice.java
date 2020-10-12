
import java.util.Scanner;

public class PrintThrice {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Give a word: ");
        String word = String.valueOf(scanner.nextLine());
        String threeTimes = (word + word + word);
        System.out.println(threeTimes);

    }
}
