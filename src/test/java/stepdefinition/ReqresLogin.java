package stepdefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class ReqresLogin {

    Response response;
    //RestAssured restAssured ;
    RequestSpecification requestspecification ;

    @Given("GET Request with list of user")
    public void get_request_with_list_of_user() {
        RestAssured.baseURI="https://reqres.in/api/users?";
         requestspecification= RestAssured.given();

    }
    @When("User Request user from {string}")
    public void user_request_user_from(String pageNumber) {
        response=  requestspecification.when().queryParam("page", pageNumber).get();
    }
    @Then("Response should be {string}")
    public void response_should_be(String string) {
       int code= response.then().extract().statusCode();
        System.out.println("Status Code"+ code);
    }

}
