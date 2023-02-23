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
            RequestResponse patron = new RequestResponse();
            patron.statusMessage = this.statusMessage;
            patron.success = this.success;
            patron.expiresAt = this.expiresAt;
            patron.requestToken = this.requestToken;
            patron.statusCode = this.statusCode;
            return patron;
        }
    }

    private RequestResponse() {
    }

}
