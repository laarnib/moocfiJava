
public class Main {

    public static void main(String[] args) {
        // write experimental main programs here
//        PaymentTerminal matsuya = new PaymentTerminal();
//        PaymentCard torchCard = new PaymentCard(10);
//        
//        System.out.println("Initial Balance: " +  torchCard.balance());
//        
//        boolean result = matsuya.eatAffordably(torchCard);
//        System.out.println("there is enough money in the card: " + result);
//        System.out.println("Card Balance: " + torchCard.balance());
//        result = matsuya.eatHeartily(torchCard);
//        System.out.println("there is enough money in the card: " + result);
//        System.out.println("Card Balance: " + torchCard.balance());
//        result = matsuya.eatHeartily(torchCard);
//        System.out.println("there is enough money in the card: " + result);
//        System.out.println("Card Balance: " + torchCard.balance());
//        result = matsuya.eatAffordably(torchCard);
//        System.out.println("there is enough money in the card: " + result);
//        System.out.println("Card Balance: " + torchCard.balance());

//        PaymentTerminal unicafeExactum = new PaymentTerminal();
//        System.out.println(unicafeExactum);
//
//        PaymentCard annesCard = new PaymentCard(2);
//
//        System.out.println("amount of money on the card is " + annesCard.balance() + " euros");
//
//        boolean wasSuccessful = unicafeExactum.eatHeartily(annesCard);
//        System.out.println("there was enough money: " + wasSuccessful);
//
//        unicafeExactum.addMoneyToCard(annesCard, 100);
//
//        wasSuccessful = unicafeExactum.eatHeartily(annesCard);
//        System.out.println("there was enough money: " + wasSuccessful);
//
//        System.out.println("amount of money on the card is " + annesCard.balance() + " euros");
//
//        System.out.println(unicafeExactum);

        PaymentTerminal unicafeExactum = new PaymentTerminal();
        System.out.println(unicafeExactum);

        PaymentCard annesCard = new PaymentCard(2);

        System.out.println("amount of money on the card is " + annesCard.balance() + " euros");

        boolean wasSuccessful = unicafeExactum.eatHeartily(annesCard);
        System.out.println("there was enough money: " + wasSuccessful);
        System.out.println("Card Balance: " + annesCard.balance());
        
        unicafeExactum.addMoneyToCard(annesCard, 100);
        System.out.println("Card Balance: " + annesCard.balance());
        
        wasSuccessful = unicafeExactum.eatHeartily(annesCard);
        System.out.println("there was enough money: " + wasSuccessful);
        System.out.println("Card Balance: " + annesCard.balance());
        
        System.out.println("amount of money on the card is " + annesCard.balance() + " euros");

        System.out.println(unicafeExactum);
        
    }
}

