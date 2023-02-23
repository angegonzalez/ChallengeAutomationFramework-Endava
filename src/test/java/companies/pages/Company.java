package companies.pages;

import companies.models.RequestResponse;

public class Company {
    public RequestResponse userDoRequest(String APIKey, String companyID) {
        if (APIKey.equalsIgnoreCase("invalid API key")) {
            return new RequestResponse.Builder().setStatusMessage("Invalid API key: You must be granted a valid key")
                    .setSuccess(false)
                    .setStatusCode(7).build();
        }
        if (companyID.equalsIgnoreCase("valid company id")) {
            return new RequestResponse.Builder().setDescription("")
                    .setHeadquarters("San Francisco, California, United States")
                    .setHomepage("http://www.lucasfilm.com")
                    .setId(1)
                    .setLogoPath("/o86DbpburjxrqAzEDhXZcyE8pDb.png")
                    .setName("Lucasfilm")
                    .setOriginCountry("US")
                    .setParentCompany("").build();
        }
        return new RequestResponse.Builder().setStatusMessage("The resource you requested could not be found")
                .setStatusCode(34).build();
    }
}
