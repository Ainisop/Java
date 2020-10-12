
import java.util.Scanner;

public class Counting {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.valueOf(scanner.nextLine());
        int numVal = 0;

        while (num > numVal) {

            System.out.println(numVal);
            numVal++;
        }
        System.out.println(num);
    }
}
