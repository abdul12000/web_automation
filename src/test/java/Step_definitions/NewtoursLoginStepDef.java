package Step_definitions;

import base.BaseUtil;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import pages.NewtoursHomePage;
import pages.NewtoursRegisterPage;
import pages.NewtoursSignOnPage;
import pages.RegisterConfirmationPage;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsEqual.equalTo;

public class NewtoursLoginStepDef extends BaseUtil {
    private BaseUtil base;

    public NewtoursLoginStepDef(BaseUtil base) {
        this.base = base;
    }
    NewtoursHomePage newtoursHomePage = new NewtoursHomePage(base.driver);
    NewtoursSignOnPage newtoursSignOnPage = new NewtoursSignOnPage(base.driver);
    @When("^i click on Sign-On link$")
    public void iClickOnSignOnLink() throws Throwable {
//        NewtoursHomePage newtoursHomePage = new NewtoursHomePage(base.driver);
        newtoursHomePage.clickOnSignOnLink();
    }

    @And("^i enter valid Login details as \"([^\"]*)\" for Username and \"([^\"]*)\" for password$")
    public void iEnterValidLoginDetailsAsForUsernameAndForPassword(String uName, String pWord) throws Throwable {
//        NewtoursSignOnPage newtoursSignOnPage = new NewtoursSignOnPage(base.driver);
        newtoursSignOnPage.enterUsername(uName);
        newtoursSignOnPage.enterPassword(pWord);

    }

    @Then("^\"([^\"]*)\" page is displayed$")
    public void pageIsDisplayed(String pageTitle) throws Throwable {
        assertThat(base.driver.getTitle(), is(equalTo(pageTitle)));
    }

    @And("^click on Submit button$")
    public void clickOnSubmitButton() throws Throwable {
//        NewtoursSignOnPage newtoursSignOnPage = new NewtoursSignOnPage(base.driver);
        newtoursSignOnPage.clickOnSubmitButton();
    }

    @And("^i enter Invalid Login details as \"([^\"]*)\" for Username and \"([^\"]*)\" for password$")
    public void iEnterInvalidLoginDetailsAsForUsernameAndForPassword(String uName, String pWord) throws Throwable {
        iEnterValidLoginDetailsAsForUsernameAndForPassword(uName, pWord);
    }

    @And("^the correct image is displayed$")
    public void theCorrectImageIsDisplayed() throws Throwable {
        assertThat(base.driver.findElement(By.xpath("//img[@src='/images/masts/mast_flightfinder.gif']")).isDisplayed(), is(equalTo(true)));

    }
}
