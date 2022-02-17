package CreditScoreApplication;

import java.io.IOException;
import java.util.Scanner;

import static CreditScoreApplication.Main.main;

public class ReturnToMainMenu
{
    public static void returnToMainMenu() throws IOException, InterruptedException
    {
        Scanner input = new Scanner(System.in);
        Thread.sleep(2000);
        System.out.println("Czy chcesz kontynuować?");
        System.out.println("1 - Tak");
        System.out.println("2 - Nie");
        int choice = input.nextInt();

        switch (choice)
        {
            case 1 -> main(null);
            case 2 -> System.exit(0);
        }
    }
}
