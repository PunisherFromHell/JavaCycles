package ru.netology.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MonthsNumberServiceTest {
    @Test
    public void ShouldCalculateNumberOfMonths() {
        MonthsNumberService service = new MonthsNumberService();
        int income = 100_000;
        int expenses = 60_000;
        int threshold = 150_000;
        int expectedRestMonths = 2;
        int actualRestMonths =
                MonthsNumberService.numberOfMonths(income, expenses, threshold);
        Assertions.assertEquals(expectedRestMonths, actualRestMonths);
    }
}
