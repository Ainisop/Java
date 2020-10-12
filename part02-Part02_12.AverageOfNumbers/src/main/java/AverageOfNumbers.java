
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double sum = 0;
        double total = 0;
        double sumAverage = 0;
        while (true) {
            System.out.println("Give a number:");
            int number = Integer.valueOf(scanner.nextLine());

            if (number == 0) {
                break;

            } else {
                total = (total + 1);
                sum = (sum + number);
                sumAverage = (sum / total);
            }
        }
        System.out.println("Average of the numbers: " + sumAverage);

    }
}
