package pro.sky.calculator.service;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class CalculateServiceParamTest {
    private static final int VAL1 = 1 ;
    private static final int VAL2 = 2;
    private static final int VAL3 = -1;
    private static final int VAL4 = -2;
    private static final int CORRECTSUM1 = VAL1 + VAL2;
    private static final int CORRECTSUM2 = VAL3 + VAL4;
    private static final int CORRECTMINUS1 = VAL1 - VAL2;
    private static final int CORRECTMINUS2 = VAL3 - VAL4;
    private static final int CORRECTMULTIPLY1 = VAL1 * VAL2;
    private static final int CORRECTMULTIPLY2 = VAL3 * VAL4;
    private static final float CORRECTDEVIDE1 = (float) VAL1 / VAL2;
    private static final float CORRECTDEVIDE2 = (float) VAL3 / VAL4;


    private final CalculateService out = new CalculateService();

    @Test
    public static Stream<Arguments> provideParamsForSumTests(){
        return Stream.of(
                Arguments.of(VAL1,VAL2, CORRECTSUM1),
                Arguments.of(VAL3,VAL4, CORRECTSUM2)
        );
    }

    @Test
    public static Stream<Arguments> provideParamsForMinusTests(){
        return Stream.of(
                Arguments.of(VAL1,VAL2, CORRECTMINUS1),
                Arguments.of(VAL3,VAL4, CORRECTMINUS2)
        );
    }

    @Test
    public static Stream<Arguments> provideParamsForMultiplyTests(){
        return Stream.of(
                Arguments.of(VAL1,VAL2, CORRECTMULTIPLY1),
                Arguments.of(VAL3,VAL4, CORRECTMULTIPLY2)
        );
    }

    @Test
    public static Stream<Arguments> provideParamsForDevideTests(){
        return Stream.of(
                Arguments.of(VAL1,VAL2, CORRECTDEVIDE1),
                Arguments.of(VAL3,VAL4, CORRECTDEVIDE2)
        );
    }


    @ParameterizedTest
    @MethodSource("provideParamsForSumTests")
    public void shouldCalculateCorrectPlusResult(int inputValue1, int inputValue2, int expectedResult){
        int actualResult =  out.calculatePlus(inputValue1, inputValue2);
        Assertions.assertEquals(actualResult, expectedResult);
    }

    @ParameterizedTest
    @MethodSource("provideParamsForMinusTests")
    public void shouldCalculateCorrectMinusResult(int inputValue1, int inputValue2, int expectedResult){
        int actualResult =  out.calculateMinus(inputValue1, inputValue2);
        Assertions.assertEquals(actualResult, expectedResult);
    }

    @ParameterizedTest
    @MethodSource("provideParamsForMultiplyTests")
    public void shouldCalculateCorrectMultiplyResult(int inputValue1, int inputValue2, int expectedResult){
        int actualResult =  out.calculateMultiply(inputValue1, inputValue2);
        Assertions.assertEquals(actualResult, expectedResult);
    }

    @ParameterizedTest
    @MethodSource("provideParamsForDevideTests")
    public void shouldCalculateCorrectDevideResult(int inputValue1, int inputValue2, float expectedResult){
        float actualResult =  out.calculateDivide(inputValue1, inputValue2);
        Assertions.assertEquals(actualResult, expectedResult);
    }

}
