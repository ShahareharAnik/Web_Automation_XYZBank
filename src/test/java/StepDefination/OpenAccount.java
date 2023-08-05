package StepDefination;

import POM.Webelements;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static StepDefination.AddCustomerStepdefs.driver;

public class OpenAccount {
    Webelements elements;
    @Given("User Go to the page of Opening an account")
    public void userGoToThePageOfOpeningAnAccount() {
        System.out.println("User Entering the Open Account Tab");
    }

    @When("Click on the Open Account tab")
    public void clickOnTheOpenAccountTab() throws InterruptedException {
        elements = new Webelements(driver);
        elements.OpenAccount();
    }

    @And("Select Customer and Currency")
    public void selectCustomerAndCurrency() throws InterruptedException {
        elements.Customer();
        elements.Currency();
    }

    @Then("Process that")
    public void processThat() throws InterruptedException {
        elements.Process();
    }
}
