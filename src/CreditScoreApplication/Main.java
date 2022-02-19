package CreditScoreApplication;

import CreditScoreApplication.Calculator.BusinessCalculator;
import CreditScoreApplication.Calculator.PersonalCalculator;
import CreditScoreApplication.Occupation.OccupationData;

import java.io.IOException;
import java.util.Scanner;

    public class Main {

        public static void main(String[] args) throws IOException, InterruptedException {

            Clients clients = new Clients();
            OccupationData occupy = new OccupationData();
            UserProfile address = new UserProfile();
            Scanner scanner = new Scanner(System.in);

            PersonalCalculator personalCalculator = new PersonalCalculator();
            BusinessCalculator businessCalculator = new BusinessCalculator();

                boolean shouldContinue = true;

                while (shouldContinue) {
                    System.out.println("Wybierz opcję: ");
                    System.out.println("1 - Zaloguj się");
                    System.out.println("2 - Załóż konto osobiste");
                    System.out.println("3 - Załóż konto firmowe");
                    System.out.println("4 - Oblicz zdolność kredytową dla firmy");
                    System.out.println("5 - Oblicz zdolność kredytową dla osoby prywatnej");
                    System.out.println("6 - Zawody - poziom ryzyka");
                    System.out.println("7 - Dodaj adres");
                    System.out.println("8 - Zakończ");


                    int userChoice = scanner.nextInt();

                    switch (userChoice) {
                        case 1 -> SuperUserDemo.demoAuthenticateSuperuser();
                        case 2 -> clients.addClient();
                        case 3 -> clients.addBusinessClient();
                        case 4 -> personalCalculator.printCalculateCreditScore();
                        case 5 -> businessCalculator.printCalculateCreditScore();
                        case 6 -> occupy.Manage();
                        case 7 -> address.AddAddress();
                        case 8 -> shouldContinue = false;

                    }
                }
            }
        }








