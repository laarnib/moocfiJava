
public class Main {

    public static void main(String[] args) {
        // test your program here!
        SimpleDate date = new SimpleDate(13, 2, 2015);
        System.out.println("Friday of the examined week is " + date);

        
        SimpleDate newDate = date;
        System.out.println("Friday of the examined week is " + newDate);
        newDate = date.afterNumberOfDays(7);
        System.out.println("Friday of the examined week is " + newDate);
        int week = 1;
        while (week <= 7) {
            System.out.println("Friday after " + week + " weeks is " + newDate);
            newDate = newDate.afterNumberOfDays(7);

            week = week + 1;
        }


        System.out.println("The date after 790 days from the examined Friday is ... try it out yourself!");
        
        SimpleDate today = new SimpleDate(5, 2, 2011);
        System.out.println(today);
        today.advance(5);
        System.out.println(today);
        today.advance();
        System.out.println(today);      
        
        
    }
}
