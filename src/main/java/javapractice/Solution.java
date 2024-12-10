package javapractice;

import java.util.Stack;

public class Solution {
    boolean solution(String s) {
        boolean answer = true;

        Stack<Character> stack = new Stack<>();

        for (char C : s.toCharArray()){
            if(C == '('){
                stack.push(C);
            } else {

            }
        }


        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("Hello Java");

        return answer;
    }
}
