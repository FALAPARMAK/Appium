package OrangeHrmPractice;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class JsonPathTest {
	// retrieve student with id 123 & verify that response status code is 200
	// and first name of a student is Vladimir

	@Test
	public void Task() {
		RestAssured.baseURI = "https://pure-ravine-92491.herokuapp.com/syntax";
		Response rs = given().pathParam("studentId", "123").when().get("/api/getStudentProfile/{studentId}");
		rs.prettyPrint();
		rs.then().assertThat().statusCode(200).and().body("firstName", equalTo("Vladimir"));

		JsonPath jPath = rs.jsonPath();

		String fistName = jPath.get("firstName");
		System.out.println(fistName);

		String lastName = jPath.get("lastName");
		System.out.println(lastName);

	}

	@Test
	public void getALlStudents() {

		RestAssured.baseURI = "http://pure-ravine-92491.herokuapp.com/syntax";

		Response resp = given().when().get("/api/getAllStudentProfiles");

		resp.prettyPrint();

		JsonPath jPath = resp.jsonPath();
		// get value of last name in 3 object
		String name = jPath.get("lastName[2]");
		System.out.println(name);

		List<String> fName = jPath.get("firstName");

		for (String name1 : fName) {
			System.out.println(name1);
		}
		/*
		 * Retrive all students and verify that GET response code is 200 and retrieve
		 * first name of a second student Retrieve all students lastName;
		 */

	}

	@Test
	public void getAllStudents() {

		RestAssured.baseURI = "http://pure-ravine-92491.herokuapp.com/syntax";

		Response rsp = given().
				when().
				   get("/api/getAllStudentProfiles");
		rsp.prettyPrint();

		Assert.assertEquals(200, rsp.getStatusCode());
		int code = rsp.getStatusCode();
		System.out.println(code);

		JsonPath jPath = rsp.jsonPath();

		String name = jPath.get("firstName[1]");
		System.out.println("First name of second student : " + name);

		List<String> names = jPath.get("firstName");

		for (String namess : names) {
			System.out.println(namess);
		}

	}
}