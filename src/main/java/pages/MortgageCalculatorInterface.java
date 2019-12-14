package pages;

public interface MortgageCalculatorInterface {
    public void enterHomeVlaue(String hValue);

    public void enterDownPayment(String dPayment);
    public void enterLoanAmount(String lAmount);
    public void enterIntRate(String intRate);
    public void enterLoanTerm(String lTerm);
    public void enterYear(String year);

    public void clickOnSubmitButton();

    public String getTotalMonthlyPayment();
    public String getDownPaymentAmount();

    public String getMonthlyTaxPaid();
    public String getMonythlyHomeInsurance();

}
