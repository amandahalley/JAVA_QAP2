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
