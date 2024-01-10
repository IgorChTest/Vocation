package ru.netology;

import ru.netology.rest.services.RestServices;

public class Main {
    public static void main(String[] args) {

        RestServices service = new RestServices();
        int income = 10_000;
        int expenses = 3_000;
        int threshold = 20_000;
        int count = service.calculate(income, expenses, threshold);

        System.out.println(count);

    }
}