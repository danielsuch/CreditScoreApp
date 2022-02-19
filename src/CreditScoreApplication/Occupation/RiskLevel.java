package CreditScoreApplication.Occupation;

public enum RiskLevel {
        HIGH, MEDIUM, LOW;

    public double Indicator() {
        switch (this) {
            case HIGH:
                return 1;
            case MEDIUM:
                return 0.85;
            case LOW:
                return 0.75;
            default:
                return 0.7;
        }
    }
}
