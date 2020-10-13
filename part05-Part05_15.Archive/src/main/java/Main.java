
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Archive> archives = new ArrayList<>();
        int i = 0;
        while (true) {

            System.out.println("identifier?(empty will stop)");
            String identifier = scanner.nextLine();

            if (identifier.isEmpty()) {
                break;
            }

            System.out.println("name?(empty will stop)");
            String name = scanner.nextLine();

            if (name.isEmpty()) {
                break;
            }
            Archive newItem = new Archive(identifier, name);
            archives.add(newItem);
            for (Archive archive : archives){
               
                if (archive.equals(newItem)){
                    
                } else
                    archives.add(newItem);
            }

        }
        System.out.println("==Items==");
        for (Archive archive : archives) {

            System.out.println(archive.toString());

        }
    }
}
