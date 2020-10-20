
import java.util.ArrayList;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ainis
 */
public class UserInterface {

    private TodoList name;
    private Scanner scanner;
    
    public UserInterface(TodoList name, Scanner scanner) {
        this.name = name;
        this.scanner = scanner;
    }

    public void start() {
        while (true) {
            System.out.print("Command: ");
            String command = scanner.nextLine();
            if (command.equalsIgnoreCase("stop")) {
                break;
            } else if (command.equalsIgnoreCase("add")) {
                System.out.print("Add: ");
                String add = scanner.nextLine();
                this.name.add(add);
            } else if (command.equalsIgnoreCase("list")) {
                this.name.print();
            } else if (command.equalsIgnoreCase("remove")) {
                System.out.print("Which one is removed? ");
                int listNumber = Integer.valueOf(scanner.nextLine());
                this.name.remove(listNumber);
            }
        }
    }
}
