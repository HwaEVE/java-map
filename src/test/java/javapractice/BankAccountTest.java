package javapractice;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class BankAccountTest {

    @Test
    void 생성테스트() {
        BankAccount 계좌1 = new BankAccount("111-1111-1111", new Money(0), "이효리");
        Assertions.assertThat(계좌1.accountNumber).isEqualTo("111-1111-1111");
        Assertions.assertThat(계좌1.balance).isEqualTo(0);
        Assertions.assertThat(계좌1.owner).isEqualTo("이효리");

        BankAccount 계좌2 = new BankAccount("222-2222-2222", new Money(0), "이지은");
        Assertions.assertThat(계좌2.accountNumber).isEqualTo("222-2222-2222");
        Assertions.assertThat(계좌2.balance).isEqualTo(0);
        Assertions.assertThat(계좌2.owner).isEqualTo("이지은");
    }

    @Test
    void 입출금테스트() {
        BankAccount 계좌1 = new BankAccount("111-1111-1111", new Money(0), "이효리");
        BankAccount 계좌2 = new BankAccount("222-2222-2222", new Money(0), "이지은");



        계좌1.deposit(new Money(1000));
        Assertions.assertThat(계좌1.balance).isEqualTo(1000);

        Money 월급 = new Money(300);
        계좌1.withdraw(new Money(월급));
        계좌2.deposit(new Money(월급));
        Assertions.assertThat(계좌1.balance).isEqualTo(new Money(700));
        Assertions.assertThat(계좌2.balance).isEqualTo(new Money(300));
    }
}
