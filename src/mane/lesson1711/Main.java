package mane.lesson1711;

import mane.lesson1211.NextThread;

/*
нужно сделать склад в чистом поле ( военный госпиталь )
макс вместимость 10 человек
при этом существует 2 спец службы:
ритуальные услуги  и   скорая помощь
реализовать бизнеслогику таким образом, что бы в госпиталь
машина скорой помощи сможет доставить из города 20 пациентов, при этом мы знаем,
что ритуальные услуги заберут 18 человек ( многопоточность )
 ( должно быть 2 потока в каждом по параметру дублирующему  это значение передается в конструктор потока )
 */
public class Main {
    public static void main(String[] args) {

        Palata palata=new Palata();
        Ambulance ambulance=new Ambulance(palata);
        Ritual ritual=new Ritual(palata);
        new Thread(ambulance).start();
        new  Thread(ritual).start();

    }
}
