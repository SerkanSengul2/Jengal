package StepDefinitions;

import Pages.User_Registration_POM;
import io.cucumber.java.en.Then;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

public class User_Registration_Negative {
    User_Registration_POM ur = new User_Registration_POM();

    @Then("The user enters the same data again")
    public void theUserEntersTheSameDataAgain() {
        ur.MySendKeys(ur.userName, "TheUseR");
        ur.MySendKeys(ur.eMail, "TesterUser861@gmail.com");
        ur.MySendKeys(ur.password, "TheUseR1234");
        ur.MySendKeys(ur.passwordConfirmation, "TheUseR1234");
        ur.MyClick(ur.checkBox);
    }

    @Then("The user should be able to see the error message")
    public void theUserShouldBeAbleToSeeTheErrorMessage() {
        ur.wait.until(ExpectedConditions.visibilityOf(ur.errorMessage));
        String errorMessage=ur.errorMessage.getText();
        Assert.assertEquals(errorMessage,"OK");
        System.out.println("errorMessage = " + errorMessage);
    }
}
