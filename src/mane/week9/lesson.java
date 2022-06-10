package mane.week9;

/*коллекция с 6-ю полями и заполнить ее 15-ю объектами разного собержания
создать возможность, при получении объекта сo стороны клиента, сравнивать и находить
существующие в коллекции объекты с таким же собержимым
реализовать слово одинаковое путем сравнения 4-ех из 8 полей
использовать полиморфизм с 2-мя данными реализациями
 */
class Person {
    private String name;
    private String surname;
    private int age;
    private int weight;
    private String sex;
    private int height;

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                ", sex='" + sex + '\'' +
                ", height=" + height +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Person person = (Person) o;

        if (age != person.age) return false;
        if (weight != person.weight) return false;
        if (height != person.height) return false;
        if (name != null ? !name.equals(person.name) : person.name != null) return false;
        if (surname != null ? !surname.equals(person.surname) : person.surname != null) return false;
        return sex != null ? sex.equals(person.sex) : person.sex == null;
    }


    public Person(String name, String surname, int age, int weight, String sex, int height) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.weight = weight;
        this.sex = sex;
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}

//class Find1 implements equals {




//}

//class Find2  implements equals {



//}


public class lesson {
    public static void main(String[] args) {
        Person person1 = new Person("anel", "the", 15, 50, "w", 160);
        Person person2 = new Person("anel", "the", 15, 50, "m", 150);
        Person person3 = new Person("segsh", "the", 15, 50, "w", 170);
        Person person4 = new Person("aaeh", "the", 15, 50, "m", 190);
        Person person5 = new Person("dr6", "the", 15, 50, "w", 120);
        Person person6 = new Person("anel", "the", 15, 50, "m", 140);
        Person person7 = new Person("anel", "the", 15, 50, "w", 150);
        Person person8 = new Person("anel", "the", 15, 50, "m", 160);
        Person person9 = new Person("anel", "the", 15, 50, "w", 170);
        Person person10 = new Person("anel", "the", 15, 50, "m", 180);
        Person person11 = new Person("anel", "the", 15, 50, "w", 140);
        Person person12 = new Person("anel", "the", 15, 50, "m", 150);
        Person person13 = new Person("anel", "the", 15, 50, "w", 170);
        Person person14 = new Person("anel", "the", 15, 50, "m", 180);
        Person person15 = new Person("anel", "the", 15, 50, "w", 190);
        Person person16 = new Person("anel", "the", 15, 50, "m", 120);


    }
}
