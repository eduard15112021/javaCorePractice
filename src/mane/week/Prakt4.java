package mane.week;

//симметрия на аналоговых часах ( переворот числа например 35 на 53 без строк)

public class Prakt4 {
    public static void main(String[] args) {
        int temp=0, temp1=0;
        for (int i=0;i<24;i++){
                temp=i%10;
                temp*=10;
                temp1=i/10;
                temp+=temp1;
            for(int j=0;j<60;j++){
                if (temp==j){
                    System.out.println(i+" : "+j);
                }
            }
        }
    }
}
