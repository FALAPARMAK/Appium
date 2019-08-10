package OrangeHrmPractice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;

public class ProcessResultSet {

	String dbUrl = "jdbc:oracle:thin:@syntaxdatabase.cdjflmucstpo.us-east-1.rds.amazonaws.com:1521:orcl";

	String dbUsername = "Syntax";

	String dbPassword = "syntax123";
	
	@Test
	public void getResultSetData() throws SQLException {
		Connection con=DriverManager.getConnection(dbUrl,dbUsername,dbPassword);
		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery("select first_name,last_name from employees where job_id='IT_PROG'");
		
		List<Map<String,String>> rsList=new ArrayList<>();
		
		while(rs.next()) {
			Map<String,String>rsMap=new HashMap<>();
			rsMap.put("First_name", rs.getString("First_name"));
			rsMap.put("Last_name",rs.getString("Last_name") );
			
			rsList.add(rsMap);
		
		}
		
		System.out.println(rsList);
		rs.close();
		st.close();
		con.close();
		
		
//		select street_address,city ,country_name
//		from locations join countries
//		on locations.country_id=countries.country_id;
//		
		
		
		
		
		
	}
}
