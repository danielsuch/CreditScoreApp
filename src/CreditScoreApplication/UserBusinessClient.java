package CreditScoreApplication;

import java.io.IOException;
import java.util.Scanner;

public class UserBusinessClient extends User
{
    ReturnToMainMenu returnToMainMenu = new ReturnToMainMenu();
    boolean ownsCompany;
    int companyIncome;
    String companyName;
    Scanner input = new Scanner(System.in);


    public UserBusinessClient(String name,
                              String middleName,
                              String lastName,
                              String phoneNumber,
                              String email,
                              String password)
    {
        super(name, middleName, lastName, phoneNumber, email, password);
    }

    public UserBusinessClient()
    {
        this.ownsCompany = ownsCompany;
        this.companyIncome = companyIncome;
        this.companyName = companyName;
    }
    public void setOwnsCompany() throws IOException, InterruptedException {
        System.out.println("Czy posiadasz swoją działalność gospodarczą? TAK/NIE");
        String answer = input.nextLine();
        if (answer.toLowerCase().equals("tak")) {
            ownsCompany = true;
            System.out.println("Podaj nazwę firmy, którą prowadzisz:");
            companyName = input.nextLine();
        } else {
        ownsCompany = false;
        System.out.println("Nie możesz otworzyć konta firmowego, jeśli nie prowadzisz własnej działalności");
        System.out.println("");
        returnToMainMenu.returnToMainMenu();
    }

    }
    public void setCompanyIncome()
    {
        System.out.println("Jaki dochód w zeszłym roku osiągnęła twoja firma?");
        companyIncome = input.nextInt();
    }

    public String getCompanyName()
    {
        return companyName;
    }
    public int getCompanyIncome()
    {
        return companyIncome;
    }
}



