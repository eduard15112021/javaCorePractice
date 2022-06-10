package mane.dz;

/*проверка числа на количество цифр и знак*/

import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("введите число");
        int value = sc.nextInt();
        if (value==0){
            System.out.print("вы ввели 0, 1 значное число");
            System.exit(0);
        }
        if(value<0){
            System.out.print("вы ввели отрицательное ");
        }else {
            System.out.print("вы ввели положительное ");
        }
        value = Math.abs(value);
        int lg = (int) Math.log10(value)+1;
        System.out.print(+lg+" значное число.");
    }
}
