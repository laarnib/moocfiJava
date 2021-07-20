
public class Main {

    public static void main(String[] args) {
        // use this main method to try out your classes!
        Gift toy = new Gift("Truck", 2);
        Gift book = new Gift("Book", 1);
        
        System.out.println("Gift name: " + toy.getName());
        System.out.println("Gift weight: " + toy.getWeight());
        System.out.println("Gift: " + toy);
        
        Package gifts = new Package();
        gifts.addGift(toy);
        gifts.addGift(book);
        System.out.println(gifts.totalWeight());
    }
}
