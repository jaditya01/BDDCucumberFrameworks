package stepdefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.junit.Assert;

public class SingleUserDetails {

    RequestSpecification requestSpecification;
    Response response;

    @Given("a Single User with {string}")
    public void a_single_user_with(String id) {
        RestAssured.baseURI="https://reqres.in/api/users";
         requestSpecification = RestAssured.given().queryParam("users",id);

    }
    @When("user request user details")
    public void user_request_user_details() {
        response=  requestSpecification.when().get();
    }
    @Then("Response should be display {string}")
    public void response_should_be_display(String statusCode) {
        int code=  response.then().extract().statusCode();
        String responsecode = String.valueOf(code);
        System.out.println("My code"+ code);
        Assert.assertEquals(responsecode,statusCode);
    }
    @And("User {string} should match")
    public void user_should_match(String firstName) {
       String name = response.then().extract().body().jsonPath().get("FirstName");
        System.out.println("Name "+name);
    }


}
