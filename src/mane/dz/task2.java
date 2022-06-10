package mane.dz;

//проверка на существование треугольника со сторонами a b c

import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        System.out.print("введите стороны треугольника"+"\n"+"а=");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.print("b=");
        int b = sc.nextInt();
        System.out.print("c=");
        int c = sc.nextInt();
        if (a>=b+c || b>=a+c || c>=b+a){
            System.out.println("треугольник с заданными сторонами не может существовать");
        }else {
            System.out.println("треугольник с заданными сторонами возможен");
        }
    }
}
