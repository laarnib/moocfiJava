
import static java.lang.Math.abs;


public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros = euros + cents / 100;
            cents = cents % 100;
        }

        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return this.euros;
    }

    public int cents() {
        return this.cents;
    }

    public String toString() {
        String zero = "";
        if (this.cents < 10) {
            zero = "0";
        }

        return this.euros + "." + zero + this.cents + "e";
    }
    
    // Added by LB
    public Money plus(Money addition) {
        Money newMoney = new Money(this.euros + addition.euros(), 
                                    this.cents + addition.cents());
        return newMoney;
    }
    
    //Added by LB
    public boolean lessThan(Money compared) {
        return (this.euros + this.cents / 100.0) < 
                (compared.euros() + compared.cents() / 100.0); 
    }
    
    //Added by LB
    public Money minus(Money decreaser) {
        int euros;
        int cents;
        
        if (this.lessThan(decreaser)) {
            return (new Money(0,0));
        }
        
        double difference = ((this.euros + this.cents / 100.0) * 100) - 
                    ((decreaser.euros() + decreaser.cents / 100.0) * 100);

        euros = (int)difference / 100;
        cents = (int)difference % 100;

        return (new Money(euros, cents));
    }

}
