package com.hw.maxim;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int[] arr = generateRandomArray();

        System.out.println("Зарплаты: ");
        System.out.println(Arrays.toString(arr));

        System.out.println("Задание 1");
        int sum = 0;

        /*
        Через fori:
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        */
        //Через for each:
        for (int i : arr) {
            sum += i;
        }

        String messageSum = String.format("Сумма трат за месяц составила %s рублей", sum);
        System.out.println(messageSum);
        System.out.println("=== === ===");

        System.out.println("Задание 2");
        int min = arr[0];
        int max = arr[0];

        for (int i : arr) {
            if (i < min) {
                min = i;
            }

            if (i > max) {
                max = i;
            }
        }

        String messageMinMax = String.format("Минимальная сумма трат за день составила %s рублей. Максимальная сумма трат за день составила %s рублей", min, max);
        System.out.println(messageMinMax);
        System.out.println("=== === ===");


        System.out.println("Задание 3");
        int sumForAvg = 0;

        for (int i : arr) {
            sumForAvg += i;
        }

        int days = arr.length;
        double avg = (double) sumForAvg / days;

        String messageAvg = String.format("Средняя сумма трат за месяц составила %s рублей", avg);
        System.out.println(messageAvg);
        System.out.println("=== === ===");


        System.out.println("Задание 4");
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};

        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }
        System.out.println();

        /*С использованием дополнительного массива:
        System.out.println("length " + reverseFullName.length);
        char[] correctFullName = new char[reverseFullName.length];
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.println("i = " + i);
            System.out.println("до " + Arrays.toString(correctFullName));
            correctFullName[reverseFullName.length - i - 1] = reverseFullName[i];
            System.out.println("после " + Arrays.toString(correctFullName));
        }
        */
        System.out.println("=== === ===");
    }

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[3];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }
}
