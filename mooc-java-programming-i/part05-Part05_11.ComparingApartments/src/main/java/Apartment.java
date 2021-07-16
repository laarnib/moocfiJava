
import static java.lang.Math.abs;


public class Apartment {

    private int rooms;
    private int squares;
    private int pricePerSquare;

    public Apartment(int rooms, int squares, int pricePerSquare) {
        this.rooms = rooms;
        this.squares = squares;
        this.pricePerSquare = pricePerSquare;
    }
       
    public int getTotalArea() {
        return this.squares;
    }
    
    public int getPricePerSquare() {
        return this.pricePerSquare;
    }
    
    public int getRooms() {
        return this.rooms;
    }
    
    public boolean largerThan(Apartment compared) {
        return this.squares > compared.getTotalArea();
    }
    
    public int priceDifference(Apartment compared) {
        return abs(this.getTotalPrice() - compared.getTotalPrice());
    }
    
    public boolean moreExpensiveThan(Apartment compared) {
        return this.getTotalPrice() > compared.getTotalPrice();
    }
    
    public int getTotalPrice() {
        return this.pricePerSquare * this.squares;
    }      
}
