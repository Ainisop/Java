
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
public class Hold {

    private int maxWeight;
    private ArrayList<Suitcase> holdCase;

    public Hold(int maxWeight) {
        this.maxWeight = maxWeight;
        this.holdCase = new ArrayList<>();
    }

    public void addSuitcase(Suitcase suitcase) {
        int totalWeight = 0;
        for (Suitcase suitcases : holdCase) {
            totalWeight += suitcases.totalWeight();
        }
        if ((this.maxWeight - totalWeight) >= suitcase.totalWeight()) {
            this.holdCase.add(suitcase);
        }

    }

    public String toString() {
        int totalWeight = 0;
        for (Suitcase suitcases : holdCase) {
            totalWeight += suitcases.totalWeight();
        }
        return this.holdCase.size() + " suitcases (" + totalWeight + " kg)";
    }

    public void printItems() {
        for (Suitcase suitcases : holdCase) {
            suitcases.printItems();
        }
    }
}
