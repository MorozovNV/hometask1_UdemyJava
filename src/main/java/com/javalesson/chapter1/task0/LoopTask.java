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
        int t = 0;
        while (true) {
            g = scanner.nextLine();
            try {
                t = Integer.parseInt(g);
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
        for(int i=0; i<t;i++) {
            System.out.println("Введите 3 числа a, b, n");
            attempt = 3;
            int a = 0;
            int b = 0;
            int n = 0;
            while (true) {
                g = scanner.nextLine();
                Scanner buffer = new Scanner(g);
                try {
                    a = buffer.nextInt();
                    b = buffer.nextInt();
                    n = buffer.nextInt();
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
            double result = a;
            System.out.println("Answer: ");
            for (int j = 0; j < n; j++) {
                result += Math.pow(2, j) * b;
                System.out.print(result + " ");
            }
            System.out.println();
        }
            System.out.println("The end");
        scanner.close();
    }
}
