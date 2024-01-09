package StepDefinitions;

import Utilities.DP;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Hooks {
    @Before
    public void before() {
        System.out.println("Scenario Started : ");
    }

    @After
    public void after(Scenario scenario) {
        if (scenario.isFailed()) {
            TakesScreenshot ts = ((TakesScreenshot) DP.getDriver());
            byte[] screenshotData = ts.getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshotData, "image/png", "screenshot name");
        }
        DP.quitDriver();
    }
}