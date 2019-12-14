package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class NewtoursSignOnPage extends BasePage{
    public NewtoursSignOnPage(WebDriver driver){
        super(driver);
    }

    //Locators
    @FindBy(xpath = "//input[@name='userName']")
    private WebElement userNameLocator;

    @FindBy(xpath = "//input[@name='password']")
    private WebElement passwordLocator;

    @FindBy(css = "input[value='Login']")
    private WebElement submitButtonLocator;

    public void enterUsername(String uName){
        sendKeys(userNameLocator,uName);
    }


//    public void enterPassword(String pWord){
//        sendKeys(passwordLocator,pWord);
//    }
    public void enterPassword(String pWord){
        sendKeys(pWord, passwordLocator);
    }
    public void clickOnSubmitButton(){
        click(submitButtonLocator);
    }

@Override
    public void sendKeys( String keyword, WebElement element){
        element.sendKeys(keyword);

    }
}
