//package mane.lesson2611;
//
//import java.sql.*;
//
//public class DbAdapter {
//    private Connection connection = null;
//    private Statement statement = null;
//    private ResultSet resultSet = null;
//
//    public DbAdapter() { }
//
//    public void connect()
//    {
//        try
//        {
//            connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/a1","root","123456");
//            System.out.println("Database connection established!");
//        }
//        catch(SQLException e) { e.printStackTrace(); }
//    }
//
//    public void disConnect()
//    {
//        try
//        {
//           connection.close();
//            System.out.println("Database connection disconnect!");
//        }
//        catch (Exception e) { e.printStackTrace(); }
//    }
//
//    public Connection getConnection() { return connection; }
//}
//
