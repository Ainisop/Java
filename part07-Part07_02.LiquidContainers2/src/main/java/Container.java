
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
public class Container {

    private ArrayList<Integer> name;
    private int first;
    private int second;

    public Container() {
        this.name = name;
        this.first = 0;
        this.second = 0;

    }

    public void start() {
        Scanner scan = new Scanner(System.in);

        while (true) {
            //  System.out.println("Commands:\nAdd amount\nMove amount\nRemove amount");
            System.out.println("First: " + first + "/100");
            System.out.println("Second: " + second + "/100");

            String input = scan.nextLine();

            if (input.equals("quit")) {
                break;

            }

            String[] parts = input.split(" ");
            String command = parts[0];
            int amount = Integer.valueOf(parts[1]);

            if (command.equals("add")) {
                if (amount < 0) {
                    this.first = this.first;
                } else if (this.first + amount >= 100) {
                    this.first = 100;
                } else {
                    this.first = this.first + amount;
                }
            }
            if (command.equals("move")) {
                if (this.first - amount < 0) {
                    this.second = this.second + this.first;
                    if (this.second >= 100) {
                        this.second = 100;
                    }
                    this.first = 0;
                } else if (amount < 0) {
                    this.first = this.first;
                    second = second;
                } else {
                    this.first = this.first - amount;
                    this.second = this.second + amount;
                    if (this.second >= 100) {
                        this.second = 100;
                    }
                }
            }
            if (command.equals("remove")) {
                if (amount > this.second) {
                    this.second = 0;
                } else if (amount <= 0) {
                    this.second = this.second;
                } else {
                    this.second = this.second - amount;
                }

            }
        }

    }

}
