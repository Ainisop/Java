
public class Averaging {

    // implement the sum method here again
    public static double sum(double number1, double number2, double number3, double number4) {
        double sum = (number1 + number2 + number3 + number4);

        return sum;

    }

    public static double average(int number1, int number2, int number3, int number4) {
        // double sum = (number1 + number2 + number3 + number4);

        double result = sum(number1, number2, number3, number4) / 4;
        return result;
    }

    public static void main(String[] args) {
        double result = average(4, 3, 6, 1);
        System.out.println("Average: " + result);

    }
}
