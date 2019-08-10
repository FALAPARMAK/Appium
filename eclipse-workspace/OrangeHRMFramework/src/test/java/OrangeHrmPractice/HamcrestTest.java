package OrangeHrmPractice;

import org.junit.Assert;
import org.junit.Test;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;
import io.restassured.RestAssured;
import  io.restassured.response.Response;



public class HamcrestTest {

	/*
	 * Retrieve quote of specific character and verify that response code is 200 and response contains 
	 */
	
	@Test
      public void verifyResponse() {
		
		RestAssured.baseURI="https://got-quotes.herokuapp.com";
		//1. way using Junit assertions
		Response rsp=
				given().
				queryParam("char","varys").
				when().
				get("/quotes");
		
		String responseBody=rsp.asString();
		System.out.println(responseBody);
		int code=rsp.getStatusCode();
		Assert.assertEquals(200, code);
				
		//2 way to complete  request * assertion
		
		given().
		queryParam("char", "varys").
		when().get("/quotes").
		then().
		assertThat().statusCode(200).
		and().
		assertThat().body("character", equalTo("Varys"));
		
		//3 way
				Response rsp1=
				given().
					queryParam("char", "varys").
				when().
					get("/quotes");
				
				rsp1.then().
					assertThat().statusCode(200).
				and().
					body("character", equalTo("Varys"));
			}
			
				
	
}
