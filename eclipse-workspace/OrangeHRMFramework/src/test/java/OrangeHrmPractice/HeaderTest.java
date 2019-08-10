package OrangeHrmPractice;

import static io.restassured.RestAssured.given;

import org.junit.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import static org.hamcrest.Matchers.equalTo;
public class HeaderTest {
	
	/*
	 * When I send get request to the 
			  
	 * 
	 */
	@Test
	public void Header() {
	RestAssured.baseURI = "http://pure-ravine-92491.herokuapp.com/syntax";

	Response rsp = given().
			when().
			   get("/api/getAllStudentProfiles");
	rsp.prettyPrint();
	
	rsp.then().assertThat().statusCode(200).
	and().header("Content-Type",equalTo("application/json;charset=UTF-8"));
}
	}
