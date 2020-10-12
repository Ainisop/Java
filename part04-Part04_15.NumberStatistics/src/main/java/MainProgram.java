
import java.util.Scanner;

public class MainProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Statistics statistics = new Statistics();
        Statistics totalSumEvens = new Statistics();
        Statistics totalSumOdds = new Statistics();

        System.out.println("Enter numbers:");
        while (true) {

            int input = Integer.valueOf(scanner.nextLine());
            if (input == -1) {
                break;
            }
            if (input % 2 == 0) {
                totalSumEvens.addNumber(input);
            } else {
                totalSumOdds.addNumber(input);
            }

            statistics.addNumber(input);
        }

        //  System.out.println("Count: " + statistics.getCount());
        System.out.println("Sum: " + statistics.sum());
        System.out.println("Sum of even numbers: " + totalSumEvens.sum());
        System.out.println("Sum of odd numbers: " + totalSumOdds.sum());
        // System.out.println("Average: " + statistics.average());
    }
}
