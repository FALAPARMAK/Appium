package OrangeHrmPractice;

import java.util.LinkedHashMap;
import java.util.Map;



import org.junit.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static  io.restassured.RestAssured.*;

public class createStudent  {
	
	@Test
	public void createStudent(){
	Map<String, Object> map=new LinkedHashMap<>();
	
	map.put("firstName", "Tanya");
	map.put("lastName", "Smith");
	map.put("age", 25);
	map.put("batch", 5);
	map.put("batchStartDate", "2019-09-14");
	map.put("batchEndDate", "2020-03-01");
	map.put("course", "Selenium");
	map.put("attendanceNature", "nj");
	map.put("streetAddress", "123 test");
	map.put("city", "Clifton");
	map.put("state", "NJ");
	map.put("zipCode", "12345");
	
	RestAssured.baseURI = "http://pure-ravine-92491.herokuapp.com/syntax";
	Response rsp=given().accept(ContentType.JSON).headers("Content-Type", "application/json").
	body(map).
	when().
	post("/api/createStudentProfile");
	rsp.then().assertThat().statusCode(201);
	
	rsp.prettyPrint();
	int studentId=rsp.jsonPath().get("id");
	System.out.println(studentId);
	
	Map<String, Object>responseMap=rsp.as(Map.class);
	System.out.println(responseMap);
	
	/*
	 * {
	  "id": 0,
	    "firstName": "July",
	    "lastName": "Jackson",
	    "age": 45,
	    "batch": 5,
	    "batchStartDate": "2019-09-14",
	    "batchEndDate": "2020-03-01",
	    "course": "Selenium",
	    "attendanceNature": "nj",
	    "streetAddress": "123 test",
	    "city": "Clifton",
	    "state": "NJ",
	    "zipCode": "12345"
	}
	 */

	//automate put and delete
	
}@Test
public void PutAndDelete() {
		
	}
}