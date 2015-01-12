package com.raphael.jdbc;

import java.sql.*;

/**
 * Created by Nov on 2015/1/6.
 * 数据库编程
 */
public class JdbcMain {
//    private static final String DRIVER = "com.mysql.jdbc.Driver";
    private static final String URL = "jdbc:mysql://localhost:3306/test";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "*****";
    public static void main(String[] args){
        Connection connection = null;
        Statement statement = null;
        PreparedStatement preparedStatement = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection(URL,USERNAME,PASSWORD);
            statement = connection.createStatement();
            /**************************************************************/

            String  query = "select * from stu where name = 'John'";
            ResultSet resultSet = statement.executeQuery(query);
            while(resultSet.next()){
                System.out.println(resultSet.getString("name")+":"+resultSet.getString("school"));
            }
            resultSet.close();
            /**************************************************************/

            String update = "update stu set school = ? where name = ?";
            preparedStatement = connection.prepareStatement(update);
            preparedStatement.setString(1,"Raphael");
            preparedStatement.setString(2,"Tom");
            preparedStatement.executeUpdate();


            preparedStatement.close();
            statement.close();
            connection.close();


        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}
