public class Statistics {
    private int count;
    private int sum = 0;

    public Statistics() {
        // initialize the variable numberCount here
    }

    public void addNumber(int number) {
        // write code here
        this.count++;
        sum += number;

    }

    public int getCount() {
        // write code here
        return this.count;
    }

    public int sum() {
        // write code here
        return sum;

    }

    public double average() {
        // write code here
        if (this.count == 0) {
            return 0.0;
        }

        return (double) this.sum / this.count;
    }

}