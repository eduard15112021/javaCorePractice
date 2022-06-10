package mane.week6.dz.magazin;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

import static java.util.Collections.reverse;
import static java.util.Collections.sort;


class Product/* implements Comparator<Product>*/{
    private int id;
    private String name;
    private int price;

    public Product(int id, String name, int price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

//    public int compreTo(Product o){
//        //return o.id-id;  -
//        return o.id-id;
//    }
//
//
//    @Override
//    public int compare(Product o1, Product o2) {
//        return 0;
//    }
}

class Shop {
    public ArrayList<Product> getList() {
        return list;
    }

    private ArrayList<Product> list = new ArrayList<>();

    Scanner sc = new Scanner(System.in);

    public void getList(int i) {
        System.out.println(list.get(i).getId() + ", " + list.get(i).getName() + ", " + list.get(i).getPrice());
    }

    public void getAllList() {
        for (Product product1 : list) {
            System.out.println("id: " + product1.getId() + ", name: " + product1.getName() + ", prise: " + product1.getPrice());
        }
    }

    public void setProduct(Product product) {
        boolean flag = true;
        for (Product product1 : list) {
            if (product.getId() == product1.getId()) {
                System.out.println("товар с таким id уже существует");
                flag = false;
            }
        }
        if (flag)
            this.list.add(product);
    }

    public void deleteProduct(int id) {
        boolean flag = true;
        for (Product product1 : list) {
            if (product1.getId() == id) {
                list.remove(product1);
                System.out.println("успешное удаление элемента с id = " + id);
                flag = false;
            }
        }
        if (flag) {
            System.out.println("продукта с id = " + id + " нет в магазине");
        }
    }

    public void changeProduct(int id) {
        boolean flag = true;
        for (Product product1 : list) {
            if (product1.getId() == id) {
                System.out.println("введите новое название:");
                product1.setName(sc.nextLine());
                System.out.println("введите новую цену:");
                product1.setPrice(sc.nextInt());
                flag = false;
            }
        }
        if (flag) {
            System.out.println("продукта с id = " + id + " нет в магазине");
        }
    }

    public void sort1() { //от меньшего к большему
        sort(list, Comparator.comparing(Product::getPrice));
        System.out.println("отсортированный список:");
    }

    public void sort2() { //от большего к меньшему
        sort(list, Comparator.comparing(Product::getPrice));
        reverse(list);
    }
}

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Shop shop = new Shop();
        boolean flag = true;
        while (flag) {
            System.out.println("Выберите действие:" + "\n" + "\t" + "1 - вывод всех товаров" + "\n" + "\t" + "2 - добавление товара"
                    + "\n" + "\t" + "3 - удаление товара" + "\n" + "\t" + "4 - редактирование товара" + "\n" + "\t" + "5 - выход");
            int i = sc.nextInt();
            switch (i) {
                case (1):
                    System.out.println("в каком порядке выводить?" + "\n" + "\t" + "1 - по возрастанию цены" + "\n" + "\t" + "2 - по убыванию цены"
                            + "\n" + "\t" + "3 - по порядку добавлению");
                    int j = sc.nextInt();
                    switch (j) {
                        case (1):
                            shop.sort1();
                            shop.getAllList();
                            break;
                        case (2):
                            shop.sort2();
                            shop.getAllList();
                            break;
                        case (3):
                            shop.getAllList();//это не совсем то что нужно((((
                            break;
                        default:
                            System.out.println("неправильное действие");
                            break;
                    }
                    break;
                case (2):
                    System.out.println("введите id:");
                    int id = sc.nextInt();
                    System.out.println("введите название:");
                    String name = reader.readLine(); //если одинаковый способ ввода неважно сканер или ридер(стринг не вводится)
                    System.out.println("введите цену:");
                    int prise = sc.nextInt();
                    Product product = new Product(id, name, prise);
                    shop.setProduct(product);
                    break;
                case (3):
                    System.out.println("введите id товара для удаления:");
                    id = sc.nextInt();
                    shop.deleteProduct(id);
                    break;
                case (4):
                    System.out.println("введите id товара, который нужно изменить:");
                    id = sc.nextInt();
                    shop.changeProduct(id);
                    break;
                case (5):
                    flag = false;
                    break;
                default:
                    System.out.println("неправильное действие");
                    break;
            }

        }
    }
}
