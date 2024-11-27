package rak.javapractice;

import org.junit.jupiter.api.Test;

//import static org.assertj.core.api.Assertions.assertThat;

public class MyTest {

    @Test
    void maxTest() {
        System.out.println(calculateArea(3.1));
        System.out.println(calculateArea(3.3, 2.1));
        System.out.println(calculateArea(25.3));
    }

    double v = 0.0;

    double calculateArea(double side) {
        // TODO: 정사각형 면적 계산 로직을 구현하세요.
        v = side * side;

        return v;
    }

    double calculateArea(double length, double width) {
        // TODO: 직사각형 면적 계산 로직을 구현하세요.

        v = length * width;

        return v;
    }

    double calculateArea(double radius, boolean isCircle) {
        // TODO: 원의 면적 계산 로직을 구현하세요. isCircle 매개변수는 오버로딩을 위해 사용됩니다.

        v = (radius * radius) * Math.PI;

        return v;
    }

}
