package rak.javapractice;

import org.assertj.core.internal.Integers;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatRuntimeException;
import static org.assertj.core.api.InstanceOfAssertFactories.throwable;


public class DataStructureFunction {

//    @Test
//    void TestScore() {
//        List<Integer> okn = new ArrayList<>();
//
//        assertThat(getSum(List.of(1, 2, 3, 4))).isEqualTo(10);
//        assertThat(getSum(List.of(7))).isEqualTo(7);
//        assertThat(getSum(List.of())).isEqualTo(0); // 빈 리스트가 주어질 경우 0을 return
//    }
//
//    int getSum(List<Integer> abc) {
//        int a = 0;
//        for (int i = 0; i < abc.size(); i++) {
//            a = abc.get(i) + a;
//        }
//        return a;
//    }
//
//    void TestScore2() {
//        List<Integer> numbers = new ArrayList<>();
//
//        assertThat(getAverage(List.of(1, 2, 3, 4))).isEqualTo(2.5);
//        assertThat(getAverage(List.of(7))).isEqualTo(7.0);
//        assertThat(getAverage(List.of())).isEqualTo(0.0); // 빈 리스트가 주어질 경우 0 return
//    }
//
//    double getAverage(List<Integer> abc) {
//        if(abc.isEmpty()){
//            return 0;
//        }
//        return getSum(abc) / abc.size();
//    }
//
//    int getSum(List<Integer> abcd) {
//        int a = 0;
//        for (int i = 0; i < abcd.size(); i++) {
//            a = abcd.get(i) + a;
//        }
//        return a;
//    }
//
//    void TestScore3() {
//        List<Integer> sss = new ArrayList<>();
//
//        assertThat(findMax(List.of(3, 10, 5, 4, 7))).isEqualTo(10);
//        assertThat(findMax(List.of(7))).isEqualTo(7);
//    }
//
//    int findMax(List<Integer> abcdf) {
//        if (abcdf.isEmpty()){
//         return abcdf.get(0);
//        }
//        int maxcode = abcdf.get(0);
//        for (Integer integer : abcdf) {
//            if (integer >= maxcode) {
//                maxcode = integer;
//            }
//        }
//        return maxcode;
//    }
//
//    @DisplayName("시험 점수에 따라 합격 여부를 올바르게 판단해야 한다")
//    @Test
//    void isPassTest() {
//        assertThat(isPass(List.of(60, 60))).isTrue();
//        assertThat(isPass(List.of(40, 80))).isTrue();
//        assertThat(isPass(List.of(39, 100, 100))).isFalse();
//        assertThat(isPass(List.of(100, 0, 100))).isFalse();
//    }
//
//    boolean isPass(List<Integer> abcdfe) {
//        int sum = 0;
//
//        for (int 총점 : abcdfe) {
//            sum = 총점 + sum;
//        }
//
//        int avg = sum / abcdfe.size();
//
//        for (int i = 0; i < abcdfe.size(); i++) {
//            if (abcdfe.get(i) < 40) {
//                return false;
//            }
//        }
//        return avg >= 60;
//    }
//
//    @Test
//    void isPassTest() {
//        assertThat(getIntegersBetween(1, 5)).isEqualTo(List.of(1, 2, 3, 4, 5));
//        assertThat(getIntegersBetween(-3, 1)).isEqualTo(List.of(-3, -2, -1, 0, 1));
//        assertThat(getIntegersBetween(3, 3)).isEqualTo(List.of(3));
//        assertThat(getIntegersBetween(5, 1)).containsExactlyInAnyOrder(5, 4, 3, 2, 1);
//    }
//
//    List<Integer> getIntegersBetween(int a, int b) {
//        List<Integer> result = new ArrayList<>();
//
//        if (a <= b) {
//            for (int i = a; i <= b; i++) {
//                result.add(i);
//            }
//        } else {
//            for (int i = a; i >= b; i--) {
//                result.add(i);
//            }
//        }
//        return result;
//    }
//
//    @Test
//    void isPassTest() {
//        assertThat(filterPositive(List.of(-1, 2, -3, 4, 0))).isEqualTo(List.of(2, 4));
//        assertThat(filterPositive(List.of(-1, -2, -3))).isEqualTo(List.of());
//        assertThat(filterPositive(List.of())).isEqualTo(List.of());
//    }
//
//    List<Integer> filterPositive(List<Integer> numbers) {
//        List<Integer> positiveNumbers = new ArrayList<>();
//
//        for (int number : numbers) {
//            if (number > 0) {
//                positiveNumbers.add(number);
//            }
//        }
//        return positiveNumbers;
//    }
//
//    @Test
//    void isPassTest() {
//        assertThat(findPassedStudents(List.of(70, 85, 90, 75, 80))).isEqualTo(List.of(85, 90, 80));
//        assertThat(findPassedStudents(List.of(70, 75, 79))).isEqualTo(List.of());
//        assertThat(findPassedStudents(List.of(80, 85, 90))).isEqualTo(List.of(80, 85, 90));
//    }
//    int psssscore = 80;
//
//
//    List<Integer> findPassedStudents(List<Integer> numbers) {
//        List<Integer> passscore = new ArrayList<>();
//    }
}