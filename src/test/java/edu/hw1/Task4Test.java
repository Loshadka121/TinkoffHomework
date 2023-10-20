package edu.hw1;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.*;

class Task4Test {
    Task4 task_4;

    @BeforeEach
    void setUp() {
        task_4 = new Task4();
    }
    @Test
    void fixStringTest1() {
        String str = "abcd";
        String response = task_4.fixString(str);
        Assertions.assertThat(response).isEqualTo("badc");
    }
    @Test
    void fixStringTest2() {
        String str = "abcdf";
        String response = task_4.fixString(str);
        Assertions.assertThat(response).isEqualTo("badcf");
    }
    @Test
    void fixStringTest3() {
        String str = "a";
        String response = task_4.fixString(str);
        Assertions.assertThat(response).isEqualTo("a");
    }
    @Test
    void fixStringTest4() {
        String str = "";
        String response = task_4.fixString(str);
        Assertions.assertThat(response).isEqualTo("");
    }
}
