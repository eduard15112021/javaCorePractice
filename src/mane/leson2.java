package mane;

import java.util.Random;

public class leson2 {
    public static void main(String[] args) {
        Random rd = new Random();
        int[] mass = new int[10];
        for (int i = 0; i < 10; i++) {
            int num = rd.nextInt(20) + 1;
            while (num % 2 != 0) {
                num = rd.nextInt(20) + 1;
            }
            mass[i] = num;
            System.out.print(mass[i] + "\t");
        }
        System.out.println("\n");
        for (int i = 0; i < 10; i++) {
            if (mass[i] <= 10) {
                mass[i]--;
            } else {
                mass[i]++;
            }
            System.out.print(mass[i] + "\t");
        }
    }
}