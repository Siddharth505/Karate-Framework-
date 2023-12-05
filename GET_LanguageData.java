package Business_Insight;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class GET_LanguageData 
{
@Test
public void Lang() 
{
  given()
  
  .when()
  .get("http://182.76.79.236:10013/api/Merchant/GetLanguageData?Language=En&from=AM&to=PM")
  
  .then()
  .assertThat().body("Data.Pk_Language", equalTo(0));
	
}
}
