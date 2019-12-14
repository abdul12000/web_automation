package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MortgageCalculatorPage extends BasePage implements  MortgageCalculatorInterface{
    public MortgageCalculatorPage(WebDriver driver){
        super(driver);
    }

    @FindBy(xpath = "//*[@id='homeval']")
    private WebElement homeValLocator;
    @FindBy(xpath = "//*[@id='downpayment']")
    private WebElement downpaymentLocator;
    @FindBy(xpath = "//*[@id='loanamt']")
    private WebElement loanAmountLocator;

    @FindBy(xpath = "//*[@id='intrstsrate']")
    private WebElement intrestRateLocator;
    @FindBy(xpath = "//*[@id='loanterm']")
    private WebElement loanTermLocator;
    @FindBy(xpath = "//*[@id='start_year']")
    private WebElement yearLocator;

    @FindBy(xpath = "//input[@name='cal']")
    private WebElement submitButoonLocator;

    @FindBy(xpath =  "//div[@class='repayment-block']/div[1]/div[1]/h3")
    private WebElement totalMonthlyPaymentLocator;
    @FindBy(xpath =  "//div[@class='repayment-block']/div[2]/div[1]/h3")
    private WebElement down_PaymentLocator;
    @FindBy(xpath =  "//div[@class='repayment-block']/div[5]/div[1]/h3")
    private WebElement monthlyTaxPaidLocator;
    @FindBy(xpath =  "//div[@class='repayment-block']/div[6]/div[1]/h3")
    private WebElement monthlyHomeInsuranceLocator;


    public void enterHomeVlaue(String hValue){
        sendKeys(homeValLocator,hValue);
    }

    public void enterDownPayment(String dPayment){
        sendKeys(downpaymentLocator,dPayment);
    }
    public void enterLoanAmount(String lAmount){
        sendKeys(loanAmountLocator,lAmount);
    }
    public void enterIntRate(String intRate){
        sendKeys(intrestRateLocator,intRate);
    }
    public void enterLoanTerm(String lTerm){
        sendKeys(loanTermLocator,lTerm);
    }
    public void enterYear(String year){
        sendKeys(yearLocator,year);
    }

    public void clickOnSubmitButton(){
        click(submitButoonLocator);
    }

    public String getTotalMonthlyPayment(){
        return totalMonthlyPaymentLocator.getText();
    }
    public String getDownPaymentAmount(){
        return down_PaymentLocator.getText();
    }

    public String getMonthlyTaxPaid(){
        return monthlyTaxPaidLocator.getText();
    }
    public String getMonythlyHomeInsurance(){
        return monthlyHomeInsuranceLocator.getText();
    }
}
