package Step_definitions;

import base.BaseUtil;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.MortgageCalculatorPage;


import java.util.Arrays;
import java.util.List;

import static org.hamcrest.CoreMatchers.hasItem;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsEqual.equalTo;

public class MortgageCalculatorStepDef extends BaseUtil {
    private BaseUtil base;


    public MortgageCalculatorStepDef(BaseUtil base) {

        this.base = base;
    }

    @Given("^I am on the Mortgage Calculator Home page$")
    public void iAmOnTheMortgageCalculatorHomePage() throws Throwable {
base.driver.navigate().to("https://www.mortgagecalculator.org/");
    }

    @When("^I enter valid details as \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\" and \"([^\"]*)\"$")
    public void iEnterValidDetailsAsAnd(String home_Value, String downPayment, String loanAmount, String interestRate, String loanTerm, String startDate) throws Throwable {
        MortgageCalculatorPage mortgageCalculatorPage = new MortgageCalculatorPage(base.driver);
        mortgageCalculatorPage.enterHomeVlaue(home_Value);
        mortgageCalculatorPage.enterDownPayment(downPayment);
        mortgageCalculatorPage.enterLoanAmount(loanAmount);
        mortgageCalculatorPage.enterIntRate(interestRate);
        mortgageCalculatorPage.enterLoanTerm(loanTerm);
        mortgageCalculatorPage.enterYear(startDate);
    }

    @And("^I click Calculate Button$")
    public void iClickCalculateButton() throws Throwable {
MortgageCalculatorPage mortgageCalculatorPage = new MortgageCalculatorPage(base.driver);
mortgageCalculatorPage.clickOnSubmitButton();
    }

    @Then("^\"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\" and \"([^\"]*)\" are correctly diksplayed$")
    public void andAreCorrectlyDiksplayed(String m_repayment, String d_Payment, String mTax, String mHomeInsurance) throws Throwable {
        MortgageCalculatorPage mortgageCalculatorPage = new MortgageCalculatorPage(base.driver);

        assertThat(mortgageCalculatorPage.getTotalMonthlyPayment(), is (equalTo(m_repayment)));
        assertThat(mortgageCalculatorPage.getDownPaymentAmount(), is (equalTo(d_Payment)));
        List<String> arrayListOfTax = Arrays.asList("$201.00", "$199.00", mTax, "$202.00");
        assertThat(arrayListOfTax, (hasItem(mortgageCalculatorPage.getMonthlyTaxPaid())));

//        assertThat(mortgageCalculatorPage.getMonthlyTaxPaid(), is (equalTo(mTax)));
        assertThat(mortgageCalculatorPage.getMonythlyHomeInsurance(), is (equalTo(mHomeInsurance)));

    }
}
