package Business_Insight;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;
import org.testng.annotations.Test;

public class GET_GoogleAPIAddressLatLong 
{
@Test
public void GetLat()
{
	given()
	.when()
	.get("http://182.76.79.240:8081/vts-service/getGoogleAPIAddressFromLatLong?lat=28.889859540580087&lon=76.58778246492147")
	.then()
	.statusCode(200)
	.body("Message",equalTo("Success"))
	.assertThat().body("Data.country", equalTo("India"))
	.assertThat().body("Data.postalCode", equalTo("124001"))
	.log().all();
}

}
