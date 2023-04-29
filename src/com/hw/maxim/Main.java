package com.hw.maxim;

import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

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

        /*
        Создайте 2 массива из 5 случайных целых чисел из отрезка [0;5] каждый,
        выведите массивы в консоль в двух отдельных строках.
        Посчитайте среднее арифметическое элементов каждого массива
        и сообщите, для какого из массивов это значение оказалось больше (либо сообщите, что их средние арифметические равны).
        * */

        int[] arr1 = generateRandomArray();
        int[] arr2 = generateRandomArray();

        for (int i : arr1) {
            System.out.print(i + " ");
        }
        System.out.println();

        for (int i : arr2) {
            System.out.print(i + " ");
        }
        System.out.println();

        int sum1 = 0;
        for (int i : arr1) {
            sum1 += i;
        }

        double avg1 = (double) sum1 / arr1.length;
        System.out.println("Среднее певрое: " + avg1);

        int sum2 = 0;
        for (int i : arr2) {
            sum2 += i;
        }

        double avg2 = (double) sum2 / arr2.length;
        System.out.println("Среднее второе: " + avg2);

        if (avg1 == avg2) {
            System.out.println("СА равны");
        } else if (avg1 > avg2) {
            System.out.println("СА первого массива больше");
        } else {
            System.out.println("СА второго массива больше");
        }

        /*
        Создайте массив из 4 случайных целых чисел из отрезка [10;99],
        выведите его на экран в строку.
        Определить и вывести на экран сообщение о том, является ли массив строго возрастающей последовательностью.
        * */

        int[] correct = new int[]{0, 4, 5, 6, 8, 55, 6423, 1246243};
        int[] inCorrect = new int[]{0, 4, 5, 6, 8, 55, 1246243, 6423, -1};

        System.out.println(isRaiseArray(correct));
        System.out.println(isRaiseArray(inCorrect));
    }

    public static boolean isRaiseArray(int[] arr) {
        int min = arr[0];
        for (int i: arr) {
            if (i < min) {
                return false;
            }
        }
        return true;
    }

//    public static void task4() {
//        System.out.println(" 1.5 Массивы 4 задание");
//        int[] arr = new int[4];
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = 10 + ThreadLocalRandom.current().nextInt(99);
//
//        }
//        System.out.println(Arrays.toString(arr));
//
//        int[] arr2 =Arrays.copyOf(arr, arr.length);
//        Arrays.sort(arr2);
//        System.out.println(Arrays.toString(arr2));
//        if (Arrays.equals(arr, arr2)){
//            System.out.println("Массив имеет строгую последовательность");
//        }
//        else{
//            System.out.println("Массив не имеет строгой последовательности");
//        }
//    }

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(5);
        }
        return arr;
    }
}
