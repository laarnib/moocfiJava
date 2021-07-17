
public class MainProgram {

    public static void main(String[] args) {
        // test your class here
        Money income = new Money(1200, 50);
        Money expenses = new Money(745, 55);
        
        Money balance = income.minus(expenses);
        
        System.out.println(income);
        System.out.println(expenses);
        System.out.println(balance);
        
        Money extraIncome = new Money(500, 35);
        balance = balance.plus(extraIncome);
        
        System.out.println("========");
        System.out.println(extraIncome);
        System.out.println(balance);
    }
}
