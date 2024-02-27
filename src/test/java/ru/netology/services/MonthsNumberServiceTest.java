package ru.netology.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class MonthsNumberServiceTest {
    @ParameterizedTest
    @CsvFileSource(files="src/test/resources/months.csv")
    public void ShouldCalculateNumberOfMonths(int expectedRestMonths,int income,
                                              int expenses, int threshold) {
        MonthsNumberService service = new MonthsNumberService();
        //int income = 100_000;
       // int expenses = 60_000 ;
       // int threshold =150_000;
        //int expectedRestMonths = 2;
        int actualRestMonths =
                MonthsNumberService.numberOfMonths(income, expenses, threshold);
        Assertions.assertEquals(expectedRestMonths, actualRestMonths);
    }
}
