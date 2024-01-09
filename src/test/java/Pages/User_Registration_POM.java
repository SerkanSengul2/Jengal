package Pages;

import Utilities.DP;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class User_Registration_POM extends Parent {
    public User_Registration_POM() {
        PageFactory.initElements(DP.getDriver(), this);
    }

    @FindBy(linkText ="Anasayfa")
    public WebElement homePage;

    @FindBy(xpath = "//a[normalize-space()='Teklif al']")
    public WebElement getAnOffer;
    @FindBy(xpath = "//span[contains(text(),'Kayıt Ol')]")
    public WebElement registerButton;
    @FindBy(css = "[formcontrolname='name']")
    public WebElement userName;
    @FindBy(css = "[formcontrolname='email']")
    public WebElement eMail;
    @FindBy(css = "[formcontrolname='password']")
    public WebElement password;
    @FindBy(css = "[formcontrolname='password_confirmation']")
    public WebElement passwordConfirmation;
    @FindBy(xpath = "//span[@class='mat-checkbox-inner-container']")
    public WebElement checkBox;
    @FindBy(xpath = "(//span[contains(text(),'Kayıt Ol')])[1]")
    public WebElement registerButton2;
    @FindBy(css = "[href='/panel/dashboard']")
    public WebElement dashboard;
    @FindBy(xpath = "(//div[@role='alertdialog'])[1]")
    public WebElement errorMessage;
}
