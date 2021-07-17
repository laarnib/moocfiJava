public class SimpleDate {

    private int day;
    private int month;
    private int year;
    

    public SimpleDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    // Added by LB
    public SimpleDate() {
        this(0,0,0);
    }
    
    @Override
    public String toString() {
        return this.day + "." + this.month + "." + this.year;
    }

    public boolean before(SimpleDate compared) {
        if (this.year < compared.year) {
            return true;
        }

        if (this.year == compared.year && this.month < compared.month) {
            return true;
        }

        if (this.year == compared.year && this.month == compared.month &&
                 this.day < compared.day) {
            return true;
        }

        return false;
    }
    
    // Added by LB
    // This exercise assumes that each month has 30 days.
    public void advance() {
        // It's the last day of the year
        if (this.month == 12 && this.day == 30) {
            this.day = this.day + 1 - 30;
            this.month = this.month + 1 - 12;
            this.year++;
        }
           
        // Last day of the month but not the year
        else if (this.day == 30) {
            this.day = this.day + 1 - 30;
            this.month = this.month + 1;
        }
        
        // All other days
        else {
            this.day++;
        }          
    }
    // Added by LB
    // Assumes that all months have 30 days
    public void advance(int howManyDays) {        
        // It's the last day of the year
        if (this.month == 12 && (this.day == 30 || (this.day + howManyDays == 30))) {
            this.day = this.day + howManyDays - 30;
            this.month = this.month + 1 - 12;
            this.year++;
        }
           
        // Last day of the month but not the year
        else if (this.day == 30 || (this.day + howManyDays == 30)) {
            this.day = this.day + howManyDays - 30;
            this.month = this.month + 1;
        }
        
        // All other days
        else {
            this.day = this.day + howManyDays;
        }        
    }
    
    public SimpleDate afterNumberOfDays(int days) {  
        SimpleDate newDate = new SimpleDate(this.day, this.month, this.year);
        
        newDate.advance(days);
        
        return newDate;
    }
    
    public boolean hasThirtyOneDays() {
        return this.month == 1 || this.month == 3 || this.month == 5 || 
               this.month == 7 || this.month == 8 || this.month == 10 || 
               this.month == 12;
    }
    
    public boolean isLeapYear() {
        return ((this.year % 4 == 0) || (this.year % 100 == 0 && this.year % 400 == 0));
    }
}