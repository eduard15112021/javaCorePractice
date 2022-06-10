package mane.dz;

public class task6_1 {
    public static void main(String[] args) {
        int sum = 0;
        for (int i=2;i<=100;i+=2){
            sum+=i;
        }
        System.out.println("сумма четных чисел до 100 включительно = "+sum);
    }
}
