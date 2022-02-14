package CreditScoreApplication;

import CreditScoreApplication.Calculator.BusinessCalculateCreditScore;
import CreditScoreApplication.Calculator.BusinessCalculator;
import CreditScoreApplication.Calculator.PersonalCalculator;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

    public class Main {
        public static void main(String[] args) throws IOException, InterruptedException
        {
            Clients clients = new Clients();
            Scanner scanner = new Scanner(System.in);

            PersonalCalculator personalCalculator = new PersonalCalculator();
            BusinessCalculator businessCalculator = new BusinessCalculator();

            boolean shouldContinue = true;

            while (shouldContinue) {
                System.out.println("Wybierz opcję: ");
                System.out.println("1 - Zaloguj się");
                System.out.println("2 - Załóż konto osobiste");
                System.out.println("3 - Załóż konto biznesowe");
                System.out.println("4 - Oblicz zdolność kredytową dla firmy");
                System.out.println("5 - Oblicz zdolność kredytową dla osoby prywatnej");
                System.out.println("linia testowa");
                System.out.println("6 - Zakończ");


                int userChoice = scanner.nextInt();

                switch (userChoice) {
//                case 1 ->
                    case 2 -> clients.addClient();
//                    case 3 -> shouldContinue = false;
                    case 4 -> personalCalculator.printCalculateCreditScore();
                    case 5 -> businessCalculator.printCalculateCreditScore();
                    case 6 -> shouldContinue = false;

                }


            }
        }
    }


