package org.example;

import org.junit.jupiter.api.Test;

class MainTest {

    @Test
    void test() {
        Main main = new Main();
        assert main.test() == 1;
    }
}