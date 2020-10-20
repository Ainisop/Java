
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Ainis
 */
public class Suitcase {

    private ArrayList<Item> items;
    private int weightLimit = 0;

    public Suitcase(int weightLimit) {
        this.items = new ArrayList<>();
        this.weightLimit = weightLimit;

    }

    public void addItem(Item item) {
        int suitcaseWeight = 0;
        for (Item items : this.items) {
            suitcaseWeight += items.getWeight();
        }
        if (this.weightLimit - suitcaseWeight >= item.getWeight()) {

            this.items.add(item);
        }
    }

    public String toString() {
        int suitcaseWeight = 0;
        for (Item items : this.items) {
            suitcaseWeight += items.getWeight();
        }
        if (this.items.isEmpty()) {
            return "no items (" + suitcaseWeight + " kg)";
        }
        if (this.items.size() == 1) {
            return this.items.size() + " item (" + suitcaseWeight + " kg)";
        }

        return this.items.size() + " items (" + suitcaseWeight + " kg)";

    }

    public void printItems() {
        for (Item items : this.items) {
            System.out.println(items);
        }
    }

    public int totalWeight() {
        int suitcaseWeight = 0;
        for (Item items : this.items) {
            suitcaseWeight += items.getWeight();

        }
        return suitcaseWeight;
    }

    public Item heaviestItem() {

        if (this.items.isEmpty()) {
            return null;
        }
        Item heaviestItem = this.items.get(0);
        for (Item items : this.items) {
            if (items.getWeight() > heaviestItem.getWeight()) {
                heaviestItem = items;
            }
        }
        return heaviestItem;
    }
}
