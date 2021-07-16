
public class Main {

    public static void main(String[] args) {
        //you can write code here to try out your program
//        SimpleDate birthday1 = new SimpleDate(1, 1, 1988);
//        SimpleDate birthday2 = new SimpleDate(12, 12, 2004);
//        
//        Person torch = new Person("Torch", birthday1, 65, 125);
//        Person jack = new Person("Jack", birthday2, 75, 130);
//        Person cecilia = new Person("Torch", birthday1, 65, 125);
//        
//        System.out.println(torch.equals(cecilia));
        
        SimpleDate date = new SimpleDate(24, 3, 2017);
        SimpleDate date2 = new SimpleDate(23, 7, 2017);

        Person leo = new Person("Leo", date, 62, 9);
        Person lily = new Person("Lily", date2, 65, 8);

        if (leo.equals(lily)) {
            System.out.println("Is this quite correct?");
        }

        Person leoWithDifferentWeight = new Person("Leo", date, 62, 9);

        if (leo.equals(leoWithDifferentWeight)) {
            System.out.println("Is this quite correct?");
        }
        
    }
}
