package CreditScoreApplication.Calculator;

public class BusinessCalculator extends Calculator{
    public BusinessCalculator() {
        calculateCreditScoreInterface = new BusinessCalculateCreditScore();
    }
}
