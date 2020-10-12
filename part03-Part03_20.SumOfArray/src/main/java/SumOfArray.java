
public class SumOfArray {

    public static void main(String[] args) {
        // You can try the method here
        int[] array = {5, 1, 3, 4, 2};
        System.out.println(sumOfNumbersInArray(array));
    }

    public static int sumOfNumbersInArray(int[] array) {
        int index = 0;
        int numSum = 0;
        while (index < array.length) {
            numSum = numSum + array[index];
            index++;
        }

        return numSum;
    }
}
