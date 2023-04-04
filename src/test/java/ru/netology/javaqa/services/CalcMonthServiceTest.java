package ru.netology.javaqa.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestFactory;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;

public class CalcMonthServiceTest {
    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/money.csv")
    public void threeTest(int expented, int income, int expence, int threshold) {
        CalcMonthService service = new CalcMonthService();
        // int expented = 3;
        int actual = service.calculate(income, expence, threshold);
        Assertions.assertEquals(expented, actual);
    }


    // @Test
    //  public void firstTest () {
    //     CalcMonthService service = new CalcMonthService();
    //    int expected = 3;
    //    int actual = service.calculate(10000, 3000, 20000);
    //    Assertions.assertEquals(expected, actual);
    //}

    // @Test
    // public void TestFirst() {
    //      CalcMonthService service = new CalcMonthService();
    //    int expected = 2;
    //    int actual = service.calculate(100000, 60000, 150000);
    //   Assertions.assertEquals(expected, actual);
    // }
}
