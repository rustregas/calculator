package pro.sky.calculator.service;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

class CalculateServiceTest {

    private static final int val1 = 1 ;
    private static final int val2 = 2;
    private static final int val3 = -1;
    private static final int val4 = -2;
    private CalculateService calculateService;


    @BeforeEach
    public void setValuesTest(){
        calculateService = new CalculateService();
    }

    @Test
    void calculatePlusTest() {
        int expected = val1 + val2;
        int actual = calculateService.calculatePlus(val1, val2);

        Assertions.assertEquals(expected, actual);

        expected = val3 + val4;
        actual = calculateService.calculatePlus(val3, val4);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void calculateMinusTest() {
        int expected = val1 - val2;
        int actual = calculateService.calculateMinus(val1, val2);

        Assertions.assertEquals(expected, actual);

        expected = val3 - val4;
        actual = calculateService.calculateMinus(val3, val4);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void calculateMultiplyTest() {
        int expected = val1 * val2;
        int actual = calculateService.calculateMultiply(val1, val2);

        Assertions.assertEquals(expected, actual);

        expected = val3 * val4;
        actual = calculateService.calculateMultiply(val3, val4);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void calculateDivideTest() {
        float expected = (float) val1 / val2;
        float actual = calculateService.calculateDivide(val1, val2);

        Assertions.assertEquals(expected, actual);

        expected = (float) val1 / val2;
        actual = calculateService.calculateDivide(val3, val4);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void calculateDivideThrowIllegalArgumentException() {
        int val3 = 0;

        Assertions.assertThrows(IllegalArgumentException.class, ()-> calculateService.calculateDivide(val1, val3));
    }
}