package edu.hw1;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.*;

class Task6Test {
    Task6 task_6;

    @BeforeEach
    void setUp() {
        task_6 = new Task6();
    }
    @Test
    void countKTest1() {
        int number = 1234;
        int response = task_6.countK(number);
        Assertions.assertThat(response).isEqualTo(3);
    }
    @Test
    void countKTest2() {
        int number = 1100;
        int response = task_6.countK(number);
        Assertions.assertThat(response).isEqualTo(4);
    }
    @Test
    void countKTest3() {
        int number = 123;
        int response = task_6.countK(number);
        Assertions.assertThat(response).isEqualTo(-1);
    }
    @Test
    void countKTest4() {
        int number = 12345;
        int response = task_6.countK(number);
        Assertions.assertThat(response).isEqualTo(-1);
    }
    @Test
    void countKTest5() {
        int number = 5555;
        int response = task_6.countK(number);
        Assertions.assertThat(response).isEqualTo(-1);
    }
    @Test
    void countKTest6() {
        int number = 6174;
        int response = task_6.countK(number);
        Assertions.assertThat(response).isEqualTo(0);
    }
}
