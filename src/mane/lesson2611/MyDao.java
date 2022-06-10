//package mane.lesson2611;
//
////import com.sun.jdi.connect.spi.Connection;
//
//import java.sql.*;
//import java.util.Scanner;
//
//public class MyDao implements Dao{
//    public static Connection connect() throws Exception{
//        Connection conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/a1","root","123456");
//        return conn;
//    }
//
//    @Override
//    public boolean singUp() {
//        try {
//            Scanner scanner = new Scanner(System.in);
//            System.out.println("регистрация");
//            System.out.println("введите имя");
//            String name = scanner.nextLine();
//            System.out.println("введите логин");
//            String login = scanner.nextLine();
//            System.out.println("введите пароль");
//            String password = scanner.nextLine();
//            PreparedStatement preparedStatement1 = connect().prepareStatement("select max(id) ftom users");
//            ResultSet resultSet=preparedStatement1.executeQuery();
//            PreparedStatement preparedStatement = connect().prepareStatement("insert into users(id,Name,Login,Password,IsAdmin) values('','"+name+"','"+login+","+password+","+"");
//        } catch (Exception e) {
//            System.out.println(e);
//        }
//        return false;
//    }
//
//    @Override
//    public boolean singIn() {
//        try {
//            System.out.println("login");
//            System.out.println("insert login");
//            Scanner scanner = new Scanner(System.in);
//            String password = scanner.nextLine();
//            check(login,password);
//            return true;
//        }catch (Exception e){
//            System.out.println(e);
//        }
//        return false;
//    }
//
//    @Override
//    public void printForUser(String name) {
//
//    }
//
//    @Override
//    public void printForAdmin() {
//
//    }
//
//    @Override
//    public void check(String name, String password) {
//
//    }
//}
