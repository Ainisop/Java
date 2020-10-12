
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        // You can test your program hereTimer timer = new Timer();
Timer timer = new Timer();
while (true) {
    System.out.println(timer);
    timer.advance();

    try {
        Thread.sleep(10);
    } catch (Exception e) {

    }
}


    }
}
