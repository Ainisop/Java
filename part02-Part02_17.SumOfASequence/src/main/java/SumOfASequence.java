
import java.util.Scanner;

public class SumOfASequence {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Last number?");
        int lastNum = Integer.valueOf(scanner.nextLine());
        int total = 0;
        int sumTotal = 0;
        while (total < lastNum) {

            total++;
            sumTotal = (total + sumTotal);

        }
        System.out.println("The sum is " + sumTotal);
    }
}
