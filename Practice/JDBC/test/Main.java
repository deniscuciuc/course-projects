package test;

import java.sql.*;

public class Main {
    /*  Java Database Connectivity with 5 Steps
        Register the Driver class
        Create connection
        Create statement
        Execute queries
        Close connection
    */
    public static void main(String[] args) {
            try {
                Class.forName("com.mysql.jdbc.Driver").newInstance();
                Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/taskmanager", "root", "root");
                Statement statement = connection.createStatement();
                ResultSet executeQuery = statement.executeQuery("select * from users");

                while (executeQuery.next()) {
                    System.out.println(executeQuery.getInt(1) + " " + executeQuery.getString(2));
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
