/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ainis
 */
public class Song {

    private String name;
    private int length;

    public Song(String name, int length) {

        this.name = name;
        this.length = length;

    }

    public String name() {
        this.name = name;
        return name;
    }

    public int length() {
        this.length = length;
        return length;
    }
}
