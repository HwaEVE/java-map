package javapractice;

public class Money {

    int value;

    public Money(int value) {
        if (value < 0) {
            throw new IllegalArgumentException("Amount cannot be negative");
        }
        this.value = value;
    }

    public int plus(int money) {
        return value + money;
    }

    public Money plus (Money money) {
        return new Money(money.plus(value));
    }

    public boolean isBiggerThen(Money money) {
        return value >= money.value;
    }

    public Money minus(Money money) {
        return new Money(value - money.value);
    }
}