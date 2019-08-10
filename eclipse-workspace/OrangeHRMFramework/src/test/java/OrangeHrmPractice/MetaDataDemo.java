package OrangeHrmPractice;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

import org.junit.Test;

public class MetaDataDemo {

	String dbUrl = "jdbc:oracle:thin:@syntaxdatabase.cdjflmucstpo.us-east-1.rds.amazonaws.com:1521:orcl";

	String dbUsername = "Syntax";

	String dbPassword = "syntax123";
	
	@Test
	public void getMetaData() throws SQLException {
		//we are creatindg connection 
		Connection con=DriverManager.getConnection(dbUrl,dbUsername,dbPassword);
		
		DatabaseMetaData dbMetadata=con.getMetaData();
		//print database name
		String dbName=dbMetadata.getDatabaseProductName();
		System.out.println(dbName);
		//______________________________
		
		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery("select * from employees where job_id='IT_PROG'");
		ResultSetMetaData rsMetaData=rs.getMetaData();
		//get total cols
		int colNum=rsMetaData.getColumnCount();
		System.out.println(colNum); 
		
		String colName=rsMetaData.getColumnName(2);
		System.out.println(colName);
		
		System.out.println("----------print all col name----------");
		for(int i=1; i<=colNum; i++) {
			colName=rsMetaData.getColumnName(i);
			System.out.println(colName);
		}
		
		
		
		
		
	}
	
	
	
}
