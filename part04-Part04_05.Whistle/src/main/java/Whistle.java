/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ainis
 */
public class Whistle {

    private String whistle;

    public Whistle(String whistleSound) {
        this.whistle = whistleSound;

    }

    public void sound() {
        System.out.println(this.whistle);
    }
}
