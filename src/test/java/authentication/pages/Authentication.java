package authentication.pages;

import authentication.models.RequestTokenSuccessfullyResponse;
import authentication.utils.TestLogger;

public class Authentication {
    TestLogger testLogger = TestLogger.getInstance();
    public String userGetAPIKey(){
        testLogger.logInfo("I'm bringing to you a valid API key for T.M.D");
        return "This is a valid API key";
    }

    public RequestTokenSuccessfullyResponse userDoRequest( String APIKey ){
        testLogger.logInfo("You're using the TMD API endpoint to create request token...");
        testLogger.logInfo("You're using the API key: "+ APIKey);
        return new RequestTokenSuccessfullyResponse(true, "expirationDate", "requestToken");
    }
}
