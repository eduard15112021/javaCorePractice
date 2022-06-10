package mane.dz;

//склонение слова програмист

import java.util.Scanner;

public class task7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("введите количество програмистов:");
        int a = sc.nextInt();
        int temp = a;
        while (temp>10){
            temp = temp%10;
        }
        if(temp==1){
            System.out.println(a+" программист");
        }else if (temp<5){
            System.out.println(a+" программиста");
        }else {
            System.out.println(a+" программистов");
        }
    }
}
