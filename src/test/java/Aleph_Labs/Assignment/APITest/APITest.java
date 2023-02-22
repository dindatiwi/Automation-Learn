package Aleph_Labs.Assignment.APITest;

import static io.restassured.RestAssured.given;
import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class APITest extends BaseAPI{
	@Test
	public void verify_data_types() {
		Response responseDashboard = given().spec(commonJsonSpec)
		.when().get("/users");
	      //convert JSON to string
	      JsonPath _J = new JsonPath(responseDashboard.asString());

	      //length of JSON array
	      int _SIZE = _J.getInt("data.size()");
	      
	      for (int _ITER = 0; _ITER < _SIZE; _ITER++) {	  		
	 		 try {
	 				Assert.assertEquals(responseDashboard.jsonPath().get("["+_ITER+"].id").getClass().getSimpleName(), "Integer");
	 				Assert.assertEquals(responseDashboard.jsonPath().get("["+_ITER+"].name").getClass().getSimpleName(), "String");
	 				Assert.assertEquals(responseDashboard.jsonPath().get("["+_ITER+"].username").getClass().getSimpleName(), "String");
	 				Assert.assertEquals(responseDashboard.jsonPath().get("["+_ITER+"].email").getClass().getSimpleName(), "String");
	 		} catch (Exception e1) {
	 				// TODO Auto-generated catch block
	 				e1.printStackTrace();
	 		}
	      }

		assertEquals(responseDashboard.statusCode(),200);
	}
	
	@Test
	public void verify_data_input() {
		String payload = "{\"name\":\"AlephQATest\",\"username\":\"aleph.test\",\"email\":\"aleph.test@mail.com\"}";
		Response responseCreate = given().spec(commonJsonSpec).body(payload)
				.when().post("/users");
		 try {
				Assert.assertEquals(responseCreate.jsonPath().get("name"), "AlephQATest");
				Assert.assertEquals(responseCreate.jsonPath().get("username"), "aleph.test");
				Assert.assertEquals(responseCreate.jsonPath().get("email"), "aleph.test@mail.com");
		} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
		}
		assertEquals(responseCreate.statusCode(),201);
	}
}
