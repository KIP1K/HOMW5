package ru.netology.stats;

import java.util.stream.IntStream;


//суммa всех продаж
public class StatsService {
    public int totalSales(int[] sales) {
        int totalSales[] = sales;
        int sum = 0;
        for (int i = 0; i < totalSales.length; i++) {
            sum = sum + totalSales[i];
        }


        return sum;
    }

    //средняя сумма продаж в месяц
    public int getAverageSum(int[] sales) {
        int averageSum = totalSales(sales) / 12;
        return averageSum;
    }

    //номер месяца, в котором был пик продаж, то есть осуществлены продажи на максимальную сумму
    public int maxSale(int[] sales) {

        int maxMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) {
                maxMonth = i;
            }
        }

        return maxMonth + 1;
    }

    //номер месяца, в котором был минимум продаж, то есть осуществлены продажи на минимальную сумму
    public int minSale(int[] sales) {

        int minMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) {
                minMonth = i;
            }
        }

        return minMonth + 1;

    }

    //количество месяцев, в которых продажи были ниже среднего
    public int monthBelowAverage(int[] sales) {
        int monthBelow = 0;
        int average = getAverageSum(sales);
        for (int sale : sales) {
            if (average > sale) {
                monthBelow++;
            }
        }


        return monthBelow;

    }

    //количество месяцев, в которых продажи были выше среднего
    public int monthHigherAverage(int[] sales) {
        int monthHigher = 0;
        int average = getAverageSum(sales);
        for (int sale : sales) {
            if (average < sale) {
                monthHigher++;
            }
        }


        return monthHigher;

    }
}
