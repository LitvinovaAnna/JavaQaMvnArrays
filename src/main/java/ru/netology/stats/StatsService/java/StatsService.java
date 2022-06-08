package ru.netology.stats.StatsService.java;

public class StatsService {
    public int getMinMonth(int[] months) {  // Номер месяца, в котором был минимум продаж
        int minMonth = 0;
        for (int i = 0; i < months.length; i++) {
            if (months[i] < months[minMonth]) {
                minMonth = i;

            }
        }
        return minMonth + 1;
    }

    public int getMaxMonth(int[] months) { // Номер месяца, в котором был пик продаж
        int maxMonth = 0;        //Можете подсказать как вывести последний месяц, в котором был максимальный пик продаж? Пожалуйста
        for (int i = 0; i < months.length; i++) {
            if (months[i] > months[maxMonth]) {
                maxMonth = i;

            }
        }
        return maxMonth + 1;
    }

    public int sumMonths(int[] months) { // сумма всех продаж
        int sum = 0;
        for (int i = 0; i < months.length; i++) {
            sum = sum + months[i];

        }
        return sum;
    }

    public int averageMonths(int[] months) { // Средняя сумма продаж в месяц
        int sum = 0;
        for (int i = 0; i < months.length; i++) {
            sum = sum + months[i];
        }
        int averageMonth = sum / months.length;
        return averageMonth;
    }

    public int monthsWhereSumHigherAverage(int[] months) { // Кол-во месяцев, в которых продажи были выше среднего
        int numbersOfMonths = 0;
        for (int i = 0; i < months.length; i++) {
            if (months[i] > 15) { // 15 взято из прошлого метода, пыталась сослаться на значение averageMonth.AverageMonths, но не получилось
                numbersOfMonths = numbersOfMonths + 1;

            }

        }
        return numbersOfMonths;
    }

    public int monthsWhereSumLowerAverage(int[] months) { // Кол-во месяцев, в которых продажи были ниже среднего
        int numbersOfMonths = 0;
        for (int i = 0; i < months.length; i++) {
            if (months[i] < 15) {
                numbersOfMonths = numbersOfMonths + 1;

            }

        }
        return numbersOfMonths;
    }


}

