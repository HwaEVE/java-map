package rak.javapractice;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class DataStructure {


    @Test
    void TestScore() {

        ArrayList<Integer> TestScore = new ArrayList<>();

        TestScore.add(80);
        TestScore.add(60);
        TestScore.add(70);
        TestScore.add(100);
        TestScore.add(90);

        int sum = 0;

        for (int 총점 : TestScore) {
            sum = 총점 + sum;
        }

        int avg = sum / TestScore.size();

        int maxscore = TestScore.get(0);

        for (int 최고점수 : TestScore) {
            if (최고점수 > maxscore) {
                maxscore = TestScore.get(0);
            }
        }
        System.out.println(" 최고점수 = " + maxscore);

        int minscore = TestScore.get(0);

        for (int 최고점수 : TestScore) {
            if (최고점수 < minscore) {
                minscore = TestScore.get(0);
            }
        }
        System.out.println(" 최고점수는 = " + minscore);

        int avgThanScore = TestScore.get(0);

        for (int i = 0; i < TestScore.size(); i++) {
            if(TestScore.get(i) >= avg){
                avgThanScore = TestScore.get(i);
            }
        }
        TestScore.add(avgThanScore);
    }
}
