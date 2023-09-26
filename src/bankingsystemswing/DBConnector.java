package bankingsystemswing;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBConnector {

    public static Connection getConnection() throws SQLException, ClassNotFoundException {
      Class.forName("org.sqlite.JDBC");
	//Class.forName("com.mysql.cj.jdbc.Driver");
    //  jdbc:sqlite:sample.db
	//Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/banksystem", "root", "");
	//Connection connection = DriverManager.getConnection("jdbc:derby://home//satyendra//Downloads//testdb; create=true");
      Connection connection = DriverManager.getConnection("jdbc:sqlite:./sample.db");
	System.out.println("Connected To sqlite Database!");
	
	return connection;

    }
}
