package Business_Insight;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class GET_BusinessCategoryList 
{

	@Test
	public void GetStatus()
	{
		given()
		
	    .when()
	    
		.get("http://182.76.79.236:7003/FTSService.svc/Rest/GetBusinessCatList")
        
		.then()
        .statusCode(200)
        
        .body("Message",equalTo("Success"))
        
        .body("Data.ImageName", hasItems("Attractions","Food","Education","Financial","Services"))
        
        .header("Content-Type", "application/json; charset=utf-8");
        
        //.log().all();
		
		
	}
	
}
