package Pages;

import Utilities.DP;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class Parent {
    public WebDriverWait wait = new WebDriverWait(DP.getDriver(), Duration.ofSeconds(20));

    public void MyClick(WebElement element) {
        wait.until(ExpectedConditions.elementToBeClickable(element));
        element.click();
    }

    public void MySendKeys(WebElement element, String yazi) {
        wait.until(ExpectedConditions.visibilityOf(element));
        element.clear();
        element.sendKeys(yazi);
    }
}

