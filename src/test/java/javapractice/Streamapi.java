package javapractice;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static org.assertj.core.api.Assertions.assertThat;

public class Streamapi {
    @Test
    void 필터_테스트_짝수() {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        List<Integer> evenNumbers = numbers.stream()
                .filter(n -> n % 2 == 0)
                .toList();

        assertThat(evenNumbers).isEqualTo(List.of(2, 4, 6, 8, 10));
    }

    @Test
    void 필터_테스트_길이_3_아닌_이름() {
        List<String> names = List.of("왕건", "이성계", "이방원", "박새로이", "이도");

        List<String> filteredNames = names.stream()
                .filter(name -> name.length() != 3)
                .toList();

        assertThat(filteredNames).isEqualTo(List.of("왕건", "박새로이", "이도"));
    }

    @Test
    void 필터_테스트_두_글자_이씨_이름() {
        List<String> names = List.of("왕건", "이성계", "이방원", "박새로이", "이도");

        List<String> filteredNames = names.stream()
                .filter(name -> name.length() == 2 && name.startsWith("이"))
                .toList();

        assertThat(filteredNames).isEqualTo(List.of("이도"));
    }

    @Test
    void 맵_테스트_제곱() {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5);

        List<Integer> squaredNumbers = numbers.stream()
                .map(n -> n * n)
                .toList();

        assertThat(squaredNumbers).isEqualTo(List.of(1, 4, 9, 16, 25));
    }

    @Test
    void 맵_테스트_할인_적용() {
        List<Integer> 장바구니상품들가격 = List.of(100, 200, 300, 400, 500);

        List<Double> 할인적용된금액목록 = 장바구니상품들가격.stream()
                .map(가격 -> 가격 * 0.9)
                .toList();

        assertThat(할인적용된금액목록).isEqualTo(List.of(90.0, 180.0, 270.0, 360.0, 450.0));
    }

    @Test
    void 맵_테스트_대문자화() {
        List<String> companies = List.of("google", "apple", "netflix");
        List<String> upperCasedCompanies = companies.stream()
                .map(회사명 -> 회사명.toUpperCase())
                .toList();

        /* map()을 사용하는 코드 */

        assertThat(upperCasedCompanies).isEqualTo(List.of("GOOGLE", "APPLE", "NETFLIX"));
    }

    @Test
    void 맵_테스트_짝수_홀수() {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5);

        List<String> evenOddNumbers = numbers.stream()
                .map(n -> {
                    if (n % 2 == 0) return "짝수";
                    else return "홀수";
                }).toList();

        assertThat(evenOddNumbers).isEqualTo(List.of("홀수", "짝수", "홀수", "짝수", "홀수"));
    }

    @Test
    void 필터_맵_테스트1() {
        // given
        List<Integer> prices = Arrays.asList(1000, 25000, 30000, 15000, 5000, 40000);

        // when
        List<Double> discountedPrices = prices.stream()
                .filter(가격 -> 가격 >= 20000)
                .map(가격 -> 가격 * 0.9)
                .toList();

        // then
        assertThat(discountedPrices).hasSize(3);
        assertThat(discountedPrices).isEqualTo(List.of(22500.0, 27000.0, 36000.0));
    }

    @Test
    void 필터_맵_테스트2() {
        // given
        List<String> names = Arrays.asList("Kim", "Park", "Lee", "Choi", "Jung", "Kang");

        // when
        List<String> upperCasedNames = names.stream()
                .filter(name -> name.length() == 4)
                .map(name -> name.toUpperCase())
                .toList();

        // then
        assertThat(upperCasedNames).hasSize(4);
        assertThat(upperCasedNames).isEqualTo(List.of("PARK", "CHOI", "JUNG", "KANG"));
    }
}
