package CreditScoreApplication;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

    public class Main {
        public static void main(String[] args) throws IOException, InterruptedException
        {
            Clients clients = new Clients();
            Scanner scanner = new Scanner(System.in);
            boolean shouldContinue = true;

            while (shouldContinue) {
                System.out.println("Wybierz opcję: ");
                System.out.println("1 - Zaloguj się");
                System.out.println("2 - Załóż konto osobiste");
                System.out.println("3 - Załóż konto biznesowe");
                System.out.println("4 - Zakończ");


                int userChoice = scanner.nextInt();

                switch (userChoice) {
//                case 1 ->
                    case 2 -> clients.addClient();
//                    case 3 -> shouldContinue = false;
                    case 4 -> shouldContinue = false;

                }


            }
        }
    }


