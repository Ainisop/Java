
import java.util.Scanner;

public class RepeatingBreakingAndRemembering {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Give numbers");
        int total = 0;
        int sum = 0;
        double average = 0;
        int odd = 0;
        int even =0;

        while (true) {

            int num = Integer.valueOf(scanner.nextLine());
            if (num == -1) {

                break;

            } else if (num > 0 ) {
                sum = (num + sum);
                total++;
                average = ((double) sum / total);
                if (num % 2 == 0 || num == 0){
                    even++;
                } else if (num % 2 != 0){
                    odd++;
                }
            } 

        }
        System.out.println("Thx! Bye!");
        System.out.println("Sum: " + sum);
        System.out.println("Numbers: " + total);
        System.out.println("Average: " + average);
        System.out.println("Even: " + even);
        System.out.println("Odd: " + odd);
    }
}
