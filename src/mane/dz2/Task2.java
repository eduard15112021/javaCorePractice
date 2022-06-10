package mane.dz2;

public class Task2 {
    public static void main(String[] args) {
        int[] mass = new int[50];
        int num = 1;
        int i = 0;
        while (num <= 99) {
            mass[i] = num;
            System.out.print(mass[i] + " ");
            i++;
            num += 2;
        }
        System.out.println();
        for (i = 49; i >= 0; i--) {
            System.out.print(mass[i] + " ");
        }
    }
}
