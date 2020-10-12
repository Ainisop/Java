
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int total = 0;
        double average = 0;
        double sum = 0;

        while (true) {
            int number = Integer.valueOf(scanner.nextLine());

            if (number == 0) {
                break;

            } else if (number > 0) {
                sum = (sum + number);
                total = (total + 1);
                average = (sum / total);
            } else if (number < 0) {
                if (sum < 0){
                    System.out.println("cannot calc");
                }
            }

        }
        if (sum > 0) {
            System.out.println(average);

        } else {
            System.out.println("Cannot calculate the average");
        }
    }
}
