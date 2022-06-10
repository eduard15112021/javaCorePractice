package mane.dz2;

import java.util.Random;

public class Task3 {
    public static void main(String[] args) {
        Random rd = new Random();
        int[] mass = new int[15];
        int counter = 0;
        for (int i = 0; i < 15; i++) {
            int num = rd.nextInt(100);
            mass[i] = num;
            System.out.print(mass[i] + "\t");
            if (num % 2 == 0) {
                counter++;
            }
        }
        System.out.print("\n" + "ко-во четных чисел: " + counter);
    }
}
