package authentication.models;

public class RequestTokenSuccessfullyResponse {
    private boolean success;
    private String expiresAt;
    private String requestToken;

    public RequestTokenSuccessfullyResponse(boolean success, String expiresAt, String requestToken) {
        this.success = success;
        this.expiresAt = expiresAt;
        this.requestToken = requestToken;
    }

    public boolean isSuccess() {
        return success;
    }

    public String getExpiresAt() {
        return expiresAt;
    }

    public String getRequestToken() {
        return requestToken;
    }
}
