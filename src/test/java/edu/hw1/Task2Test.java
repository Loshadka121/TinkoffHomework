package edu.hw1;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.*;

class Task2Test {
    Task2 task_2;

    @BeforeEach
    void setUp() {
        task_2 = new Task2();
    }
    @Test
    void countDigitsTest1() {
        int number = 1012;
        int response = task_2.countDigits(number);
        Assertions.assertThat(response).isEqualTo(4);
    }
    @Test
    void countDigitsTest2() {
        int number = 3;
        int response = task_2.countDigits(number);
        Assertions.assertThat(response).isEqualTo(1);
    }
    @Test
    void countDigitsTest3() {
        int number = 0;
        int response = task_2.countDigits(number);
        Assertions.assertThat(response).isEqualTo(1);
    }
    @Test
    void countDigitsTest4() {
        int number = -12;
        int response = task_2.countDigits(number);
        Assertions.assertThat(response).isEqualTo(2);
    }
}
