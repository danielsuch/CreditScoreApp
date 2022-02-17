package CreditScoreApplication;
import java.io.IOException;
import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

//import static CreditScoreApplication.AgeCalculator.calculateAge;

public class UserPersonalClient extends User {
    private boolean isSingle;
    private int isAdult;
    private String sourceOfIncome;
    private int annualIncome;
    Scanner scanner = new Scanner(System.in);
    ReturnToMainMenu returnToMainMenu = new ReturnToMainMenu();

    private LocalDate dob;

    public UserPersonalClient(String name, String middleName, String lastName, String phoneNumber, String email, String password) {
        super(name, middleName, lastName, phoneNumber, email, password);
    }


    public UserPersonalClient() {
        this.isSingle = isSingle;
        this.isAdult = isAdult;
        this.sourceOfIncome = sourceOfIncome;
        this.annualIncome = annualIncome;
    }

    public void setIsAdult() throws IOException, InterruptedException {
        System.out.println("Podaj datę urodzenia w formie YYYY-MM-DD: ");

        String birthDate = scanner.nextLine();
        LocalDate dob = LocalDate.parse(birthDate);
        if (calculateAge(dob) > 18) {
            System.out.println("Wiek potwierdzony, możesz przejść dalej i zalozyc konto");
            System.out.println("");
        } else {
            System.out.println("Nie masz ukończonych 18 lat i niestety mozesz zalozyc konta");
            returnToMainMenu.returnToMainMenu();
        }
    }

    public int calculateAge(LocalDate dob) {
        LocalDate curDate = LocalDate.now();
        if ((dob != null) && (curDate != null)) {
            return Period.between(dob, curDate).getYears();
        } else {
            return 0;
        }
    }

    public void setIsSingle() {
        System.out.println("Czy jesteś żonaty / zamężna? TAK/NIE");
        String answer = input.nextLine();
        if (answer.toLowerCase().equals("tak")) {
            isSingle = true;
        } else {
            isSingle = false;
        }
    }

    public int getIsAdult()
    {
        return isAdult;
    }

    public boolean getIsSingle()
    {
        return isSingle;
    }
}
