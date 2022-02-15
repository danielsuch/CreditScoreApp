package CreditScoreApplication;

import CreditScoreApplication.Eligibility.Eligibility;

import java.util.List;
import java.util.Scanner;

public class SuperUserDemo {

    public static void demoAuthenticateSuperuser(){

        Scanner input = new Scanner(System.in);
        boolean is_authenticated = authenticate();
        if(!is_authenticated)
            System.out.println("Nieporawne dane!");

        boolean shouldContinue = true;

        while (shouldContinue && is_authenticated) {
            System.out.println("Wybierz opcję: ");
            System.out.println("1 - Wyświetl listę dostępnych uprawnień");
            System.out.println("2 - Wyświetl uprawnienia użytkowników");
            System.out.println("3 - Zakończ");

        int userChoice = input.nextInt();

            switch (userChoice) {
                case 1 -> listEligibilites();
                case 2 -> listUsersEligibilites();
                case 3 -> shouldContinue = false;


        }
    }}

    public static boolean authenticate(){
        System.out.println("demo admin login site");
        System.out.println("first name: ");
        Scanner input = new Scanner(System.in);
        String firstName = input.next();
        System.out.println("last name:");
        String lastName = input.next();
        System.out.println("password:");
        String password = input.next();

        if(firstName.equals("John") && lastName.equals("Doe") && password.equals("secret")){
            return true;
        }
        return false;
    }


    public static void listEligibilites(){
        List<Eligibility> eligibilities = Eligibility.SetUpPermissions();
        for (Eligibility e: eligibilities){
            System.out.println(e.name);
            System.out.println(e.desciption);
        }
    }

    public static void listUsersEligibilites(){
        List<Eligibility> eligibilities = Eligibility.SetUpPermissions();
        for (Eligibility e: eligibilities){
            System.out.println(e.name);
            System.out.println(e.users);
        }
    }

}
