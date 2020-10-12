
import java.util.Scanner;

public class NumberOfStrings {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = -1;
        while (true) {
            String line = scanner.nextLine();
            //System.out.println(line);
            count++;
            if (line.equals("end")) {
                break;
            }
            
        }
        System.out.println(count);
    }
}
