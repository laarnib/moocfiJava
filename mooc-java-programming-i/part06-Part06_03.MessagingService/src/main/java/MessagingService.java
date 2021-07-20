/**
 *
 * @author lb123
 */

import java.util.ArrayList;

public class MessagingService {
    private ArrayList<Message> messages;
    
    public MessagingService() {
        this.messages = new ArrayList<>();
    }
    
    public void add(Message message) {
        final int maxCharacters = 280;
        
        if (message.getContent().length() <= maxCharacters) {
            this.messages.add(message);
        }
    }
    
    public ArrayList<Message> getMessages() {
        return this.messages;
    }
}
