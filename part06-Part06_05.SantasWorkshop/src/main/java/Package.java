
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
public class Package {
     private ArrayList <Gift> name;
public Package() {
    this.name = new ArrayList<>();
}
public void addGift(Gift gift){
   
    this.name.add(gift);
    int sumWeight = gift.getWeight();
            
}
public int totalWeight(){
    int sumWeight = 0;
    for (Gift gifts : this.name){
    sumWeight = sumWeight + gifts.getWeight();
    }
    return sumWeight;
} 
}
