package mane.lesson2611;

public interface Dao {
    static void connect(){};
    boolean singUp();
    boolean singIn();
    void printForUser(String name);
    void printForAdmin();
    void check(String name,String password);


}
