package mane.weeeeeee;

public class Case2 {
    public static void main(String[] args) {
        String st=new String("I like java !!!");
        String st0=new String("java");
        int index = st.indexOf(st0);
        System.out.println(index);
        st0="!!!";
        String temp=new String();
        temp=st.substring(st.length()-st0.length());
        if (st0.equals(temp)){
            System.out.println(temp);
        }
        st=st.replace ('a', 'o');
        System.out.println(st);
    }
}
