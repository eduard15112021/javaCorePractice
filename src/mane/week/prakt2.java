package mane.week;

import java.util.Scanner;

public class prakt2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("введите число");
        int a = sc.nextInt();
        System.out.print("натуральные делители числа: ");
        for (int i=1;i<=a;i++){
            if (a%i==0) System.out.print(i+", ");
        }
    }
}
