package OrangeHrmPractice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;

public class Task {

	String dbUrl = "jdbc:oracle:thin:@syntaxdatabase.cdjflmucstpo.us-east-1.rds.amazonaws.com:1521:orcl";

	String dbUsername = "Syntax";

	String dbPassword = "syntax123";
	
	@Test
	public void getResultSetData1() throws SQLException {
		Connection con=DriverManager.getConnection(dbUrl,dbUsername,dbPassword);
		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery("select street_address,city ,country_name from locations join countries on locations.country_id=countries.country_id");
	
		List<Map<String,String>> rsList=new ArrayList<>();
		while(rs.next()) {
			Map<String,String>rsMap=new HashMap<>();
			rsMap.put("street_address",rs.getString("street_address") );
			rsMap.put("city", rs.getString("city"));
			rsMap.put("country_name", rs.getString("country_name"));

			rsList.add(rsMap);
			
		}
		//System.out.println(rsList);
		
		rs.close();
		st.close();
		con.close();
		
	
	}
	
	@Test
	public void getResultSetData2() throws SQLException {
		Connection con=DriverManager.getConnection(dbUrl, dbUsername,dbPassword);
	    Statement st=con.createStatement();
	
	    String query="Select * from jobs";
	    ResultSet rs=st.executeQuery(query);
	    ResultSetMetaData rsMetaData=rs.getMetaData();
	
	List<Map<String,String>> rsList=new ArrayList<>();
	while(rs.next()) {
		Map<String,String>rsMap=new HashMap<>();
		for(int i=1; i<=rsMetaData.getColumnCount(); i++) {
			rsMap.put(rsMetaData.getColumnName(i), rs.getObject(i).toString());
		}
		rsList.add(rsMap);
	}
	System.out.println(rsList);
	
	}
	
	
	
	
	
	
}
