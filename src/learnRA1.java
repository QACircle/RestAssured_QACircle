import org.json.simple.JSONObject;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class learnRA1 {

	public static void main(String[] args) 
	{
	
		RestAssured.baseURI = "https://reqres.in";
	
		
		RequestSpecification request1 = RestAssured.given();
	  
        Response response  = request1.delete("/api/users/2");
        
        System.out.println(response.getBody().asString());
    
        System.out.println(response.getStatusCode());
        
 	}
}
