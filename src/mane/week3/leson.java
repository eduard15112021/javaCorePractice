package mane.week3;

import java.util.Random;
import java.util.Scanner;

public class leson {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("введите размер массива");
        Random rd = new Random();
        int n = sc.nextInt();
        ;
        int[] temp = new int[n * n];
        int[][] mass = new int[n][n];
        int num = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                mass[i][j] = rd.nextInt(9);
                temp[num] = mass[i][j];
                num++;
                System.out.print(mass[i][j] + "\t");
            }
            System.out.println();
        }
        int temp1;
        for (int i = 0; i < temp.length - 1; i++) {
            if (temp[i] > temp[i + 1]) {
                temp1 = temp[i];
                temp[i] = temp[i + 1];
                temp[i + 1] = temp1;
            }
        }
        num = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                mass[i][j]=temp[num] ;
                num++;
                System.out.print(mass[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
