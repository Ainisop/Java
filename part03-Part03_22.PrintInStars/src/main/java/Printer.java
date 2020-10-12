
public class Printer {

    public static void main(String[] args) {
        // You can test the method here
        int[] array = {5, 1, 3, 4, 2};
        printArrayInStars(array);
    }

    public static void printArrayInStars(int[] array) {
        for (int index = 0; index < array.length; index++) {
            int starsCount = 0;
            while (starsCount < array[index]) {
                System.out.print("*");

                starsCount++;
            }
            System.out.println("");

        }
    }

}
