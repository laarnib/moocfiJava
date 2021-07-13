/**
 *
 * @author lb123
 */
public class Timer {
    private ClockHand hundredths_seconds;
    private ClockHand seconds;
    
    public Timer() {
        this.hundredths_seconds = new ClockHand(100);
        this.seconds = new ClockHand(60);
    }
    
    public void advance() {
        this.hundredths_seconds.advance();
        
        if (this.hundredths_seconds.value() == 0) {
            this.seconds.advance();
        }
    }
    
    @Override
    public String toString() {
        return this.seconds + ":" + this.hundredths_seconds;
    }
}
