package mane.dz2;

import java.util.Random;

public class Task8 {
    public static void main(String[] args) {
        Random rd = new Random();
        int[] mass = new int[10];
        int[] mass1 = new int[10];
        double[] mass2 = new double[10];
        int temp = 0;
        System.out.print("массив 1: ");
        for (int i = 0; i < 10; i++) {
            int num = rd.nextInt(10);
            mass[i] = num;
            num = rd.nextInt(10);
            mass1[i] = num;
            mass2[i] = (double) mass[i] / mass1[i];
        }
        for (int i = 0; i < 10; i++) {
            System.out.print(mass[i] + "\t");
        }
        System.out.print("\n" + "массив 2: ");
        for (int i = 0; i < 10; i++) {
            System.out.print(mass1[i] + "\t");
        }
        System.out.print("\n" + "массив 3: ");
        for (int i = 0; i < 10; i++) {
            System.out.print(mass2[i] + "\t");
        }
        System.out.print("\n" + "целые значения из массива 3: ");
        for (int i = 0; i < 10; i++) {
            if (mass2[i] % 1 == 0) {
                System.out.print(mass2[i] + " ");
                temp++;
            }
        }
        System.out.print("\n" + "всего :" + temp);
    }
}
