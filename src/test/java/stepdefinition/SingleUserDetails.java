package stepdefinition;

import POJO.JsonToJavaObject;
import com.fasterxml.jackson.core.JsonProcessingException;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.qameta.allure.Allure;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;
import org.junit.Assert;

import java.util.List;

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
        String responseCode = String.valueOf(code);
        System.out.println("My code"+ code);
        Assert.assertEquals(responseCode,statusCode);
    }
    @And("User {string} should match")
    public void user_should_match(String firstName) throws JsonProcessingException {
       Response res  = response.then().extract().response();

       JsonPath js = new JsonPath(res.asString());
       ResponseBody f =res.getBody();

        //System.out.println(js.getString("data.first_name[1]"));

        JsonToJavaObject jsonread = new JsonToJavaObject();
       jsonread.readJson();

        Allure.addAttachment("print allure output",f.asString());
       // System.out.println(f.asString());
       // System.out.println(JsonToJavaObject.readJson(f.asString()));

    }


}
