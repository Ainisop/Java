
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        ArrayList<Book> books = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Title: ");
            String name = scanner.nextLine();

            if (name.isEmpty()) {
                break;
            }
            System.out.print("Pages: ");
            int pages = Integer.valueOf(scanner.nextLine());
            System.out.print("Publication year: ");
            int publication = Integer.valueOf(scanner.nextLine());

            books.add(new Book(name, pages, publication));

        }
        System.out.println("What information will be printed? ");
        String searchBook = scanner.nextLine();

        for (Book findBook : books) {
            if (searchBook.equals("everything")) {
                System.out.println(findBook.everyThing());
            } else if (searchBook.equals("name")) {
                System.out.println(findBook.nameOnly());
            }
        }

    }

}
