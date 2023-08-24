package com.shopshoes.teststepts;

	import org.testng.annotations. Test;
	import io.restassured. RestAssured;


	public class Get2Demo {
	@Test


	public void getServerResponse() {

	RestAssured
	.when()
	.get("http://localhost:9010/get-users")
	.then()

	.assertThat() 
	.statusCode (200)
	.log().all();
}
	}