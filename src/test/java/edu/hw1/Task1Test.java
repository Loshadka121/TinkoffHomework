package edu.hw1;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.*;

class Task1Test {
    Task1 task_1;

    @BeforeEach
    void setUp() {
        task_1 = new Task1();
    }
    @Test
    void minutesToSecondsTest1() {
        String time = "12:34";
        int response = task_1.minutesToSeconds(time);
        Assertions.assertThat(response).isEqualTo(754);
    }

    @Test
    void minutesToSecondsTest2() {
        String time = "00:00";
        int response = task_1.minutesToSeconds(time);
        Assertions.assertThat(response).isEqualTo(0);
    }
    @Test
    void minutesToSecondsTest3() {
        String time = "2b:a4";
        int response = task_1.minutesToSeconds(time);
        Assertions.assertThat(response).isEqualTo(-1);
    }
    @Test
    void minutesToSecondsTest4() {
        String time = "42:194";
        int response = task_1.minutesToSeconds(time);
        Assertions.assertThat(response).isEqualTo(-1);
    }
    @Test
    void minutesToSecondsTest5() {
        String time = "32;47";
        int response = task_1.minutesToSeconds(time);
        Assertions.assertThat(response).isEqualTo(-1);
    }
    @Test
    void minutesToSecondsTest6() {
        String time = "22:94";
        int response = task_1.minutesToSeconds(time);
        Assertions.assertThat(response).isEqualTo(-1);
    }
}
