package mane.dz2;

import java.util.Random;

public class Task5 {
    public static void main(String[] args) {
        Random rd = new Random();
        int[] mass = new int[5];
        int[] mass1 = new int[5];
        double counter = 0;
        double counter1 = 0;
        System.out.print("1-ый массив: ");
        for (int i = 0; i < 5; i++) {
            int num = rd.nextInt(16);
            mass[i] = num;
            counter += num;
            System.out.print(mass[i] + "\t");
        }
        System.out.print("\n" + "2-ой массив: ");
        for (int i = 0; i < 5; i++) {
            int num = rd.nextInt(16);
            mass1[i] = num;
            counter1 += num;
            System.out.print(mass1[i] + "\t");
        }
        System.out.println();
        counter /= 5;
        counter1 /= 5;
        if (counter > counter1) {
            System.out.println("среднее арикметическое 1-ого массива больше: " + counter + " > " + counter1);
        } else if (counter < counter1) {
            System.out.println("среднее арикметическое 2-ого массива больше: " + counter + " < " + counter1);
        } else {
            System.out.println("среднее арикметическое 2-ух массивов равны: " + counter + " = " + counter1);
        }
    }
}
