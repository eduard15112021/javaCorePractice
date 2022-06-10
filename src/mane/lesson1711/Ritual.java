package mane.lesson1711;

public class Ritual implements Runnable{
    private Palata palata;

    public Ritual(Palata palata) {
        this.palata = palata;
    }

    @Override
    public void run() {
        for (int i = 1; i < 18; i++) {
            palata.get();
        }
    }

}
