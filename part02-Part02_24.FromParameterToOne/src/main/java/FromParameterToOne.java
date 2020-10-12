
public class FromParameterToOne {

    public static void main(String[] args) {

        printFromNumberToOne(5);
    }

    public static void printFromNumberToOne(int number) {
        int num = 0;

        while (num < number) {

            System.out.println(number - num);
            num++;
        }

    }
}
