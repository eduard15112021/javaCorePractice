package mane.dz;

public class task7_1 {
    public static void main(String[] args) {
        int sum = 0;
        for (int i=1;i<=99;i+=2){
            sum+=i;
        }
        System.out.println("сумма нечетных чисел до 100 включительно = "+sum);
    }
}
