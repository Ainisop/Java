
public class AdvancedAstrology {

    public static void printStars(int number) {
        for (int i = 1; i <= number; i++) {
            System.out.print("*");
        }
        System.out.println("");

    }

    public static void printSpaces(int number) {

        for (int i = 1; i <= number; i++) {
            System.out.print(" ");

        }

    }

    public static void printTriangle(int size) {
        int i = 1;
        int j = size - 1;

        while (i <= size) {

            printSpaces(j);

            printStars(i);
            i++;
            j--;

        }

    }

    public static void christmasTree(int height) {
        int i = 1;
        int j = height;
        while (i <= ((2 * height) - 1)) {
            printSpaces(j - 1);
            printStars(i);
            j--;
            i += 2;
        }
        int k = 1;
        while (k <= 2) {

            printSpaces(height - 2);
            printStars(3);

            k++;
        }

    }

    public static void main(String[] args) {
        // The tests are not checking the main, so you can modify it freely.

        printTriangle(5);
        System.out.println("---");
        christmasTree(4);
        System.out.println("---");
        christmasTree(10);
    }
}
