package mane.dz2;

import java.util.Random;

public class Task7 {
    public static void main(String[] args) {
        Random rd = new Random();
        int[] mass = new int[12];
        int temp = 0, j = 0;
        System.out.print("массив: ");
        for (int i = 0; i < 12; i++) {
            int num = rd.nextInt(16);
            mass[i] = num;
            if (temp <= num) {
                j = i;
                temp = num;
            }
            System.out.print(mass[i] + "\t");
        }
        System.out.println("\n" + "максимальный элемент: " + mass[j] + "\n" + "и индекс его последнего вхождения: " + j);
    }
}
