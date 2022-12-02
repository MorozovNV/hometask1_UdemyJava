package com.javalesson.chapter1.task1;

import java.util.Scanner;

/**
 *  Напишите программу которая принимает 3 числовых значения и проверяет, могут ли они быть
 *  сторонами треугольника.
 *  Для ввода значений с консоли Вам понадобится класс Scanner.
 *  <code>Scanner scanner = new Scanner(System.in);</code>
 *  <code>scanner.nextInt();</code>
 */
public class TriangleTask {

    public static void main(String[] args) {
        String g = "";
        int a = 0;
        int b = 0;
        int c = 0;
        int attempt = 3;
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Введите 3 числа a, b, c");
            g = scanner.nextLine();
            if (g.equals("d")) break;

            Scanner buffer = new Scanner(g);
            try {
                a = buffer.nextInt();
                b = buffer.nextInt();
                c = buffer.nextInt();
                if (a + b > c && a + c > b && b + c > a) System.out.println("Подходит");
                else System.out.println("Неподходит");

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
