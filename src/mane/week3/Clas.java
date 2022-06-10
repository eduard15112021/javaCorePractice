package mane.week3;

public class Clas {
    private int inte;
    protected double doubl;
    public char cha;
    /*default*/ boolean boo;


    public void setDoubl(double doubl) {
        this.doubl = doubl;
    }

    public void setCha(char cha) {
        this.cha = cha;
    }

    public void setBoo(boolean boo) {
        this.boo = boo;
    }

    public char getCha() {
        return cha;
    }

    public boolean isBoo() {
        return boo;
    }

    public double getDoubl() {
        return doubl;
    }

    public int getInte() {
        return inte;
    }

    public void setInte(int inte) {
        this.inte = inte;
    }

    public void calc1(int a, double b, char c, boolean d) {
        System.out.println("инт*дабл " + a * b);
        System.out.println("инт*дабл*чар " + (a * b * (int) c));
        int i;
        if (d) {
            i = 1;
        } else {
            i = 0;
        }
        System.out.println("инт*дабл*чар*бул " + (a * b * (int) c * i));
    }

    public void calc2(int a, double b, char c, boolean d) {
        System.out.println("инт+дабл " + (a + b));
        System.out.println("инт+дабл+чар " + (a + b + (int) c));
        int i;
        if (d) {
            i = 1;
        } else {
            i = 0;
        }
        System.out.println("инт+дабл+чар+бул " + (a + b + (int) c + i));
    }
}
