package companies.models;

public class RequestResponse {
    private String description;
    private String headquarters;
    private String homepage;
    private int id;
    private String logoPath;
    private String name;
    private String originCountry;
    private String parentCompany;
    private String statusMessage;
    private int statusCode;
    private boolean success;
    private RequestResponse(){}

    public String getDescription() {
        return description;
    }

    public String getHeadquarters() {
        return headquarters;
    }

    public String getHomepage() {
        return homepage;
    }

    public int getId() {
        return id;
    }

    public String getLogoPath() {
        return logoPath;
    }

    public String getName() {
        return name;
    }

    public String getOriginCountry() {
        return originCountry;
    }

    public String getParentCompany() {
        return parentCompany;
    }

    public String getStatusMessage() {
        return statusMessage;
    }

    public int getStatusCode() {
        return statusCode;
    }

    public boolean isSuccess() {
        return success;
    }

    public static class Builder{
        private String description;
        private String headquarters;
        private String homepage;
        private int id;
        private String logoPath;
        private String name;
        private String originCountry;
        private String parentCompany;
        private String statusMessage;
        private int statusCode;
        private boolean success;

        public Builder setDescription(String description){
            this.description = description;
            return this;
        }
        public Builder setHeadquarters(String headquarters){
            this.headquarters = headquarters;
            return this;
        }
        public Builder setHomepage(String homepage){
            this.homepage = homepage;
            return this;
        }
        public Builder setId(int id){
            this.id = id;
            return this;
        }
        public Builder setLogoPath(String logoPath){
            this.logoPath = logoPath;
            return this;
        }
        public Builder setName(String name){
            this.name = name;
            return this;
        }
        public Builder setOriginCountry(String originCountry){
            this.originCountry = originCountry;
            return this;
        }
        public Builder setParentCompany(String parentCompany){
            this.parentCompany = parentCompany;
            return this;
        }
        public Builder setStatusMessage(String statusMessage){
            this.statusMessage = statusMessage;
            return this;
        }
        public Builder setStatusCode(int statusCode){
            this.statusCode = statusCode;
            return this;
        }
        public Builder setSuccess(boolean success){
            this.success = success;
            return this;
        }

        public RequestResponse build(){
            RequestResponse requestResponse = new RequestResponse();
            requestResponse.description = this.description;
            requestResponse.headquarters = this.headquarters;
            requestResponse.homepage = this.homepage;
            requestResponse.id = this.id;
            requestResponse.logoPath = this.logoPath;
            requestResponse.name = this.name;
            requestResponse.originCountry = this.originCountry;
            requestResponse.parentCompany = this.parentCompany;
            requestResponse.statusMessage = this.statusMessage;
            requestResponse.statusCode = this.statusCode;
            requestResponse.success = this.success;
            return requestResponse;
        }
    }
}
