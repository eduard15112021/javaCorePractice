package mane.dz2;

//игра в крестики нолики консольная

import java.util.Scanner;

public class InterestingTask {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        char[][] mass = new char[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                mass[i][j] = 'H';
                System.out.print("|" + mass[i][j] + "|");
            }
            System.out.println();
        }
        while (flag) {
            boolean o = true, x = true;
            while (x) {
                System.out.println("ходит Х-тик, введите координаты i и j : ");
                int i = sc.nextInt();
                int j = sc.nextInt();
                if (mass[i - 1][j - 1] == 'H') {
                    mass[i - 1][j - 1] = 'X';
                    x = false;
                } else {
                    System.out.println("неверное значение");
                    continue;
                }
            }
            int counter = 0;
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    if (mass[i][j] == 'H') counter++;
                    System.out.print("|" + mass[i][j] + "|");
                }
                System.out.println();
            }
            if (counter == 0) {
                System.out.println("ничья!");
                flag = false;
                continue;
            }
            if ((mass[0][0] == 'X' && mass[1][0] == 'X' && mass[2][0] == 'X') || (mass[0][1] == 'X' && mass[1][1] == 'X' && mass[2][1] == 'X') || (mass[0][2] == 'X' && mass[1][2] == 'X' && mass[2][2] == 'X')
                    || (mass[0][0] == 'X' && mass[0][1] == 'X' && mass[0][2] == 'X') || (mass[1][0] == 'X' && mass[1][1] == 'X' && mass[1][2] == 'X') || (mass[2][0] == 'X' && mass[2][1] == 'X' && mass[2][2] == 'X')
                    || (mass[0][0] == 'X' && mass[1][1] == 'X' && mass[2][2] == 'X') || (mass[0][2] == 'X' && mass[1][1] == 'X' && mass[2][0] == 'X')) {
                System.out.println("выйграл Х-тик");
                flag = false;
                continue;
            }
            while (o) {
                System.out.println("ходит O-ик, введите координаты i и j: ");
                int i = sc.nextInt();
                int j = sc.nextInt();
                if (mass[i - 1][j - 1] == 'H') {
                    mass[i - 1][j - 1] = 'O';
                    o = false;
                } else {
                    System.out.println("неверное значение");
                    continue;
                }
            }
            counter = 0;
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    if (mass[i][j] == 'H') counter++;
                    System.out.print("|" + mass[i][j] + "|");
                }
                System.out.println();
            }
            if (counter == 0) {
                System.out.println("ничья!");
                flag = false;
                continue;
            }
            if ((mass[0][0] == 'O' && mass[1][0] == 'O' && mass[2][0] == 'O') || (mass[0][1] == 'O' && mass[1][1] == 'O' && mass[2][1] == 'O') || (mass[0][2] == 'O' && mass[1][2] == 'O' && mass[2][2] == 'O')
                    || (mass[0][0] == 'O' && mass[0][1] == 'O' && mass[0][2] == 'O') || (mass[1][0] == 'O' && mass[1][1] == 'O' && mass[1][2] == 'O') || (mass[2][0] == 'O' && mass[2][1] == 'O' && mass[2][2] == 'O')
                    || (mass[0][0] == 'O' && mass[1][1] == 'O' && mass[2][2] == 'O') || (mass[0][2] == 'O' && mass[1][1] == 'O' && mass[2][0] == 'O')) {
                System.out.println("выйграл Х-тик");
                flag = false;
            }
        }
    }
}

