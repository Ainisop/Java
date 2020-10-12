
import java.util.ArrayList;
import java.util.Scanner;

public class GreatestInList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int j = 0;
        ArrayList<Integer> list = new ArrayList<>();
        while (true) {

            int input = Integer.valueOf(scanner.nextLine());
            j++;
            if (input == -1) {
                break;
            }

            list.add(input);
        }

        System.out.println("");
        int highest = list.get(0);
        for (int i = 0; i < list.size(); i++) {
            int number = list.get(i);
            if (highest < number) {
                highest = number;
            }
        }
        System.out.println(highest);
    }
}
