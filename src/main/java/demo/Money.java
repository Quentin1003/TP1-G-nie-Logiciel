package demo;

public class Money {
    private int amount;
    private String currency;

    public Money(int amount, String currency){
        this.currency = currency;
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "Money{" +
                "amount=" + amount +
                ", currency='" + currency + '\'' +
                '}';
    }
}
