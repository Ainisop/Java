
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class NumbersFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        System.out.print("File? ");
        String file = scanner.nextLine();
        System.out.print("Lower bound? ");
        int lowerBound = Integer.valueOf(scanner.nextLine());
        System.out.print("Upper bound? ");
        int upperBound = Integer.valueOf(scanner.nextLine());

        try ( Scanner scannerText = new Scanner(Paths.get(file))) {

            while (scannerText.hasNextLine()) {

                String row = scannerText.nextLine();
                int convertedToInt = Integer.valueOf(row);
                if (convertedToInt >= lowerBound && convertedToInt <= upperBound) {
                    count++;
                    // System.out.println(row);

                }

            }

        } catch (Exception e) {
            System.out.println("Reading the file " + file + " failed.");
        }
        System.out.println("Numbers: " + count + ".");
    }
}
