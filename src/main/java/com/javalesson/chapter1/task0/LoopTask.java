package com.javalesson.chapter1.task0;


import java.io.IOException;
import java.util.Scanner;

/**
 * Создайте программу, которая будет принимать две группы параметров:
 * - количество циклов выполнения программы;
 * - 3 числа a, b, n
 * и выводить на экран последовательность результатов вычисления следующего выражения
 * (a + 2^0*b),(a + 2^0*b + 2^1*b),(a + 2^0*b + 2^1*b + 2^2*b)..., (a+2^0*b + 2^1*b + 2^2*b +...+ 2^(n-1)*b)
 * где ^ обозначает возведение в степень, и эта операция выполняется до умножения.
 *
 * Пример:
 *  Please enter the number of iterations
 *   2
 *  Enter the group of 3 numbers
 *   0 2 10
 *  Output:
 *   2 6 14 30 62 126 254 510 1022 2046
 *  Enter the group of 3 numbers
 *   5 3 5
 *  Output:
 *  8 14 26 50 98
 *
 *  Пример:
 *  a=5, b=3, n=5
 *  (5+2^0*3)=8,(5+2^0*3 + 2^1*3)=14,(5+2^0*3 + 2^1*3 + 2^2*3)=26,(5+2^0*3 + 2^1*3 + 2^2*3 + 2^3*3)=50,
 *  (5+2^0*3 + 2^1*3 + 2^2*3 + 2^3*3 + 2^4*3)=98
 *
 */
public class LoopTask {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int attempt = 3;
        String g = "";

        System.out.println("Введите колличество циклов");
        while(true) {
            g = scanner.nextLine();
            try {
                int t = Integer.parseInt(g);
                break;
            } catch (NumberFormatException e) {
                attempt--;
                System.out.println("Попробуй еще раз. Осталось попыток: " + attempt);
            }
            if (attempt == 0) {
                System.out.println("Fucked up");
                break;
            }
        }

        System.out.println("Введите 3 числа a, b, n");
        attempt = 3;
        while(true) {
            g = scanner.nextLine();
            Scanner buffer = new Scanner(g);
            try {
                int a = buffer.nextInt();
                int b = buffer.nextInt();
                int n = buffer.nextInt();
                break;

            } catch (Exception e) {
                attempt--;
                System.out.println("Попробуй еще раз. Осталось попыток: " + attempt);
            }
            if (attempt == 0) {
                System.out.println("Fucked up");
                break;
            }
        }
        System.out.println("The end");
    }
}
