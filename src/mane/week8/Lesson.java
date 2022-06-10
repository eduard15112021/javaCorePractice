package mane.week8;

import java.util.Arrays;
import java.util.List;

/* создать колекцию, в ней люди
 * у каждого: пол, возраст, имя
 * вывести 3 имени мущины которые старше 14, младше 21, имя заканчивается и начинается на "С"
 * пощитать их возраст ( сумма )
 *
 * есть хэшмап ключем значения явлся инты
 * отсортировать в обратном направлении по значению и вывести на экран
 * */
class Person {
    private String sex;
    private int age;
    private String name;

    public Person(String sex, int age, String name) {
        this.sex = sex;
        this.age = age;
        this.name = name;
    }


    public void getPerson(Person person) {
        System.out.println("Name - " + person.getName() + ", age - " + person.getAge() + ", sex - " + person.getSex());
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "sex='" + sex + '\'' +
                ", age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}

public class Lesson {
    public static void main(String[] args) {
        Person person = new Person("m", 20, "chgvkbc");
        Person person1 = new Person("w", 15, "ASDFTY");
        Person person2 = new Person("m", 20, "cghweofc");
        Person person3 = new Person("w", 60, "wifhf");
        Person person4 = new Person("w", 16, "cwege4bc");
        Person person5 = new Person("m", 22, "cerfgfi");
        Person person6 = new Person("m", 17, "cretu5c");
        Person person7 = new Person("m", 15, "c5rtgh5c");
        List<Person> list;
        list = Arrays.asList(person, person1, person2, person3, person4, person5, person6, person7);
        int sum = 0;
        list.stream()
                .filter(s -> s.getSex().equals("m"))
                .filter(s -> s.getAge() > 14)
                .filter(s -> s.getAge() < 21)
                .filter(s -> s.getName().charAt(0) == s.getName().charAt(s.getName().length() - 1))
                .filter(s -> s.getName().charAt(0) == 'c')
                .limit(3)
                .forEach(System.out::println);

    }
}
