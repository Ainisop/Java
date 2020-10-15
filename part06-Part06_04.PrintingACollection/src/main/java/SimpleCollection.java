
import java.util.ArrayList;

public class SimpleCollection {

    private String name;
    private ArrayList<String> elements;

    public SimpleCollection(String name) {
        this.name = name;
        this.elements = new ArrayList<>();
    }

    public void add(String element) {
        this.elements.add(element);
    }

    public ArrayList<String> getElements() {
        return this.elements;
    }

    public String toString() {
        String charactersInList = "\n";
        if (elements.isEmpty()) {
            return "The collection " + this.name + " is empty.";
        }
        if (elements.size() == 1){
            for (String element : elements) {
            charactersInList = charactersInList + element + "";
            return "The collection " + this.name + " has " + elements.size() + " element:" + charactersInList;
            }
        }
        for (String element : elements) {
            charactersInList = charactersInList + element + "\n";
            // return "The collection characters has " + elements.size() + " elements:" + "\n" + charactersInList ;

        }
        return "The collection " + this.name + " has " + elements.size() + " elements:" + charactersInList;
    }

}
