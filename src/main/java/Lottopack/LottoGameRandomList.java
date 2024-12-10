package Lottopack;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;


public class LottoGameRandomList {
    public static List<Integer> generateLottoNumbers() {
        List<Integer> lottoNumbers = new ArrayList<>();
        Random rand = new Random();

        // 1부터 45까지의 숫자 중 6개를 랜덤으로 선택
        while (lottoNumbers.size() < 6) {
            int number = rand.nextInt(45) + 1;
            if (!lottoNumbers.contains(number)) {
                lottoNumbers.add(number);
            }
        }

        // 번호를 오름차순으로 정렬
        Collections.sort(lottoNumbers);
        return lottoNumbers;
    }
}



