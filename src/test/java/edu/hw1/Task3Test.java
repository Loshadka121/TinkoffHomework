package edu.hw1;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.*;

class Task3Test {
    Task3 task_3;

    @BeforeEach
    void setUp() {
        task_3 = new Task3();
    }
    @Test
    void isNestableTest1() {
        int[] array_1 = new int[]{1,2,3};
        int[] array_2 = new int[]{0,4};
        boolean response = task_3.isNestable(array_1, array_2);
        Assertions.assertThat(response).isEqualTo(true);
    }
    @Test
    void isNestableTest2() {
        int[] array_1 = new int[]{1,2,3};
        int[] array_2 = new int[]{0, 1, 3, 5};
        boolean response = task_3.isNestable(array_1, array_2);
        Assertions.assertThat(response).isEqualTo(true);
    }
    @Test
    void isNestableTest3() {
        int[] array_1 = new int[]{1,2,3};
        int[] array_2 = new int[]{4};
        boolean response = task_3.isNestable(array_1, array_2);
        Assertions.assertThat(response).isEqualTo(false);
    }
    @Test
    void isNestableTest4() {
        int[] array_1 = new int[]{1,2,3};
        int[] array_2 = new int[]{0};
        boolean response = task_3.isNestable(array_1, array_2);
        Assertions.assertThat(response).isEqualTo(false);
    }
    @Test
    void isNestableTest5() {
        int[] array_1 = new int[]{2};
        int[] array_2 = new int[]{0,4};
        boolean response = task_3.isNestable(array_1, array_2);
        Assertions.assertThat(response).isEqualTo(true);
    }
    @Test
    void isNestableTest6() {
        int[] array_1 = new int[]{1,2,3};
        int[] array_2 = new int[]{};
        boolean response = task_3.isNestable(array_1, array_2);
        Assertions.assertThat(response).isEqualTo(false);
    }
    @Test
    void isNestableTest7() {
        int[] array_1 = new int[]{};
        int[] array_2 = new int[]{0, 4};
        boolean response = task_3.isNestable(array_1, array_2);
        Assertions.assertThat(response).isEqualTo(false);
    }
    @Test
    void isNestableTest8() {
        int[] array_1 = new int[]{};
        int[] array_2 = new int[]{};
        boolean response = task_3.isNestable(array_1, array_2);
        Assertions.assertThat(response).isEqualTo(false);
    }
}
