package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NewtoursHomePage extends BasePage{
    public NewtoursHomePage(WebDriver driver){
        super(driver);
    }

    @FindBy(xpath = "//a[contains(text(),'REGISTER')]")
    private WebElement registerLinkLocator;

    @FindBy(xpath = "//a[contains(text(),'SIGN-ON')]")
    private WebElement signOnLinkLocator;


    public void clickOnRegisterLink(){
        registerLinkLocator.click();
    }
    public void clickOnSignOnLink(){
        click(signOnLinkLocator);
    }
}
