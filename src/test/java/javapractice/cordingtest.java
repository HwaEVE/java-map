package javapractice;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.HashMap;

import static org.assertj.core.api.Assertions.assertThat;

public class cordingtest {

    public int 나머지가_1이_되는_수_찾기(int n) {
        for (int i = 2; i <= n; i++) {
            if (n % i == 1) {
                return i;
            }
        }
        return 0;
    }

    @Test
    void 나머지가_1이_되는_수_찾기() {
        int 결과1 = 나머지가_1이_되는_수_찾기(10);
        assertThat(결과1).isEqualTo(3);
        int 결과2 = 나머지가_1이_되는_수_찾기(12);
        assertThat(결과2).isEqualTo(11);
    }

    class 완주하지_못한_선수 {
        public String solution(String[] participant, String[] completion) {

            // 참가자 명단을 해쉬맴 작성
            HashMap<String, Integer> map = new HashMap<>();

            //참가자 배열의 이름을 해쉬맵에 추가하여 카운트
            for (String p : participant) {
                map.put(p, map.getOrDefault(p, 0) + 1);
            }

            for (String c : completion) {
                map.put(c, map.get(c) - 1);
            }

            for (String key : map.keySet()) {
                if (map.get(key) != 0) {
                    return key;
                }
            }
            return "";
        }
    }
}