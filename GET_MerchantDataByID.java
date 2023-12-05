package Business_Insight;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;
import static org.junit.Assert.assertThat;
public class GET_MerchantDataByID 
{
	@Test
	public void GetData()
	{
      given()
      .when()
      .get("http://182.76.79.236:10013/api/Merchant/GetGmapMerchantDataById?MerchantId=487")
      .then()
      .statusCode(200)
      //.assertThat().body("Data.AddressId", equalTo("1651744580485"))
      .assertThat().body("Message", equalTo("Success"))
      .body("Message",equalTo("Success"))
      .header("Content-Type", "application/json; charset=utf-8")
      .log().body();
      
      
	}

}
