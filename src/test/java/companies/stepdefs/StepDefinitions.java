package companies.stepdefs;


import common.BaseStepsDefinition;
import companies.models.RequestResponse;
import companies.pages.Company;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class StepDefinitions {
    Company company;
    private RequestResponse response;
    private String companyID;
    @Before
    public void init(){
        company = new Company();
    }
    @And("the user has the company id {string}")
    public void userHasCompanyID(String companyID){
        this.companyID = companyID;
    }

    @When("the user do the request")
    public void userDoRequest(){
        response = company.userDoRequest(BaseStepsDefinition.APIKey, companyID);
    }
    @Then("company details are not null")
    public void detailsAreNotNull(){
        Assert.assertNotNull(response.getDescription());
        Assert.assertNotNull(response.getHeadquarters());
        Assert.assertNotNull(response.getHomepage());
        Assert.assertNotEquals(0, response.getId());
        Assert.assertNotNull(response.getLogoPath());
        Assert.assertNotNull(response.getName());
        Assert.assertNotNull(response.getOriginCountry());
        Assert.assertNotNull(response.getParentCompany());
    }
    @Then("company details are null")
    public void detailsAreNull(){
        Assert.assertNull(response.getDescription());
        Assert.assertNull(response.getHeadquarters());
        Assert.assertNull(response.getHomepage());
        Assert.assertEquals(0, response.getId());
        Assert.assertNull(response.getLogoPath());
        Assert.assertNull(response.getName());
        Assert.assertNull(response.getOriginCountry());
        Assert.assertNull(response.getParentCompany());
    }
    @And("field \"company_name\" is {string}")
    public void validateCompanyName(String name){
        Assert.assertEquals(name, response.getName());
    }
    @And("field \"status_message\" is {string}")
    public void validateStatusMessage(String statusMessage){
        Assert.assertEquals(statusMessage, response.getStatusMessage());
    }
    @And("\"success\" field is false")
    public void validateSuccess(){
        Assert.assertFalse(response.isSuccess());
    }
    @And("field \"status_code\" is {int}")
    public void validateStatusCode(int number){
        Assert.assertEquals(number, response.getStatusCode());
    }
}
