package mane.dz2;

import java.util.Random;
import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();
        System.out.println("введите размер массива:");
        int a = sc.nextInt();
        if (a > 0) {
            int sum1 = 0, sum2 = 0;
            int[] mass = new int[a];
            for (int i = 0; i < a; i++) {
                int num = rd.nextInt(16);
                mass[i] = num;
                System.out.print(mass[i] + " ");
            }
            for (int i = 0; i < a / 2; i++) {
                sum1 += mass[i];
            }
            for (int i = a / 2; i < a; i++) {
                sum2 += mass[i];
            }
            if (sum1 < sum2) {
                System.out.println("\n" + "вторая полонина массива в сумме больше суммы первой половины: " + sum1 + " < " + sum2);
            } else if (sum1 > sum2) {
                System.out.println("\n" + "первая полонина массива в сумме суммы больше второй половины: " + sum1 + " > " + sum2);
            } else {
                System.out.println("\n" + "суммы половин массива равны: " + sum1 + " = " + sum2);
            }
        } else {
            System.out.println("вы ввели неправильный размер массива");
        }
    }
}
