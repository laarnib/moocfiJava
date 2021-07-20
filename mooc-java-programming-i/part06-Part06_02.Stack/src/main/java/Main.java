
public class Main {

    public static void main(String[] args) {

        // Try out your class here
        Stack books = new Stack();
        
        System.out.println(books.isEmpty());
        System.out.println(books.values());
        books.add("Call of the Wild");
        books.add("Dunes");
        books.add("The Genealogy of Adam and Eve");
        System.out.println(books.isEmpty());
        System.out.println(books.values());
        System.out.println(books.take());
        System.out.println(books.take());
        System.out.println(books.take());
        System.out.println(books.take());
        
        Stack s = new Stack();
        s.add("1");
        s.add("2");
        s.add("3");
        s.add("4");
        s.add("5");

        while (!s.isEmpty()) {
            System.out.println(s.take());
        }
    }
}
