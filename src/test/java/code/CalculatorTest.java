package code;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

class CalculatorTest {
    private static Calculator calculator;

    @BeforeAll
    static void beforeAll() {
        calculator = new Calculator();
        System.out.println("BEFORE ALL!!");
    }

    @AfterAll
    static void afterAll() {
        System.out.println("BEFORE ALL!!");
    }

    @Test
    @DisplayName("jabadabadu")
    void testAdd() {
        // given
        int left = 5;
        int right = 7;
        Integer expected = 12;
        // when
        Integer result = calculator.add(left, right);

        // then
        Assertions.assertEquals(expected, result);
    }

    @ParameterizedTest
    @MethodSource(value = "testData")
    void testSubtract(int[] testData) {
        // given, when, then
        Assertions.assertEquals(testData[0], calculator.subtract(testData[1], testData[2]));
    }

    private static int[][] testData() {
        return new int[][]{
                {1, 3, 2},
                {3, 5, 2},
                {5, 7, 2}
        };
    }

}