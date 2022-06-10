package mane.week;

import java.util.Scanner;

public class work {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("введите число");
        int a = sc.nextInt();
        int j=1;
        for (int i=1;i<=a;i++){
            j*=i;
        }
        System.out.println("факториал числа = "+j);
    }
}
