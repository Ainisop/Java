
public class ArrayPrinter {

    public static void main(String[] args) {
        // You can test your method here
        int[] array = {5, 1, 3, 4, 2};
        printNeatly(array);
    }

    public static void printNeatly(int[] array) {
        int index = 0;
        int commaIndex = 1;
        String comma = ("," + " ");
        while (index < array.length) {
            System.out.print(array[index]);
            if (commaIndex < array.length) {
                System.out.print(comma);
            }
            index++;
            commaIndex++;
        }
    }
}
