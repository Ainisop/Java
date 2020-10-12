
import java.util.Scanner;

public class CountingToHundred {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = Integer.valueOf(scanner.nextLine());
        

        while (num < 101) {
            
            System.out.println(num);
            num++;
        }

    }
}
