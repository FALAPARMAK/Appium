package OrangeHrmPractice;

import org.junit.Assert;
import org.junit.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;


public class ApiDemo {
	
	@Test
	public void getWeather() {
		Response response=RestAssured.when().get("http://restapi.demoqa.com/utilities/weather/city/Istanbul");
		
		response.prettyPrint();
	}
	
	@Test
	public void getCountry() {
		Response response=RestAssured.when().get("http://restcountries.eu/rest/v1/name/Turkey");
		
		
	    response.prettyPrint();
	   int code= response.getStatusCode();
	   Assert.assertEquals(200, code);
	    
	   //retrieve body response as String
	  String body= response.asString();
	  Assert.assertTrue(body.contains("Paris"));
	  
	  //
	}

}
