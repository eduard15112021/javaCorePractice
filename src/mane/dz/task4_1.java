package mane.dz;

import java.util.Scanner;

public class task4_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("введите 2 чиcла"+"\n"+"a = ");
        int a = sc.nextInt();
        int loc = a;
        System.out.print("b = ");
        int b = sc.nextInt();
        if (b>0) {
            for (int i = 1; i < b; i++) {
                a += loc;
            }
        }else if (b<0){
            for (int i = -1; i > b; i--) {
                a += loc;
            }
            a = -a;
        }else {
            a=0;
        }
        if(b<0) {
            System.out.println("произведение: " + loc + "*(" + b + ")=" + a);
        }else {
            System.out.println("произведение: " + loc + "*" + b + "=" + a);
        }
    }
}
