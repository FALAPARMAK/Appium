package OrangeHrmPractice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.junit.Test;

public class JdbcDemo {

	String dbUrl = "jdbc:oracle:thin:@syntaxdatabase.cdjflmucstpo.us-east-1.rds.amazonaws.com:1521:orcl";

	String dbUsername = "Syntax";

	String dbPassword = "syntax123";

	@Test
	public void dbConnection() throws SQLException {
		// creating connection
		Connection connection = DriverManager.getConnection(dbUrl, dbUsername, dbPassword);

		// create a statement
		Statement statement = connection.createStatement();

		// execute Query and store results from database in ResultSet object
		ResultSet resultSet = statement.executeQuery("Select * from Countries");

		// get values from resultSet
		resultSet.next();
		String columData = resultSet.getString("Country_Name");
		System.out.println(columData);

		// close all db connections
		resultSet.close();
		statement.close();
		connection.close();

		// display in console department id & department name in 1 row

		Connection connection2 = DriverManager.getConnection(dbUrl, dbUsername, dbPassword);
		Statement statement2 = connection2.createStatement();
		ResultSet result = statement2.executeQuery("Select department_id ,department_name from departments");
		while (result.next()) {
			int depId = result.getInt("department_id");
			String depName = result.getString("department_name");

			System.out.println(depId + " " + depName);
		}
		result.close();
		statement.close();
		connection2.close(); 

	}

}
