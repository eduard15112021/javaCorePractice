package mane.dz;

//мат. задачка

public class task2_1 {
    public static void main(String[] args) {
        int i = 2, num = 1;
        while (i<24){
            num*=2;
            System.out.println("через "+(i+1)+" часов количество амеб равно: "+num);
            i+=3;
        }
    }
}
