package CreditScoreApplication.Calculator;

abstract class Calculator {
    protected CalculateCreditScoreInterface calculateCreditScoreInterface;
    private double interestRate;
    private double insurance;
    private double commission;

    public double doCalculateCreditScore(){
        return calculateCreditScoreInterface.calculateCreditScore();
    };

    public void printCalculateCreditScore(){
        System.out.println("Twoja zdolność kredytowa = " + doCalculateCreditScore() + " zł.");
    }

}
