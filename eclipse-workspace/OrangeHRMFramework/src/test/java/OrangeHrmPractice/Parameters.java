package OrangeHrmPractice;

import org.junit.Assert;
import org.junit.Test;

import static io.restassured.RestAssured.*;

import io.restassured.RestAssured;
import io.restassured.response.Response;




public class Parameters {

	@Test
	public void queryParameteres() {
		RestAssured.baseURI="https://regres.in/";
		
		Response resp=
				given().queryParam("page","2").
				when().
				get("/aoi/users");
		//Junit
		Assert.assertEquals(200, resp.getStatusCode());
		
		
	}
}
