
public class StarSign {

    public static void main(String[] args) {

        //The tests are not checking the main, so you can modify it freely.
        //NB: If the tests don't seem to pass, you should try the methods here
        //in the main to make sure they print the correct shapes!
        printStars(3);
        System.out.println("\n---");  // printing --- between the shapes
        printSquare(4);
        System.out.println("\n---");
        printRectangle(5, 6);
        System.out.println("\n---");
        printTriangle(3);
        System.out.println("\n---");
    }

    public static void printStars(int number) {
        int stars = 1;

        while (stars <= number) {
            System.out.print("*");
            stars++;
        }
        System.out.println("");
    }

    public static void printSquare(int size) {

        int sqr = 1;
        while (sqr <= size) {
            printStars(size);
            sqr++;

        }
        System.out.println("");
    }

    public static void printRectangle(int width, int height) {
        int rect = 1;
        while (rect <= height) {
            printStars(width);
            rect++;

        }
    }

    public static void printTriangle(int size) {
        int trng = 1;
        while (trng <= size) {
            printStars(trng);
            trng++;
        }
    }
}
