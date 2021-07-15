
public class Main {

    public static void main(String[] args) {
        // write experimental code here to check how your program functions
        HealthStation ymca = new HealthStation();
        
        Person torch = new Person("Torch", 34, 65, 125);
        System.out.println(torch.getName() + " weighs " + ymca.weigh(torch));
        
        ymca.feed(torch);
        ymca.feed(torch);
        ymca.feed(torch);
        
        System.out.println(torch.getName() + " weighs " + ymca.weigh(torch));
        System.out.println(ymca.weighings());
    }
}
