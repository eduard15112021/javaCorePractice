package mane.week5.dz;

import java.util.Random;

class Tranport {
    private String mark;
    private double maxspeed;
    private double cost;

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public double getMaxspeed() {
        return maxspeed;
    }

    public void setMaxspeed(double maxspeed) {
        this.maxspeed = maxspeed;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

public void start(Tranport tranport) throws NoWorks {
    Random rd = new Random();
    int i = rd.nextInt(20)+1;
    if (i%2!=0){
        System.out.println("car "+tranport.getMark()+" started up");
    }else {
        throw new NoWorks("car "+tranport.getMark()+" no started up");
    }
}
}


public class TaskEx {
    public static void main(String[] args) {
       Tranport tr1 = new Tranport();
       Tranport tr2 =new Tranport();
       Tranport tr3 = new Tranport();
       tr1.setMark("audu");
        tr2.setMark("BMV");
        tr3.setMark("Opel");
        try {
            tr1.start(tr1);
        }catch (NoWorks e){
            System.out.println(e.getMessage());
        }
        try {
            tr2.start(tr2);
        }catch (NoWorks e){
            System.out.println(e.getMessage());
        }
        try {
            tr3.start(tr3);
        }catch (NoWorks e){
            System.out.println(e.getMessage());
        }
    }
}
