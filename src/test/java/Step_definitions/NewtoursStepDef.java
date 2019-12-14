package Step_definitions;

import base.BaseUtil;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.NewtoursHomePage;
import pages.NewtoursRegisterPage;
import pages.RegisterConfirmationPage;
import utilities.Utility;

import javax.rmi.CORBA.Util;
import java.util.Random;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsEqual.equalTo;

public class NewtoursStepDef extends BaseUtil {
    private BaseUtil base;


    public NewtoursStepDef(BaseUtil base) {

        this.base = base;
    }
    public int getRndNumbers(){
        Random ran = new Random();
        int fourNumbers = ran.nextInt(9999);
        System.out.println(fourNumbers);
        return fourNumbers;
    }

    @Given("^I am on the newtours website$")
    public void i_am_on_the_newtours_website() throws Throwable {

        base.driver.navigate().to("http://newtours.demoaut.com/");

    }

    @When("^I click on the signup link$")
    public void i_click_on_the_signup_link() throws Throwable {
        NewtoursHomePage newtoursHomePage = new NewtoursHomePage(base.driver);
        newtoursHomePage.clickOnRegisterLink();
    }

//    @When("^enter my \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\" and \"([^\"]*)\"$")
//    public void enter_my_and(String arg1, String arg2, String arg3, String arg4, String arg5, String arg6) throws Throwable {
//
//    }

    @When("^clicks submit button$")
    public void clicks_submit_button() throws Throwable {
        NewtoursRegisterPage newtoursRegisterPage = new NewtoursRegisterPage(base.driver);
        newtoursRegisterPage.clickOnSubmitButton();

    }

    @Then("^the \"([^\"]*)\", \"([^\"]*)\" and \"([^\"]*)\" are displayed on the confirmation page$")
    public void theAndAreDisplayedOnTheConfirmationPage(String fName, String lName, String uName) throws Throwable {
        RegisterConfirmationPage registerConfirmationPage = new RegisterConfirmationPage(base.driver);
        assertThat(registerConfirmationPage.getDearValue(), is(equalTo("Dear " + fName + " " + lName + ",")));
        assertThat(registerConfirmationPage.getNoteValue().contains(uName), is(true));
    }


    @And("^enter my firstname as \"([^\"]*)\", lastname as \"([^\"]*)\", Username as \"([^\"]*)\", password as \"([^\"]*)\", phoneNumber as \"([^\"]*)\" and email as \"([^\"]*)\"$")
    public void enterMyFirstnameAsLastnameAsUsernameAsPasswordAsPhoneNumberAsAndEmailAs(String fName, String lName, String uName, String pWord, String pNumber, String eAddress) throws Throwable {
        NewtoursRegisterPage newtoursRegisterPage = new NewtoursRegisterPage(base.driver);
        newtoursRegisterPage.enterFirstName(fName);
        newtoursRegisterPage.enterLastName(lName);
        newtoursRegisterPage.enterUserName(uName);
        newtoursRegisterPage.enterPassword(pWord);
        newtoursRegisterPage.enterPhoneNumber(pNumber);
        newtoursRegisterPage.enterEmailAddress(eAddress);
    }

    @And("^select \"([^\"]*)\" as country$")
    public void selectAsCountry(String counrtyName) throws Throwable {
        NewtoursRegisterPage newtoursRegisterPage = new NewtoursRegisterPage(base.driver);
        newtoursRegisterPage.selectCountry(counrtyName);
    }

    @And("^enter my \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\" and \"([^\"]*)\"$")
    public void enterMyAnd(String fName, String lName, String uName, String pWord, String pNumber, String email) throws Throwable {
        enterMyFirstnameAsLastnameAsUsernameAsPasswordAsPhoneNumberAsAndEmailAs(fName, lName, uName, pWord, pNumber, email);
    }

    @And("^select country number (\\d+)$")
    public void selectCountryNumber(int index) throws Throwable {
        NewtoursRegisterPage newtoursRegisterPage = new NewtoursRegisterPage(base.driver);
        newtoursRegisterPage.selectCountryByIndex(index);
    }

    @Then("^the \"([^\"]*)\", \"([^\"]*)\" and \"([^\"]*)\" are displayed on the confirmation page with the correct image$")
    public void theAndAreDisplayedOnTheConfirmationPageWithTheCorrectImage(String fName, String lName, String uName) throws Throwable {
        theAndAreDisplayedOnTheConfirmationPage(fName, lName,uName);
        RegisterConfirmationPage registerConfirmationPage = new RegisterConfirmationPage(base.driver);
        assertThat(registerConfirmationPage.imageIsDisplayed(), is(equalTo(true)));
//A test for priniting 1 to 100 and printing  "Fizz" for multiples , "Buzz" for multiples of 5 and "FizzBuzz"
// for multiples of both.

        for (int i = 1; i <= 100; i++){
            if(i%3==0){
                System.out.println("Fizz");}
            if (i%5==0){
                System.out.println("Buzz");}
            if (i%3==0 & i%5==0){
                System.out.println("FizzBuzz");}
            else
                System.out.println(i);
        }

    }

    @And("^enter my \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\" and unique \"([^\"]*)\"$")
    public void enterMyAndUnique(String fName, String lName, String uName, String pWord, String pNumber, String email) throws Throwable {
        NewtoursRegisterPage newtoursRegisterPage = new NewtoursRegisterPage(base.driver);
        Utility.setRandomNumber(getRndNumbers());
        Utility.setUserName(uName);
        newtoursRegisterPage.enterFirstName(fName);
        newtoursRegisterPage.enterLastName(lName);
        newtoursRegisterPage.enterUserName(Utility.getUserName());
        newtoursRegisterPage.enterPassword(pWord);
        newtoursRegisterPage.enterPhoneNumber(pNumber);
//        newtoursRegisterPage.enterEmailAddress(getRndNumbers() + email);
        newtoursRegisterPage.enterEmailAddress(Utility.getRandomNumber() + email);
        System.out.println("My Random Number is :" + Utility.getRandomNumber());
    }

}
