package CreditScoreApplication;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Clients {
    UserPersonalClient userPersonalClient = new UserPersonalClient();
    UserBusinessClient userBusinessClient = new UserBusinessClient();
    ReturnToMainMenu returnToMainMenu = new ReturnToMainMenu();
    Scanner input = new Scanner(System.in);
    public Clients() throws FileNotFoundException {

    }

    public void addClient() throws IOException, InterruptedException {

        userPersonalClient.setName();
        userPersonalClient.setIsAdult();
        userPersonalClient.setMiddleName();
        userPersonalClient.setLastName();
        userPersonalClient.setEmail();
        userPersonalClient.setPhoneNumber();
        userPersonalClient.setIsSingle();
        userPersonalClient.setPassword();

        System.out.println("Konto zostało założone poprawnie");
        Thread.sleep(2000);
        ReturnToMainMenu.returnToMainMenu();
      //  writeToFile();

    }

    //to jest część do zapisu do pliku lokalnie
//    public void writeToFile() throws IOException {
//        PrintWriter write = new PrintWriter(new FileWriter("C:\\Users\\suchd\\Documents\\Clients.txt", true));
//        write.print(UserPersonalClient.getName());
//        write.println(UserPersonalClient.getMiddleName());
//        write.println(UserPersonalClient.getLastName());
//        write.println(UserPersonalClient.getEmail());
//        write.println(UserPersonalClient.getPhoneNumber());
//        write.close();
    public void addBusinessClient() throws IOException, InterruptedException {
        userBusinessClient.setName();
        userPersonalClient.setMiddleName();
        userBusinessClient.setLastName();
        userBusinessClient.setOwnsCompany();
        userBusinessClient.setCompanyIncome();
        userBusinessClient.setEmail();
        userBusinessClient.setPhoneNumber();
        userBusinessClient.setPassword();

        System.out.println("Konto firmowe zostało założone poprawnie");
        Thread.sleep(2000);
        ReturnToMainMenu.returnToMainMenu();
    }
    }





