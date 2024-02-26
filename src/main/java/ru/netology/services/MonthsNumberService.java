package ru.netology.services;

public class MonthsNumberService {
    public static int numberOfMonths(int income, int expenses, int threshold) {
        int money = 0;
        int count = 0;
        for (int numberOfMonth = 1; numberOfMonth <= 12; numberOfMonth++) {
            if (money >= threshold) {
                count++;
                money = (money - expenses) / 3;
            } else {
                money = money + income - expenses;
            }

        }
        return count;
    }
}



