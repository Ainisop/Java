
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
public class Stack {

    private ArrayList<String> value;

    public Stack() {
        this.value = new ArrayList<>();
    }

    public boolean isEmpty() {
        for (String stack : this.value) {
            if (this.value.contains(stack)) {
                return false;
            }
        }
        return true;
    }

    public void add(String value) {
        this.value.add(value);
    }

    public ArrayList<String> values() {
        return this.value;

    }

    public String take() {

        return this.value.remove(this.value.size() - 1);

    }
}
