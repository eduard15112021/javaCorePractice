package mane.dz2;

import java.util.Random;
import java.util.Scanner;

public class Task1dop {
    public static void main(String[] args) {
        Random rd = new Random();
        Scanner sc = new Scanner(System.in);
        System.out.println("введите размер массива:");
        int n = sc.nextInt();
        int[] mass = new int[n];
        int temp=1;
        double counter=0;
        for (int i = 0; i < n; i++) {
            int num = rd.nextInt(21);
            mass[i] = num;
            System.out.print(mass[i] + "\t");
        }
        for (int a: mass){
            if (a % 3 == 0 && a!=0){
                temp*=a;
            }
        }
        System.out.println("\n"+"произведение элементов масива кратных 3-ем: "+temp+"\n");
        temp=0;
        for (int i = 0; i < n; i++) {
            if (i%2==0){
             temp++;
             counter+=mass[i];
            }
        }
        counter/=temp;
        System.out.println("среднее арикметическое элементов массива с нечетными номерами: "+counter+"\n");
        System.out.println("введите С: ");
        counter=temp=0;
        int c= sc.nextInt();
        for (int a: mass) {
            if (a>c){
                temp++;
                counter+=a;
            }
        }
        counter/=temp;
        System.out.println("среднее арикметическое элементов массива превышающих С: "+counter+"\n");
        counter=0;
        for (int a: mass) {
            if (a%2==1){
                if(counter!=0){
                    if(counter>a) {
                        counter = a;
                    }
                }else{
                    counter =a;
                }
            }
        }
        System.out.println("найменьшее нечетное число массива: "+counter+"\n");


        counter=0;
        temp=0;
        System.out.println("массив с удаленным каждым 2-ым элементом, остаток заполнил случайными значениями для продолжения работы с массивом");
        for (int i=0;i<n;i++){
            if(temp<n) {
                mass[i] = mass[temp];
            }else {
                mass[i]= rd.nextInt(21);
            }
            temp+=2;
            System.out.print(mass[i]+" ");

            //6-10 доп задания не делал
        }
    }
}
