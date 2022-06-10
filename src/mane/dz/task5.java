package mane.dz;

//ко-во пол-ных и отр-ных чисел в наборе

import java.util.Scanner;

public class task5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("введите 3 чиcла"+"\n"+"a = ");
        int a = sc.nextInt();
        System.out.print("b = ");
        int b = sc.nextInt();
        System.out.print("c = ");
        int c = sc.nextInt();
        int i = 0 ,j = 0;
        if (a>0) i++;
        if (b>0) i++;
        if (c>0) i++;
        if (a<0) j++;
        if (b<0) j++;
        if (c<0) j++;
        System.out.println("ко-во отрицательных чисел в наборе: "+j+"\n"+"ко-во положительных чисел в наборе: "+i);
    }
}
