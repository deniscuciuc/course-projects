package test;

import java.sql.*;

public class Main {
    public static void main(String[] args) {
            try {
                Class.forName("com.mysql.jdbc.Driver").newInstance();
                Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/company", "root", "677789Devomatgw!");
                Statement statement = connection.createStatement();
                ResultSet executeQuery = statement.executeQuery("select * from emp");

                while (executeQuery.next()) {
                    System.out.println(executeQuery.getInt(1) + " " + executeQuery.getString(2) + " " + executeQuery.getInt(3));
                }
                connection.close();
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            } catch (SQLException e) {
                e.printStackTrace();
            } catch (InstantiationException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
    }
}
