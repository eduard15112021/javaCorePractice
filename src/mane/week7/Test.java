package mane.week7;

public class Test {
    public static void main(String[] args) {
        String st1 ="adjtlhfjbjlihadkgbdgadgfueadad";
        String st2="ad";
        int index =0;
        int num=0;
        while(index != -1){
            index = st1.indexOf(st2, index);
            if (index != -1) {
                num++;
                index++;
            }
        }
        System.out.println(num);
    }
}
