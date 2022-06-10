package mane.lesson1711;

import mane.lesson1211.NextThread;

public class Palata {
    private int num = 0;


    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public synchronized void get() {
        while (num < 1) {
            try {
                wait();
            } catch (InterruptedException e) {
            }
        }
        num--;
        System.out.println("пациент умер, осталось: " + num);
        notify();
        try {
            Thread.sleep(80);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public synchronized void put() {
        while (num > 9) {
            try {
                wait();
            } catch (InterruptedException e) {
            }
        }
        num++;
        System.out.println("Привезли нового пациента, всего: " + num);
        notify();
        try {
            Thread.sleep(80);    /* эти слипы чисто что бы значения были более рандомные */
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

