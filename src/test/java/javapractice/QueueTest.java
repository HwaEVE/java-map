package javapractice;

import org.junit.jupiter.api.Test;

import java.util.LinkedList;
import java.util.Queue;

import static org.assertj.core.api.Assertions.assertThat;

public class QueueTest {

    @Test
    void QueueTest() {

        Queue<Integer> queue = new LinkedList<>();

        queue.offer(1);
        queue.offer(2);
        queue.offer(3);

        assertThat(queue.peek()).isEqualTo(1);
        assertThat(queue.poll()).isEqualTo(1);
        assertThat(queue.peek()).isEqualTo(2);
    }
}
