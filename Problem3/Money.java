package Problem3;

public class Money {
    private long dollars;
    private long cents;

    // Constructor to initialize dollars and cents with a double value
    public Money (double amount) {
        
        if (amount < 0) {               
            dollars = -1; 
            cents = 0;
        } else {
            dollars = (long) amount;
            cents = Math.round((amount - dollars) * 100);
        }
    }

    //Copy constructor - creates a new Money object from copying values of an existing Money object, known as otherObject
    public Money (Money otherObject) {
    this.dollars = otherObject.dollars;
    this.cents = otherObject.cents;
    }

    //Add two money objects
    public Money add(Money otherAmount) {
        long totalCents = (this.dollars * 100 + this.cents) + (otherAmount.dollars * 100 + otherAmount.cents);
        
        return new Money(totalCents / 100);
    }

    //Subtract two money objects
    public Money subtract(Money otherAmount) {
        long totalCents = (this.dollars * 100 + this.cents) - (otherAmount.dollars * 100 + otherAmount.cents);

        return new Money(totalCents / 100);
    }

    //Compare Money amounts
    public int compareTo(Money otherObject) {
        long orginalTotalCents = this.dollars * 100 + this.cents;
        long otherTotalCents = otherObject.dollars * 100 + otherObject.cents;

        return Long.compare(orginalTotalCents, otherTotalCents);
    }


    //Compare two Money objects
    public boolean equals(Money otherObject) {
        return this.dollars == otherObject.dollars && this.cents == otherObject.cents;
    }

    //Format print statement
    public String toString() {
        return String.format("$%d.%02d", dollars, cents);
    }
}
