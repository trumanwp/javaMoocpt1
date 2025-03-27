public class Timer {

    private ClockHand hundredths;
    private ClockHand seconds;

    public Timer() {
        this.hundredths = new ClockHand(100);
        this.seconds = new ClockHand(60);
    }

    public void advance() {
        this.hundredths.advance();

        if (this.hundredths.value() == 0) {
            this.seconds.advance();
        }
    }

    // If seconds value is under 10, add a 0 before it

    @Override
    public String toString() {

        String hunVal = "" + this.hundredths.value();
        String secVal = "" + this.seconds.value();

        if (this.hundredths.value() < 10) {
            hunVal = "0" + this.hundredths.value();
        }

        if (this.seconds.value() < 10) {
            secVal = "0" + this.seconds.value();
        }

        return secVal + ":" + hunVal;
    }

}
