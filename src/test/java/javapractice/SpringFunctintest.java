package rak.javapractice;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class SpringFunctintest {

    @Test

    void snaketoCamelCase(){
        assertThat(toCamelCase("snake_case")).isEqualTo("snakeCase");
        assertThat(toCamelCase("product_name")).isEqualTo("productName");
        assertThat(toCamelCase("created_at")).isEqualTo("createdAt");
    }

String toCamelCase(String snake){
        int indexofunderscore = snake.indexOf("_");
        String firstPart = snake.substring(0,indexofunderscore);
        String secondpart = snake.substring(indexofunderscore + 1);
        String firstletterofsecondpart = secondpart.substring(0,1).toLowerCase();
        String restofsecondpat = secondpart.substring(1);
        return firstPart.concat(firstletterofsecondpart).concat(restofsecondpat);
}

    @Test

    void isValidIdNumber() {
        assertThat(isValidIdNumber("1234567")).isTrue();
        assertThat(isValidIdNumber("1abcd67")).isFalse();
    }

    boolean isValidIdNumber(String number) {
        for (int i = 0; i < number.length(); i++) {
            if (!Character.isDigit(number.charAt(i))) {
                return false;
            }
        }
        return true;
    }



    @Test

    void isFemale() {
        assertThat(isFemale("1234567")).isFalse(); // 1로 시작. 여성이 아님. false
        assertThat(isFemale("2345678")).isTrue();  // 2로 시작. 여성임. true
        assertThat(isFemale("3456789")).isFalse(); // 3으로 시작. 여성이 아님. false
        assertThat(isFemale("4567890")).isTrue();  // 4로 시작. 여성임. true
    }

    boolean isFemale (String 주민번호) {
        return 주민번호.startsWith("2") || 주민번호.startsWith("4");
    }

    @Test
    void maxTest() {
        assertThat(isValidEmail("doraemon@gmail.com")).isTrue(); // @가 있음. true
        assertThat(isValidEmail("doraemon")).isFalse();          // @가 없음. false
    }

    boolean isValidEmail(String email) {
        return (email.contains("@") == true);
    }

}
