package Lottopack;

import java.util.HashSet;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class LottoNumbers {
    public static List<Integer> lottoNumbersRandomList() {
        HashSet<Integer> lottoNumbers = new HashSet<>();
        Random rand = new Random();

        // 1부터 45까지의 숫자 중 6개를 랜덤으로 선택
        while (lottoNumbers.size() < 6) {
            int number = rand.nextInt(45) + 1;
            lottoNumbers.add(number);
        }

        // 번호를 리스트로 변환하고 오름차순으로 정렬
        List<Integer> sortedNumbers = new ArrayList<>(lottoNumbers);
        Collections.sort(sortedNumbers);
        return sortedNumbers;
    }
}