package ru.netology.stats;

public class StatsService {
    int counter = 0;

    public int summ(int[] salesData) {
        for (int i = 0; i < salesData.length; i++) {
            counter += salesData[i];
        }
        return counter;
    }

    public int averageSales(int[] salesData) {
        int averageSum = 0;
        for (int saleMonth : salesData) {
            averageSum += saleMonth;
        }
        return averageSum / salesData.length;
    }

    public int findMax(int[] salesData) {
        int currentMax = salesData[0];
        for (int salePerMonth : salesData) {
            if (currentMax < salePerMonth) {
                currentMax = salePerMonth;
            }
        }
        return currentMax;

    }

    public int maxSalesMonth(int[] salesData) {
        int max = salesData[0];
        for (int salePerMonth : salesData) {
            if (salePerMonth > max) {
                max = salePerMonth;
            }
        }
        int monthNomber = 0;
        int maxSaleMonth = 0;
        for (int salePerMonth : salesData) {
            monthNomber++;
            if (salePerMonth == max) {
                maxSaleMonth = monthNomber;
            }

        }
        return maxSaleMonth;

    }
    public int minSalesMonth(int[] salesData) {
        int min = salesData[0];
        for (int salePerMonth : salesData) {
            if (salePerMonth < min) {
                min = salePerMonth;
            }
        }
        int monthNomber = 0;
        int minSaleMonth = 0;
        for (int salePerMonth : salesData) {
            monthNomber++;
            if (salePerMonth == min) {
                minSaleMonth = monthNomber;
            }

        }
        return minSaleMonth;

    }
}

