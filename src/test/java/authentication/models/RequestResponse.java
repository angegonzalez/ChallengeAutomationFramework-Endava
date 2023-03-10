package authentication.models;

public class RequestResponse {
    private String statusMessage;
    private boolean success;
    private String expiresAt;
    private String requestToken;
    private int statusCode;

    public String getStatusMessage() {
        return statusMessage;
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

    public int getStatusCode() {
        return statusCode;
    }

    public static class Builder {
        private String statusMessage;
        private boolean success;
        private String expiresAt;
        private String requestToken;
        private int statusCode;

        public Builder setStatusMessage(String statusMessage) {
            this.statusMessage = statusMessage;
            return this;
        }

        public Builder setSuccess(boolean success) {
            this.success = success;
            return this;
        }

        public Builder setExpiresAt(String expiresAt) {
            this.expiresAt = expiresAt;
            return this;
        }

        public Builder setRequestToken(String requestToken) {
            this.requestToken = requestToken;
            return this;
        }

        public Builder setStatusCode(int statusCode) {
            this.statusCode = statusCode;
            return this;
        }

        public RequestResponse build() {
            RequestResponse requestResponse = new RequestResponse();
            requestResponse.statusMessage = this.statusMessage;
            requestResponse.success = this.success;
            requestResponse.expiresAt = this.expiresAt;
            requestResponse.requestToken = this.requestToken;
            requestResponse.statusCode = this.statusCode;
            return requestResponse;
        }
    }

    private RequestResponse() {
    }

}
