package StepDefination;

import POM.Webelements;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static StepDefination.AddCustomerStepdefs.driver;

public class Customrer {
    Webelements elements;
    @Given("Bank Manager come here to delete the customer")
    public void bankManagerComeHereToDeleteTheCustomer() {

        System.out.println("Bank Manager want to Delete any customer");

    }

    @When("Click on the Customer Search tab and {string} customer")
    public void clickOnTheCustomerSearchTabAndSearchCustomer(String a) throws InterruptedException {
        elements = new Webelements(driver);
        elements.CustomerTAb();
        elements.SearchBox(a);
    }

    @Then("Delete the customer")
    public void deleteTheCustomer() throws InterruptedException {
        elements.Delete();
    }
}
