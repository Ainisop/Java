
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        JokeManager manager = new JokeManager();
        Scanner scanner = new Scanner(System.in);
      //  manager.addJoke("lalala");
      //  manager.addJoke("joke 2");
     //   manager.addJoke("Joke 3");
        
     //   System.out.println(manager.drawJoke());
        UserInterface jokes = new UserInterface(manager, scanner);
       jokes.start();

    }
}
