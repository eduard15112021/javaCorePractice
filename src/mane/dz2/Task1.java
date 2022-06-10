package mane.dz2;

//массивы

public class Task1 {
    public static void main(String[] args) {
        int[] mass = new int[10];
        int num = 2;
        int i = 0;
        while (num <= 20) {
            mass[i] = num;
            System.out.print(mass[i] + " ");
            i++;
            num += 2;
        }
        System.out.println();
        for (i = 0; i < 10; i++) {
            System.out.println(mass[i]);
        }
    }
}
