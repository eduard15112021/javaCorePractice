package mane.dz;

//проверка на нулевые значения со счетчиком

import java.util.Scanner;

public class task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("введите 3 чила"+"\n"+"a = ");
        int a = sc.nextInt();
        System.out.print("b = ");
        int b = sc.nextInt();
        System.out.print("c = ");
        int c = sc.nextInt();
        int i = 0;
        if (a==0) i++;
        if (b==0) i++;
        if (c==0) i++;
        System.out.println("количество введенных нулей равно: "+i );
    }
}
