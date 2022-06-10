package mane.week5.dz;

public class Task1 {
    public static void main(String[] args) {
        String st0 = "hcfajdfxfаfjbfli";
        String st1 = "";
        st1=st0.substring(st0.indexOf('a'),st0.lastIndexOf('b'));
        System.out.println(st0+"\n"+st1);
        st0=st0.replace(st0.charAt(3),st0.charAt(0));
        System.out.println(st0);
    }
}
