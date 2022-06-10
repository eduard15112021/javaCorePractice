package mane.dz2;

import java.util.Random;

public class Task4 {
    public static void main(String[] args) {
        Random rd = new Random();
        int[] mass = new int[20];
        for (int i = 0; i < 20; i++) {
            int num = rd.nextInt(21);
            mass[i] = num;
            System.out.print(mass[i] + "\t");
        }
        System.out.println();
        for (int i = 0; i < 20; i++) {
            if (i % 2 == 1) {
                mass[i] = 0;
            }
            System.out.print(mass[i] + "\t");
        }
    }
}
