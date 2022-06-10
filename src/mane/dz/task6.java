package mane.dz;

//выыод большего числа

import java.util.Scanner;

public class task6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("введите 2 чиcла" + "\n" + "a = ");
        int a = sc.nextInt();
        System.out.print("b = ");
        int b = sc.nextInt();
        if (a>b){
            System.out.println("большее число а: "+a);
        }else if (a<b){
            System.out.println("большее число b: "+b);
        }else {
            System.out.println("числа равны: a = "+a+" = b = "+b);
        }
    }
}
