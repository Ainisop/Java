
import java.util.ArrayList;
import java.util.Scanner;
import java.util.HashMap;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ainis
 */
public class TextUI {

    private Scanner scanner;
    private SimpleDictionary setDictionary;

    public TextUI(Scanner scanner, SimpleDictionary setDictionary) {

        this.scanner = scanner;
        this.setDictionary = setDictionary;

    }

    public void start() {

        while (true) {

            System.out.print("Enter a command: ");
            String word = scanner.nextLine();

            if (word.equals("end")) {

                System.out.println("Bye bye!");
                break;
            } else if (word.equals("add")) {

                System.out.print("Word: ");
                String add = scanner.nextLine();
                System.out.print("Translation: ");
                String translation = scanner.nextLine();
                this.setDictionary.add(add, translation);

            } else if (word.equals("search")) {
                System.out.print("To be translated: ");
                String search = scanner.nextLine();
                String translationOfWord = this.setDictionary.translate(search);
                if (translationOfWord == null) {
                    System.out.println("Word " + search + " was not found");
                } else {
                    System.out.println("Translation: " + this.setDictionary.translate(search));
                }
            }

        else {
            System.out.println("Unknown command");
            
        }
    }
}
}
