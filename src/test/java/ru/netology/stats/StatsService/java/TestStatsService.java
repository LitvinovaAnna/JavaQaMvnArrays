package ru.netology.stats.StatsService.java;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.security.PublicKey;

public class TestStatsService {
    int[] months = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
    @Test
    public void minimumMonth() { // ТЕСТ на номер месяца, в котором был МИНИМУМ продаж
        StatsService service = new StatsService();

        int expectedMinMonth = 9;
        int actualMinMonth = service.getMinMonth(months);

        Assertions.assertEquals(expectedMinMonth, actualMinMonth);
    }

    @Test
    public void maximumMonth() { // ТЕСТ на номер месяца, в котором был ПИК продаж
        StatsService service = new StatsService();

        int expectedMaxMonth = 6;
        int actualMaxMonth = service.getMaxMonth(months);

        Assertions.assertEquals(expectedMaxMonth, actualMaxMonth);

    }

    @Test
    public void sumMonths() { //ТЕСТ на сумму всех продаж
        StatsService service = new StatsService();

        int expectedSumMonth = 180;
        int actualSumMonth = service.sumMonths(months);

        Assertions.assertEquals(expectedSumMonth, actualSumMonth);

    }

    @Test
    public void averageMonths() { // ТЕСТ на средняя сумма продаж в месяц
        StatsService service = new StatsService();

        int expectedAverageMonth = 15;
        int actualAverageMonth = service.averageMonths(months);

        Assertions.assertEquals(expectedAverageMonth, actualAverageMonth);

    }

    @Test
    public void monthsWhereSumHigherAverage() { //ТЕСТ Кол-во месяцев, в которых продажи были выше среднего
        StatsService service = new StatsService();

        int expectedNumbersOfMonths = 5;
        int actualNumbersOfMonths = service.monthsWhereSumHigherAverage(months);

        Assertions.assertEquals(expectedNumbersOfMonths, actualNumbersOfMonths);

    }

    @Test
    public void monthsWhereSumLowerAverage() { // ТЕСТ Кол-во месяцев, в которых продажи были ниже среднего
        StatsService service = new StatsService();

        int expectedNumbersOfMonths = 5;
        int actualNumbersOfMonths = service.monthsWhereSumLowerAverage(months);

        Assertions.assertEquals(expectedNumbersOfMonths, actualNumbersOfMonths);
    }
}


