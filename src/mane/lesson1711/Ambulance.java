package mane.lesson1711;

public class Ambulance implements Runnable{
    private Palata palata;

    public Ambulance(Palata palata) {
        this.palata = palata;
    }

    @Override
    public void run() {
        for (int i = 1; i < 20; i++) {
            palata.put();
        }
    }
}
