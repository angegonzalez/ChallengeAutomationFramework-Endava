package common;

import authentication.pages.Authentication;
import io.cucumber.java.en.Given;

public class BaseStepsDefinition {
    private final Authentication authentication;
    public static String APIKey;

    public BaseStepsDefinition() {
        authentication = new Authentication();
    }
    @Given("^the user has a valid API key$")
    public void userHasValidAPIKey(){
        APIKey =  authentication.userGetAPIKey(true);
    }
    @Given("^the user has an invalid API key$")
    public void userHasInvalidAPIKey(){
        APIKey = authentication.userGetAPIKey(false);
    }
}
