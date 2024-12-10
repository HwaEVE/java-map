package javapractice;

import org.junit.jupiter.api.Test;

import java.util.Stack;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class StackTest {
    @Test
    void name() {

        Stack<Integer> stack = new Stack<>();

        stack.push(1);
        stack.push(2);
        stack.push(3);

        assertThat(stack.peek()).isEqualTo(3);
        assertThat(stack.pop()).isEqualTo(3);
        assertThat(stack.peek()).isEqualTo(2);
    }
}