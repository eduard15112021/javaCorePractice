package mane.dz;

//задание с определением знака числа

import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("введите число:");
        int a = sc.nextInt();
        if (a>0){
            ++a;
            System.out.println("ваше число после инкрементирования: "+a);
        }else if (a<0){
            a=a-2;
            System.out.println("ваше число после уменьшения на 2: "+a);
        }else {
            a=10;
            System.out.println("ваше чиcло было равно 0, а теперь оно стало 10-кой: "+a);
        }
    }
}
