
public class Statistics {

    private int count;
    private int sum;

    public Statistics() {

        // initialize the variable numberCount here
    }

    public void addNumber(int number) {
        count++;
        this.sum = this.sum + number;

    }

    public int getCount() {
        return count;
    }

    public int sum() {
        return this.sum;
    }

    public double average() {
        if (count > 0) {
            return (double) this.sum / count;
        }
        return 0;

    }
    
}
