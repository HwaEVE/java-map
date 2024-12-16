package Lottopack;

import java.util.Scanner;

public class Money {

    // 돈을 1000원 단위로 입력받는 메서드
    public static Money inputMoney() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("입금할 돈을 입력하세요 : ");
        int amount = scanner.nextInt();  // 사용자가 입력한 금액
        return new Money(amount);
    }


}
