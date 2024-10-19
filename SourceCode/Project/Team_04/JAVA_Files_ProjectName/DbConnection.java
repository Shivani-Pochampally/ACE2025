package interestPack;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;
import java.io.InputStream;

public class DbConnection {
    public static Connection getConnection() throws ClassNotFoundException, SQLException {
    	String url = "jdbc:mysql://localhost:3306/shivani";
        String user = "root";
        String password = "shivani@543##";
        return DriverManager.getConnection(url,user,password);
    }
}
