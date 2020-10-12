
import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give a number:");
        int num = Integer.valueOf(scanner.nextLine());
        int total = 0;
        int sum = 1;

        while (total < num) {
            total++;
            sum = (sum * total);
            System.out.println(total);
        }

        System.out.println("Factorial: " + sum);

    }
}
