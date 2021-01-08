package WebTest;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MyStepdefs {
    HomePage homePage = new HomePage();
    CreateAccount createAccount = new CreateAccount();

    @Given("user open browser")
    public void userOpenBrowser() {
    }

    @When("user enters url")
    public void userEntersUrl() {
    }

    @Then("user successfully open the website")
    public void userSuccessfullyOpenTheWebsite()
    {
        homePage.UserClikOnMyAccount();
        createAccount.clickoncreateaccount();


    }
}
