package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


//суммa всех продаж
public class StatsServiceTest {

    @Test
    public void shouldSumTotalSale() {
        StatsService service = new StatsService();


        int[] sales = {

                800_000, 1_500_000, 1_300_000, 1_500_000, 1_700_000, 2_000_000, 1_900_000, 2_000_000, 700_000, 1_400_000, 1_400_000, 1_800_000

        };
        int expextedSum = 18_000_000;
        int actualSum = service.totalSales(sales);
        System.out.println(actualSum);

        Assertions.assertEquals(expextedSum, actualSum);
    }

    //средняя сумма продаж в месяц

    @Test
    public void shouldAverageSum() {
        StatsService service = new StatsService();

        int[] sales = {

                800_000, 1_500_000, 1_300_000, 1_500_000, 1_700_000, 2_000_000, 1_900_000, 2_000_000, 700_000, 1_400_000, 1_400_000, 1_800_000

        };
        int expextedAverageSum = 1_500_000;
        int actualSum = service.getAverageSum(sales);

    }

    //номер месяца, в котором был пик продаж, то есть осуществлены продажи на максимальную сумму

    @Test
    public void shouldMaxSaleMounth() {
        StatsService service = new StatsService();

        int[] sales = {

                800_000, 1_500_000, 1_300_000, 1_500_000, 1_700_000, 2_000_000, 1_900_000, 2_000_000, 700_000, 1_400_000, 1_400_000, 1_800_000

        };
        int expextedMaxMounthSale = 8;
        int actualMaxMounthSale = service.maxSale(sales);

    }
    //номер месяца, в котором был минимум продаж, то есть осуществлены продажи на минимальную сумму
    @Test
    public void shouldMinSaleMounth() {
        StatsService service = new StatsService();

        int[] sales = {

                800_000, 1_500_000, 1_300_000, 1_500_000, 1_700_000, 2_000_000, 1_900_000, 2_000_000, 700_000, 1_400_000, 1_400_000, 1_800_000

        };
        int expextedMinMounthSale = 9;
        int actualMinMounthSale = service.minSale(sales);


    }
//количество месяцев, в которых продажи были ниже среднего
    @Test

    public void shouldMinTotalSaleMounth() {
        StatsService service = new StatsService();

        int[] sales = {

                800_000, 1_500_000, 1_300_000, 1_500_000, 1_700_000, 2_000_000, 1_900_000, 2_000_000, 700_000, 1_400_000, 1_400_000, 1_800_000

        };
        int expextedMonthBelowAverage = 5;
        int actualMonthBelowAverage = service.monthBelowAverage(sales);


    }

//количество месяцев, в которых продажи были выше среднего
    @Test

    public void shouldHigherAverageMonth() {
        StatsService service = new StatsService();

        int[] sales = {

                800_000, 1_500_000, 1_300_000, 1_500_000, 1_700_000, 2_000_000, 1_900_000, 2_000_000, 700_000, 1_400_000, 1_400_000, 1_800_000

        };
        int expextedMonthHigherAverage = 5;
        int actualMonthHigherAverage = service.monthHigherAverage(sales);


    }

}
