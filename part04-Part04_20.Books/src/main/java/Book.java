/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ainis
 */
public class Book {

    private String name;
    private int pages;
    private int publication;

    public Book(String name, int pages, int publication) {
        this.name = name;
        this.pages = pages;
        this.publication = publication;
    }

    public String getName() {
        return this.name;

    }

    public int getPages() {
        return this.pages;

    }

    public int getPublication() {
        return this.publication;

    }

    public String onlyName() {
        return (this.name);

    }

    public String everyThing() {
        return (this.name + ", " + this.pages + " pages, " + this.publication);
    }
    public String nameOnly() {
        return this.name;
    }
}
