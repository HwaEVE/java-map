package javapractice;

public class BankAccount {

    String accountNumber;
    Money balance;
    String owner;


    public BankAccount(String accountNumber, Money balance, String owner) {

        this.accountNumber = accountNumber;
        this.balance = balance;
        this.owner = owner;
    }

    public void deposit(Money money) {
        balance = money.plus(balance);
    }

    public void withdraw(Money money) {
        if (balance.isBiggerThen(money)) {
            balance = balance.minus(money);
        }
    }
}
