
import java.util.ArrayList;
import java.util.Random;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Ainis
 */
public class JokeManager {

    private ArrayList<String> jokes;

    public JokeManager() {

        this.jokes = new ArrayList<>();
    }

    public void addJoke(String joke) {
        this.jokes.add(joke);
    }

    public String drawJoke() {
        Random draw = new Random();

        if (!this.jokes.isEmpty()) {
            int index = draw.nextInt(this.jokes.size());
            return (this.jokes.get(index));
        } else {
            return ("Jokes are in short supply.");
        }

    }

    public void printJokes() {
        for (String jokes : this.jokes) {
            System.out.println(jokes);
        }
    }
}
