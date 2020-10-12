/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ainis
 */
public class Timer {

    private ClockHand milisec;
    private ClockHand second;

    public Timer() {
        this.milisec = new ClockHand(100);
        this.second = new ClockHand(60);

    }

    public void advance() {
        this.milisec.advance();

        if (this.milisec.value() == 0) {
            this.second.advance();

        }
        
    }
    public String toString() {
            return second + ":" + milisec;
        }
}
