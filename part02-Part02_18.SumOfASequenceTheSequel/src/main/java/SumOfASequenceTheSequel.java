
import java.util.Scanner;

public class SumOfASequenceTheSequel {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("First number?");
        int frstNum = Integer.valueOf(scanner.nextLine());
        System.out.println("Last number?");
        int lastNum = Integer.valueOf(scanner.nextLine());
        int sumTotal = 0;
        int save = frstNum;
        while (frstNum < lastNum) {
            frstNum++;
            sumTotal = (frstNum + sumTotal);

            // System.out.println(sumTotal + frstNum);
        }
        System.out.println("The sum is " + (sumTotal + save));
    }
}
