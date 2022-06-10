package mane.week;

//числа фибоначи:

public class prakt3 {
    public static void main(String[] args) {
        int a=1,b=1,c;
        for (int i=0;i<11;i++){
            c=a+b;
            System.out.print(a+"\t");
            a=b;
            b=c;
        }
    }
}
