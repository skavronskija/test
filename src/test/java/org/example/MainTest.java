package org.example;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class MainTest {

    Main main = new Main();

    @ParameterizedTest
    @MethodSource("provideMaxProfitTestCases")
    void maxProfit(int expected, int[] prices) {
        assertEquals(expected, main.maxProfit(prices));
    }

    private static Stream<Arguments> provideMaxProfitTestCases() {
        return Stream.of(Arguments.of(35, new int[]{20, 40, 52, 15, 30, 50, 10, 25}),
                         Arguments.of(32, new int[]{20, 40, 52, 15, 30, 45, 10, 25}),
                         Arguments.of(0, new int[]{10, 9, 8, 7, 6, 5, 4, 3, 2, 1}));
    }
}