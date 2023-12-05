package Business_Insight;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class GET_FSTSAppStatus 
{

	@Test
	public void GetStatus()
	{
		given()
	    .when()
		.get("http://182.76.79.236:7003/FTSService.svc/Rest/GetFSTSAppStatus?CurrentVersion=7.2.0&OSType=Android&AppName=RWM&EmployeeId&OSVersion=12&Model=samsung_SM-G781B")
        .then()
        .statusCode(200)
        .body("Message",equalTo("Success"))
        //.assertThat().body("Data.BusinessInsightDistance", equalTo("75"))
        .assertThat().body("Data.AppUpdateCompulsary", equalTo("true"))
        .header("Content-Type", "application/json; charset=utf-8")
        .log().all();
	}
	
}
