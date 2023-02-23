package authentication.stepdefs;

import authentication.models.RequestResponse;
import authentication.pages.Authentication;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class StepDefinitions {
    private Authentication authentication;
    private String APIKey;
    private RequestResponse response;
    @Before
    public void init(){
        authentication = new Authentication();
    }
    @Given("^the user has a valid API key$")
    public void userHasValidAPIKey(){
        APIKey = authentication.userGetAPIKey(true);
    }
    @Given("^the user has an invalid API key$")
    public void userHasInvalidAPIKey(){
        APIKey = authentication.userGetAPIKey(false);
    }
    @When("^the user do the request with the API key$")
    public void userDoRequestWithAPIKey(){
        response = authentication.userDoRequest(APIKey);
    }
    @Then("request token is successfully created")
    public void requestTokenSuccessfullyCreated(){
        Assert.assertEquals("validToken", response.getRequestToken());
    }
    @Then("the status message is {string}")
    public void anErrorMessageIsDisplayed(String message){
        Assert.assertEquals(message, response.getStatusMessage());
    }
    @And("field \"success\" is true")
    public void fieldIsTrue(){
        Assert.assertTrue(response.isSuccess());
    }
    @And("field \"success\" is false")
    public void fieldIsFalse(){
        Assert.assertFalse(response.isSuccess());
    }
    @And("field \"expires at\" is a valid expiration date")
    public void fieldIsAValidDate(){
        Assert.assertEquals("validExpirationDate", response.getExpiresAt());
    }
    @And("field \"status_code\" is {int}")
    public void fieldIsNumber(int number){
        Assert.assertEquals(number, response.getStatusCode());
    }

}
