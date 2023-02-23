package authentication.stepdefs;

import authentication.models.RequestTokenSuccessfullyResponse;
import authentication.pages.Authentication;
import io.cucumber.java.bs.A;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class StepDefinitions {
    private Authentication authentication;
    private String APIKey;
    private RequestTokenSuccessfullyResponse response;

    @Given("^the user has a valid API key$")
    public void userHasValidAPIKey(){
        authentication = new Authentication();
        APIKey = authentication.userGetAPIKey();
    }
    @When("^the user do the request with the API key$")
    public void userDoRequestWithAPIKey(){
        response = authentication.userDoRequest(APIKey);
    }
    @Then("request token is successfully created and it's returned back to the user")
    public void requestTokenSuccessfullyCreated(){
        Assert.assertEquals("requestToken", response.getRequestToken());
    }
    @And("additional fields like \"success\" and \"expires at\" are returned too")
    public void otherFieldsAreReturned(){
        Assert.assertTrue(response.isSuccess());
        Assert.assertEquals("expirationDate", response.getExpiresAt());
    }

}
