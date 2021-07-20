
public class Main {

    public static void main(String[] args) {

        // Try out your class here
        Message newMessage = new Message("Torch", "Can't go tonight");
        MessagingService messages = new MessagingService();
        
        messages.add(newMessage);
        System.out.println(messages.getMessages());        
    }
}
