package CreditScoreApplication.Occupation;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OccupationData {
    private List<Occupation> occupations = new ArrayList<>();
    Scanner input = new Scanner(System.in);

    public void SetOccupationHigh() {
        System.out.println("Podaj nazwę zawodu: ");
        String x = input.nextLine();
        Occupation occupationHigh = new Occupation(x, RiskLevel.HIGH);

        occupations.add(occupationHigh);
        System.out.println("Zawód: " + x + " dodano do grupy ryzyka: HIGH");
    }

    public void SetOccupationMedium () {
        System.out.println("Podaj nazwę zawodu: ");
        String x = input.nextLine();
        Occupation occupationMedium = new Occupation(x, RiskLevel.MEDIUM);

        occupations.add(occupationMedium);
        System.out.println("Zawód: " + x + " dodano do grupy ryzyka: MEDIUM");
    }

    public void SetOccupationLow () {
        System.out.println("Podaj nazwę zawodu: ");
        String x = input.nextLine();
        Occupation occupationLow = new Occupation(x, RiskLevel.LOW);

        occupations.add(occupationLow);
        System.out.println("Zawód: " + x + " dodano do grupy ryzyka: LOW");
    }

    public boolean add(Occupation occupation) {
        for (int i = 0; i < occupations.size(); i++) {
            if (occupations.get(i).getName() == occupation.getName())
                return false;
        }
        occupations.add(occupation);
        return true;
    }

    public void removeOccupation() {
        System.out.println("Podaj nazwę zawodu: ");
        String x = input.nextLine();
        OccupationData removeOccupation = new OccupationData();

        occupations.remove(removeOccupation);
        System.out.println("Usunięto zawód: " + x);
    }

    public void Manage() {
        OccupationData occupy = new OccupationData();
        Scanner scanner = new Scanner(System.in);
        boolean shouldContinue = true;

        while (shouldContinue) {
            System.out.println("Wybierz opcje: ");
            System.out.println("1 - Dodaj zawod do grupy ryzyka HIGH");
            System.out.println("2 - Dodaj zawod do grupy ryzyka MEDIUM");
            System.out.println("3 - Dodaj zawod do grupy ryzyka LOW");
            System.out.println("4 - Usun zawod");
            System.out.println("5 - Zakoncz");

            int userChoice = scanner.nextInt();

            switch (userChoice) {
                case 1 -> occupy.SetOccupationHigh();
                case 2 -> occupy.SetOccupationMedium();
                case 3 -> occupy.SetOccupationLow();
                case 4 -> occupy.removeOccupation();
                case 5 -> shouldContinue = false;
            }
        }
    }
}