package authentication.pages;

import authentication.models.RequestResponse;
import authentication.utils.TestLogger;

public class Authentication {
    private static final TestLogger testLogger = TestLogger.getInstance();

    public String userGetAPIKey(boolean isValid) {
        if (isValid) {
            testLogger.logInfo("I'm bringing to you a valid API key for T.M.D");
            return "valid API key";
        }
        testLogger.logInfo("I'm bringing to you an invalid API key for T.M.D");
        return "invalid API key";
    }

    public RequestResponse userDoRequest(String APIKey) {
        testLogger.logInfo("You're using the TMD API endpoint to create request token...");
        testLogger.logInfo("You're using the API key: " + APIKey);
        if (APIKey.equalsIgnoreCase("valid API key")) {
            return new RequestResponse.Builder().setSuccess(true).setExpiresAt("validExpirationDate")
                                                .setRequestToken("validToken").build();
        }
        testLogger.logError("Invalid API key: You must be granted a valid key");
        return new RequestResponse.Builder().setStatusMessage("Invalid API key: You must be granted a valid key")
                                            .setSuccess(false).setStatusCode(7).build();
    }
}
