package Business_Insight;

import org.testng.annotations.Test;

import com.aventstack.extentreports.model.Log;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class GET_CheckGMPPincode 
{
	@Test
	public void CheckPincode()
	{
		given()
		
		.when()
		.get("http://182.76.79.236:10013/api/Merchant/CheckGmapPincode?PinCode=110088")
		
		.then()
		.statusCode(200)
		.body("Message", equalTo("Success"))
		.assertThat().body("status", equalTo(0))
		.header("Content-Type", equalTo("application/json; charset=utf-8"))
		.log().headers();
	}

}
