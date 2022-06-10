//package mane.lesson2611;
//
///*
//при запуске приложения должен быть выбор:  ( проверка, на существование при логине )
//1 - зарегестривоваться (имя, логин, пароль)
//2  - залогиниться  (логин , пароль)
//
//после привет имя
// ( таблица + 1 колонка роль ( юзер или админ ) )
//
// 1 интерфейс dao там методы
// класс реализующий интерфейс ( там же единмственное подключение к бд )
// класс для вывода действий и сканирующий сканер
//
// */
//
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.PreparedStatement;
//import java.util.ArrayList;
//import java.util.List;
//
//public class Main {
//    private static Connection conn;
//    private static final String SQL_INSERT="";
//    private static final String SQL_SELECT="select * from users";
//
//    public static void main(String[] args) throws Exception {
//
//        DbAdapter dbAdapter = new DbAdapter();
//        dbAdapter.connect();
//    }
////    private static void select(){
////        List<User> list = new ArrayList<>();
////        try {
////            PreparedStatement preparedStatement = conn.prepareStatement(SQL_SELECT);
////            while (UserSet.next()){
////                String name =UserSet.getString("NAME");
////                String login =UserSet.getString("LOGIN");
////                String password =UserSet.getString("PASSWORD");
////                int isAdmin =UserSet.getInt("IsAdmin");
////            }
////        }catch (Exception e){
////            e.printStackTrace();
////        }
////    }
//}
