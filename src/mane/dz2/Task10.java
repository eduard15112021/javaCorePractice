package mane.dz2;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();
        System.out.println("введите размер массива, обязательно больше 3:");
        int n = sc.nextInt();
        if (n > 3) {
            int[] mass = new int[n];
            ArrayList<Integer> arrayList=new ArrayList<>();
            int counter=0;
            System.out.print("исходный массив: ");
            for (int i = 0; i < n; i++) {
                int num = rd.nextInt(n+1);
                mass[i] = num;
                if (num%2==0){
                    arrayList.add(num);
                }
                System.out.print(mass[i] + " ");
            }
            System.out.print("\n"+"массив состоящий из четных элементов первого: ");
            for (int i=0;i<arrayList.size();i++) System.out.print(arrayList.get(i)+" ");
        }else {
            System.out.println("вы ввели неправильный размер массива");
        }
    }
}
