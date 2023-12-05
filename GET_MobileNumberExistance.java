package Business_Insight;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;


public class GET_MobileNumberExistance 
{
 
	@Test
	public void CheckNumber()
	{
		given()
		.when()
		.get("http://182.76.79.236:10013/api/Merchant/MobileNoExistancy?MobileNo=9654197547")
		.then()
		.statusCode(200)
		//.assertThat().body("Data.OnboardedBy", equalTo(" 1422"))
		.body("Message",equalTo("Success"))
		.assertThat().body("Data.GpayStatus", equalTo("On-boarded"))
		.assertThat().body("Data.OnboardingDate", equalTo("11/10/2021 05:56"))
		.log().all();
	}
}
