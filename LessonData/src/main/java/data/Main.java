package data;

import com.mysql.cj.conf.ConnectionUrl;

import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;


public class Main {



    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        String url = "jdbc:mysql://localhost:3306/test?serverTimezone=UTC&useSSL=false";
        String username ="root";
        String password = "muhit111";



        try (Connection connection = DriverManager.getConnection(url,username,password);
            Statement statement = connection.createStatement()){
//            statement.executeUpdate("drop table Books");
//                statement.executeUpdate("CREATE TABLE Books (\n" +
//                        "    id int NOT NULL,\n" +
//
//                        "    name varchar(30),\n" +
//
//                        "    PRIMARY KEY (id)\n" +
//                        ");");
          //  statement.executeUpdate("select * from Persons");
           // statement.executeUpdate("INSERT INTO Books (id, name)\n" +
               //     "VALUES (2, 'Anelya');");
            statement.executeUpdate("select * from Books");

        }
    }
}