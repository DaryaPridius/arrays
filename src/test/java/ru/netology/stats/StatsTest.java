package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsTest {

    @Test

    public void shouldFindAmount() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 180;
        long actual = service.getSalesAmount(sales);

        Assertions.assertEquals(expected, actual);
    }


    @Test

    public void shouldFindAverageAmount() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 15;
        long actual = service.averageAmount(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void shouldFindMaxMonth() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 8;
        int actual = service.getMaxMonth(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void shouldFindMinMonth() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 9;
        int actual = service.getMinMonth(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldFindMonthsWithLowSales() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;
        int actual = service.getLowSales(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldFindMonthsWithHighSales() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;
        int actual = service.getHighSales(sales);

        Assertions.assertEquals(expected, actual);
    }
}
