import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBC {
    public static Connection connection() throws SQLException, ClassNotFoundException {
            Statement stmt;
            Class.forName("com.mysql.jdbc.Driver");
            String url ="jdbc:mysql://localhost:3306/sampleDB";
            Connection con = DriverManager.getConnection(url,"root", "asd@12345");
            return con;
//            stmt = con.createStatement();
//            stmt.executeUpdate("CREATE DATABASE payroll1");
//            stmt.executeUpdate(
//                    "GRANT SELECT,INSERT,UPDATE,DELETE," +
//                            "CREATE,DROP " +
//                            "ON JunkDB.* TO 'root'@'localhost' " +
//                            "IDENTIFIED BY '';");
//            con.close();

    }
}
