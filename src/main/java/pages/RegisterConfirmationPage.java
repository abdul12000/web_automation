package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegisterConfirmationPage extends BasePage{
    public RegisterConfirmationPage(WebDriver driver){
        super(driver);
    }

    @FindBy(xpath = "//td/p[1]/font/b")
    private WebElement dearLocator;
    @FindBy(xpath = "//td/p[3]/a/font/b") private WebElement noteLocator;

    @FindBy(xpath = "//img[@src='/images/masts/mast_register.gif']")
    private WebElement registerConfirmationPageImageLocator;



    public String getDearValue(){
        return dearLocator.getText();
    }
    public String getNoteValue(){
        return noteLocator.getText();
    }

    public Boolean imageIsDisplayed(){
        return registerConfirmationPageImageLocator.isDisplayed();
    }
}
