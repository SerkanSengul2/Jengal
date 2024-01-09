package StepDefinitions;

import Pages.User_Registration_POM;
import Utilities.DP;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

public class User_Registration_Affirmative {
    User_Registration_POM ur = new User_Registration_POM();
    Actions actions = new Actions(DP.getDriver());

    @Given("Navigate to site")
    public void navigateToSite() {
        DP.getDriver().get("https://www.dopinger.com/tr/");
    }

    @When("The user should be able to click register button")
    public void theUserShouldBeAbleToClickRegisterButton() {
        ur.MyClick(ur.homePage);
        ur.wait.until(ExpectedConditions.visibilityOf(ur.getAnOffer));
        actions.moveToElement(ur.getAnOffer).perform();
        ur.MyClick(ur.registerButton);
    }

    @Then("The user enter valid registration details")
    public void TheUserEnterValidRegistrationDetails() {
        ur.MySendKeys(ur.userName, "TheUseR2");
        ur.MySendKeys(ur.eMail, "userTesT1@gmail.com");
        ur.MySendKeys(ur.password, "TheUseR1234");
        ur.MySendKeys(ur.passwordConfirmation, "TheUseR1234");
        ur.MyClick(ur.checkBox);
    }

    @And("The user click on the register button")
    public void theUserClickOnTheRegisterButton() {
        ur.MyClick(ur.registerButton2);
    }

    @Then("The user should be registered successfully")
    public void theUserShouldBeRegisteredSuccessfully() {
        ur.wait.until(ExpectedConditions.visibilityOf(ur.dashboard));
        Assert.assertTrue(ur.dashboard.isDisplayed());
    }
}
