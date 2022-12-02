package com.javalesson.chapter1.task3;


import java.util.Scanner;

/**
 * Напишите программу которая  проверяет введенное с клавиатуры число и говорит
 * является ли данное число палиндромом.
 * Палиндром - это число которое читается одинаково и спереди назад и сзади наперед.
 * Примеры 12321, 45654, 787 и т.д.
 *
 * Дополнительное условие: программа принимает только числа длинной 5 знаков.
 * В случае если было введено число длинной != 5, программа должна выполнить еще
 * одно прохождение цикла и попросить снова ввести значение с клавиатуры.
 * У данной задачи есть разные варианты решения.
 * 1) С помощью конвертации чисел в строки и обратно.
 * 2) Решение с помощью щю использования остатка от деления на 10.
 *
 * Вам нужно выполнить задания двумя способами.
 */
public class PalindromeFinderTask {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String g = "";
        int a;
        int b;
        int attempt = 3;

        while (true) {
            b = 0;
            System.out.println("Введите число или команду d-done");
            g = scanner.nextLine();
            if (g.equals("d")) break;
            Scanner buffer = new Scanner(g);

            try {
                a = buffer.nextInt();
                if (a<=10) {
                    System.out.println("<10");
                    continue;
                }
                for (int i = 0; i < g.length(); i++) {
                    b += (int) ((int) (a%Math.pow(10,i+1))/Math.pow(10,i))*Math.pow(10,g.length()-1-i);
                }
                System.out.println(b);
                if (a==b) System.out.println("Polindrom");
                else System.out.println("Its not a polindrom");
            } catch (Exception e) {
                attempt--;
                System.out.println("Попробуй еще раз. Осталось попыток: " + attempt);
            }
            if (attempt == 0) {
                System.out.println("Fucked up");
                break;
            }
        }
    }
}
