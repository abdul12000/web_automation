package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {
    WebDriverWait wait;

    public BasePage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.wait = new WebDriverWait(driver, 20);
    }

    public void sendKeys(WebElement element, String keyword) {
        element.clear();
        element.sendKeys(keyword);
    }

    public void click(WebElement element) {
        element.click();
    }

    public void selectVisibleText(WebElement element, String keyword) {
        Select sel = new Select(element);
        sel.selectByVisibleText(keyword);
    }

    public void selectByIndex(WebElement element, int index) {
        Select sel = new Select(element);
        sel.selectByIndex(index);
    }

    public void selectByValue(WebElement element, String value) {
        Select sel = new Select(element);
        sel.selectByValue(value);
    }
    public void sendKeys( String keyword, WebElement element){
        element.sendKeys(keyword);

    }

}
