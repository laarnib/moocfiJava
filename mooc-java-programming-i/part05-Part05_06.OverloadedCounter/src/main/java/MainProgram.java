
public class MainProgram {

    public static void main(String[] args) {
        // Test your counter here
        
        Counter countUp = new Counter();
        Counter countDown = new Counter(100);
        countUp.increase();
        System.out.println(countUp.value());
        countUp.increase(5);
        System.out.println(countUp.value());
        countDown.decrease();
        System.out.println(countDown.value());
        countDown.decrease(10);
        System.out.println(countDown.value());
    }
}
