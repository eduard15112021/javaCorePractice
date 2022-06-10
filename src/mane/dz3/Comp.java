package mane.dz3;


import java.util.Random;
import java.util.Scanner;

class Comp {
    private String proc;
    private String RAM;
    private String hard_d;
    private int livetime;
    Scanner sc=new Scanner(System.in);
    Random rd = new Random();

    public void setComp(String proc, String RAM, String hard_d) {
        this.proc = proc;
        this.RAM = RAM;
        this.hard_d = hard_d;
    }

    public void setLivetime() {
        int i;
        do {
            System.out.println("введите ресурс:");
            i = sc.nextInt();
        }while (i<1);
        livetime = i;
    }

    public String getProc() {
        return proc;
    }

    public String getRAM() {
        return RAM;
    }

    public String getHard_d() {
        return hard_d;
    }

    public int getLivetime() {
        return livetime;
    }

    public void TurnOn() {
        if (livetime == 0) {
            System.out.println("компьютер сгорел, кончился ресурс");
            System.exit(0);
        } else {
            int i;
            do {
                System.out.println("введите 0 или 1");
                i = sc.nextInt();
            }while (i!=0 && i!=1);
            int On = rd.nextInt(2);
            if(i==On/*||i!=On*/){
                System.out.println("компьютер успешно включен");
            }else {
                System.out.println("компьютер сгорел");
                System.exit(0);
            }
        }
    }

    public void TurnOf() {
            int i;
            do {
                System.out.println("введите 0 или 1");
                i = sc.nextInt();
            }while (i!=0 && i!=1);
            int On = rd.nextInt(2);
            if(i==On/*||i!=On*/){
                System.out.println("компьютер успешно выключен");
                livetime--;
            }else {
                System.out.println("компьютер сгорел");
                System.exit(0);
            }
    }
}

