package mane.week4;

import mane.week3.Clas;

/*2 пакета:
 * 1-ый: класс мэйн psvm, где создаются объекты
 * 2-ой: класс с 4-мя пер-ными разного типа и модификатор доступа
 * придумать способ перемножения и сложения (там где возможно ) с  отоброжением ре-та на экран*/
public class Leson {
    public static void main(String[] args) {
        Clas cl = new Clas();
        cl.setDoubl(15.5);
        cl.setInte(12);
        cl.cha = 'f';
        cl.setBoo(false);
        System.out.println("инт = " + cl.getInte() + ", дабл = " + cl.getDoubl() + ", чар = " + cl.getCha() + ", булеая = " + cl.isBoo());
        cl.calc1(cl.getInte(), cl.getDoubl(), cl.cha, cl.isBoo());
        cl.calc2(cl.getInte(), cl.getDoubl(), cl.cha, cl.isBoo());
    }
}
