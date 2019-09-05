package sqltest;
import java.util.*;
import java.sql.*;
public class SqlTest {
    public static void main(String []args){
        String url = "jdbc:oracle:thin:@localhost:1521:XE";
        Scanner sc = new Scanner(System.in);
        try{
            Class.forName("oracle.jdbc.driver.OracleDriver");
            System.out.println("Connecting to the DataBase");
            Connection con = DriverManager.getConnection(url,"ajay388","1879");
            System.out.println("Create Statement's");
            Statement stmt = null;
            stmt = con.createStatement();
            System.out.println("Enter The Sql Statement");
            String sql = sc.nextLine();
           // System.out.println(sql);
            ResultSet rs = stmt.executeQuery(sql);
            rs.close();
            stmt.close();
            con.close();
        }catch(ClassNotFoundException e){
        System.out.println("Driver Not Loaded");
        }catch(SQLException e){
            e.printStackTrace();
        }
    }    
}
