package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {
    private  StatsService service = new StatsService();
    private int[] salesData = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};


    @Test
        void summ() {
        int expected = 180;
        int actual = service.summ(salesData);
        assertEquals(expected, actual);
    }

    @Test
    void findMax() {
        int expected = 20;
        int actual = service.findMax(salesData);
        assertEquals(expected, actual);
    }


    @Test
    void averageSales() {
        int expected = 15;
        int actual = service.averageSales(salesData);
        assertEquals(expected, actual);
    }
    @Test
    void returnMaxSalesMonth() {
        int expected = 8;
        int actual = service.maxSalesMonth(salesData);
        assertEquals(expected, actual);
    }
    @Test
    void returnMinSalesMonth() {
        int expected = 9;
        int actual = service.minSalesMonth(salesData);
        assertEquals(expected, actual);
    }
}