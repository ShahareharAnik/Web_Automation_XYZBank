package StepDefination;

import POM.Webelements;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static StepDefination.AddCustomerStepdefs.driver;

public class CustomerLogIn {
    Webelements webelements;
    @Given("Customer Can Log in now")
    public void customerCanLogInNow() {

        System.out.println("Customer Login here and do their activities");
    }

    @When("Enter Customer LogIn Tab and Select Customer and Log in")
    public void enterCustomerLogInTabAndSelectCustomerAndLogIn() throws InterruptedException {
        webelements  = new Webelements(driver);
        webelements.CustomerLogIn();
    }

    @And("Deposit some {string}")
    public void depositSomeAmount(String s) throws InterruptedException {
        webelements.Deposit(s);
    }

    @And("Withdraw some {string}")
    public void withdrawSomeAmounts(String s) throws InterruptedException {
        webelements.Withdraw(s);
    }
    @And("Check Transactions")
    public void checkTransactions() throws InterruptedException {
        webelements.Transiction();
    }

    @Then("Logout")
    public void logout() throws InterruptedException {
        webelements.Logout();
    }
}
