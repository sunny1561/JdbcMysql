
import javax.swing.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Properties;

public class Main {

    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/first_schema";
        String user = "root";
        String password = "sunnydevmysql@560";

        // Create a properties object to store user and password
        Properties props = new Properties();
        props.put("user", user);
        props.put("password", password);
try{
    System.out.println("succesfully configure the jdbc connections!");
    Connection connection= DriverManager.getConnection(url,props);

    Statement statement=connection.createStatement();
    ResultSet resultSet=statement.executeQuery("select * from first_table");
    while(resultSet.next()){
        System.out.println(resultSet.getString("Gender"));
    }
}
catch (Exception e){
    e.printStackTrace();
}


        }
}