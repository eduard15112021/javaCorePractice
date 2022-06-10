package mane.dz;

import java.util.Scanner;

public class task8_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("введите размер треугольника"+"\n"+"a = ");
        int a = sc.nextInt();
        System.out.println("убывающий треугольник:");
        for (int i=0;i<a;i++){
            for (int j=a;j>i;j--){
                System.out.print("*");
            }
            System.out.print("\n");
        }
        System.out.println("возрастающий треугольник:");
        for (int i=a;i>0;i--){
            for (int j=i;j<a+1;j++){
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}
