package CreditScoreApplication.Calculator;

public class PersonalCalculator extends Calculator{
    public PersonalCalculator() {
        calculateCreditScoreInterface = new PersonalCalculateCreditScore();
    }
}
