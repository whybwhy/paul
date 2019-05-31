package org.paul.sample;

import org.junit.Test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DBTests {

    // private static final String DRIVER = "com.mysql.jdbc.Driver";
    private static final String DRIVER = "com.mysql.cj.jdbc.Driver";
    private static final String URL = "jdbc:mysql://127.0.0.1:3306/practice?characterEncoding=UTF-8&serverTimezone=UTC&verifyServerCertificate=false&useSSL=false";

    private static final String USER = "whybwhy";
    private static final String PASSWORD = "test2186!";

    @Test
    public void testConnection() throws Exception{

        //Class.forName(DRIVER);
        // https://kyun2.tistory.com/23
        try(Connection con = DriverManager.getConnection(URL, USER, PASSWORD)){
            System.out.println("성공");
            System.out.println(con);
            //Statement statement = con.createStatement();
            //ResultSet resultSet = statement.executeQuery("");

        }catch (Exception e) {
            System.out.println("에러발생");
            e.printStackTrace();
        }
    }

    // https://yenaworldblog.wordpress.com/2018/01/24/java-mysql-%EC%97%B0%EB%8F%99%EC%8B%9C-%EB%B0%9C%EC%83%9D%ED%95%98%EB%8A%94-%EC%97%90%EB%9F%AC-%EB%AA%A8%EC%9D%8C/
}



