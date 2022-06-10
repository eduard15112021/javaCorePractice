package mane.week5;

import java.util.Scanner;

/*
здесь нет полезного кода(
 */

public class Lesson {
    public static void main(String[] args) {
        String st[] = new String[5];
        String temp = new String();
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.println("ведите " + i + "-ую строку:");
            st[i] = sc.nextLine();
            temp = st[i];
            int len = temp.length();
            for (int j = 0; j < len / 2; j++) {

            }
        }
    }
}
