package mane.week9.dz;

public class MyClass {
    private int number;
    private String name;
    private double expirens;

    public MyClass(int number, String name, double expirens) {
        this.number = number;
        this.name = name;
        this.expirens = expirens;
    }

    @Override
    public String toString() {
        return "MyClass{" +
                "number=" + number +
                ", name='" + name + '\'' +
                ", expirens=" + expirens +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        MyClass myClass = (MyClass) o;

        if (number != myClass.number) return false;
        if (Double.compare(myClass.expirens, expirens) != 0) return false;
        return name != null ? name.equals(myClass.name) : myClass.name == null;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = number;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        temp = Double.doubleToLongBits(expirens);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getExpirens() {
        return expirens;
    }

    public void setExpirens(double expirens) {
        this.expirens = expirens;
    }


}
