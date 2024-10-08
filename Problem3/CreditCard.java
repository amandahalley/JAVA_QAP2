package Problem3;

public class CreditCard {
    private Money balance;
    private Money creditLimit;
    private Person owner;

    public CreditCard(Person newCardHolder, Money limit) {
        this.owner = newCardHolder;
        this.creditLimit = new Money(limit); //Uses copy constructor
        this.balance = new Money (0); //initialize balance to be 0

    }

    public Money getBalance() {
        return new Money(balance);
    }

    public Money getCreditLimit() {
        return new Money(creditLimit);
    }

    public String getPersonals() {
        return owner.toString();
    }

    public void charge(Money amount) {
        //Adds amount charged to the balance, if amount charged exceeds the credit limit, print error and no change is made to the balance.
        if (balance.add(amount).compareTo(creditLimit) <= 0 ) {
            balance = balance.add(amount); 
            System.out.println("Charge: " + amount);
        } else {
            System.out.println("Exceeds credit limit");
        }
    }

    //Make payment onto card, subtracts payment amount from balance, print new balance amount
    public void payment(Money amount) {
        balance = balance.subtract(amount);
        System.out.println("Payment: " + amount);
    }
 
}
