package mane.dz2;

import java.util.Random;
import java.util.Scanner;

public class Taskmn {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();
        int temp;
        System.out.println("введите размер квадратной матрицы: ");
        int n = sc.nextInt();
        int[][] mass = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                temp = rd.nextInt(51);
                mass[i][j] = temp;
                System.out.print(temp + "\t");
            }
            System.out.println();
        }
        temp = 0;
        for (int i = 0; i < n; i++) {
            if (mass[i][i] % 2 == 0) {
                temp += mass[i][i];
            }
        }
        temp = 0;
        System.out.println("- сумма четных по значению элементов главной диагонали массива: " + temp);
       /* for (int i=0;i<n;i++){
            for(int j=0;j<i+1;j++){
                temp+=mass[i][j];
            }
        }
        System.out.println("сумма всех элементов под главной диагональю (включительно) массива: "+temp);*/
        System.out.print("- нечетные элементы под главной диагональю (включительно) массива: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i + 1; j++) {
                if (mass[i][j] % 2 == 1) System.out.print(mass[i][j] + " ");
            }
        }
        int temp1 = 1;
        temp = 1;
        for (int i = 0; i < n; i++) {
            temp *= mass[i][i];
        }
        int i = 0;
        for (int j = n - 1; j >= 0; j--) {
            temp1 *= mass[i][j];
            i++;
        }

        System.out.println();
        if (temp > temp1) {
            System.out.println("- произведение элементов главной диагонали больше чем -||- побочной: " + temp + " > " + temp1);
        } else if (temp < temp1) {
            System.out.println("- произведение элементов главной диагонали меньше чем -||- побочной: " + temp + " < " + temp1);
        } else {
            System.out.println("- произведение элементов главной диагонали равно -||- побочной: " + temp + " = " + temp1);
        }
        temp = 0;
        for (i = 0; i < n - 1; i++) {
            for (int j = n - 2 - i; j >= 0; j--) {
                if (mass[i][j] % 2 == 0) temp += mass[i][j];
            }
        }
        System.out.println("- сумма четных значений массива выше побочной диаганали (исключая): " + temp);
        for (i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                temp = mass[i][j];
                mass[i][j] = mass[j][i];
                mass[j][i] = temp;
            }
        }
        System.out.println("- транспонированная матрица: ");
        for (i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(mass[i][j]+"\t");
            }
            System.out.println();
        }

    }
}
