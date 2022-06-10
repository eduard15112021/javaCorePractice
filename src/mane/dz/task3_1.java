package mane.dz;

//мат. задачка

public class task3_1 {
    public static void main(String[] args) {
        int sum=0, i=1;
        while (i<=256){
          sum+=i;
          i*=2;
        }
        System.out.println("сумма 1+2+4+8+...+256="+sum);
    }
}
