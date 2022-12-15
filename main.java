import java.sql.Connection;
import java.sql.Statement;

public class main {
    public static void main(String[] args)  {
        try {
            Connection con= JDBC.connection();
            Statement statement = con.createStatement();
            statement.execute("INSERT INTO person (name, age, job) VALUES ('mojtaba', 36, 'developer')");
            con.close();
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }



    }
}
