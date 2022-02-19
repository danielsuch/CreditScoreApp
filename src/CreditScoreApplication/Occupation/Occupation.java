package CreditScoreApplication.Occupation;

public class Occupation {
    private String name;
    private RiskLevel level;

    public Occupation(String name, RiskLevel level) {
        this.name = name;
        this.level = level;
    }

    public String getName() {
        return this.name;
    }

    public RiskLevel getRiskLevel() {
        return this.level;
    }
}
