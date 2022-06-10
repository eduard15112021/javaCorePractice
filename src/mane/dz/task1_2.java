package mane.dz;

//мат. задачка

public class task1_2 {
    public static void main(String[] args) {
        double dist = 10,a = 10;
        for (int i=0;i<7;i++) {
            a*=1.1;
            dist+=a;
        }
        System.out.println("за 7 дней спортсмен пробежит в сумме: "+dist+" км");
    }
}
