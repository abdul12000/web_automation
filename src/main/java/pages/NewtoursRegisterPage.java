package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class NewtoursRegisterPage extends BasePage{
    public NewtoursRegisterPage(WebDriver driver){
        super(driver);
    }

    //Locators
    @FindBy(xpath = "//input[@name='firstName']")
    private WebElement firstNameLocator;
    @FindBy(css = "input[name=lastName]")
    private WebElement lastNameLocator;
    @FindBy(id = "email")
    private WebElement userNameLocator;
    @FindBy(xpath = "//input[@name='password']")
    private WebElement passwordLocator;
    @FindBy(xpath = "//input[@name='confirmPassword']")
    private WebElement confirmPasswordLocator;
    @FindBy(css = "input[name=phone]")
    private WebElement phoneNumberLocator;
    @FindBy(id = "userName")
    private WebElement emailLocator;
    @FindBy(xpath = "//input[@name='register']")
    private WebElement submitButtonLocator;
    @FindBy(xpath = "//select[@name='country']")
    private WebElement countryNameLocator;


    //methods
    public void enterFirstName(String fName){
        firstNameLocator.sendKeys(fName);
    }
    public void enterLastName(String lName){
        lastNameLocator.sendKeys(lName);
    }
    public void enterUserName(String uName){
        userNameLocator.sendKeys(uName);
    }
    public void enterPassword(String pWord){
        passwordLocator.sendKeys(pWord);
    }
    public void enterConfirmPassword(String pWord){
        passwordLocator.sendKeys(pWord);
    }
    public void enterPhoneNumber(String pWord){
        confirmPasswordLocator.sendKeys(pWord);
    }
    public void enterEmailAddress(String emailAddress){
        emailLocator.sendKeys(emailAddress);
    }
    public void clickOnSubmitButton(){
        submitButtonLocator.click();
    }

    public void selectCountry(String countryName){
        Select sel = new Select(countryNameLocator);
        sel.selectByVisibleText(countryName);
    }

    public void selectCountryByIndex(int index){
        selectByIndex(countryNameLocator,index);
    }

}
