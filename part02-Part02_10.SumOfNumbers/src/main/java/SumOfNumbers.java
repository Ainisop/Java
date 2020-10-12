
import java.util.Scanner;

public class SumOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int total = 0;

        while (true) {
            System.out.println("Give a number:");
            int number = Integer.valueOf(scanner.nextLine());

            if (number == 0) {
                break;
            } else {

                sum = (sum + number);
                total = (total + 1);
            }
        }
        System.out.println("Number of numbers: " + total);
        System.out.println("Sum of the numbers: " + sum);

    }
}
