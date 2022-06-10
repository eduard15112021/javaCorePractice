package mane.dz2;

import java.util.Random;

public class Task6 {
    public static void main(String[] args) {
        Random rd = new Random();
        int[] mass = new int[4];
        boolean temp = true;
        System.out.print("массив: ");
        for (int i = 0; i < 4; i++) {
            int num = rd.nextInt(11);
            mass[i] = num;
            System.out.print(mass[i] + "\t");
        }
        for (int i = 0; i < 3; i++) {
            if (mass[i] > mass[i + 1]) {
                temp = false;
            }
        }
        if (temp) {
            System.out.print("\n" + "массив строго возрастающий");
        } else {
            System.out.print("\n" + "массив не строго возрастающий");
        }
    }
}
