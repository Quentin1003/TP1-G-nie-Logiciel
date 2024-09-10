package demo;

import java.util.Objects;

public class Money {
    private int amount;
    private String currency;

    public Money(int amount, String currency){
        this.currency = currency;
        this.amount = amount;
    }

    public int getAmount() {
        return amount;
    }

    public String getCurrency() {
        return currency;
    }

    public Money add(Money m2){
        Money m1 = new Money(this.amount + m2.getAmount(), this.currency);
        return m1;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Money money = (Money) o;
        return amount == money.amount && Objects.equals(currency, money.currency);
    }

    @Override
    public int hashCode() {
        return Objects.hash(amount, currency);
    }
}
