package testconnection;
import java.sql.*;
/**
 *
 * @author ultimatehackers
 */
public class TestConnection {
    public static void main(String []args){
    String url = "jdbc:oracle:thin:@localhost:1521:XE";
    try{
        Class.forName("oracle.jdbc.driver.OracleDriver");
        System.out.println("Driver Loaded");
        Connection con = DriverManager.getConnection(url,"ajay388","1879");
        System.out.println("Connection Established");
    }catch(ClassNotFoundException e){
        System.out.println("Driver Not Loaded");
    }catch(SQLException e){
        System.out.println("Connection Not Established");
    }
    }
}
