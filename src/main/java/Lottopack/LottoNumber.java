package Lottopack;

import java.util.Random;

public class LottoNumber {
    private Random rand;

    public LottoNumber(Random rand) {
        this.rand = rand;
    }

    public int generateLottoNumber() {
        return rand.nextInt(45) + 1;
    }
}