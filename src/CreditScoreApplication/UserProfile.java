package CreditScoreApplication;

import java.util.Scanner;

public class UserProfile<address> {

    private String streetName;
    private String buildingNumber;
    private String apartmentNumber;
    private String postCode;
    private String town;
    private String country;
    Scanner input = new Scanner(System.in);

    public UserProfile() {

            this.streetName = streetName;
            this.buildingNumber = buildingNumber;
            this.apartmentNumber = apartmentNumber;
            this.postCode = postCode;
            this.town = town;
            this.country = country;
    }

    public void setStreetName() {
        System.out.println("Podaj nazwę ulicy: ");
        streetName = input.nextLine();
    }

    public void setBuildingNumber() {
        System.out.println("Podaj numer budynku: ");
        buildingNumber = input.nextLine();
    }

    public void setApartmentNumber() {

        System.out.println("Czy posiadasz numer mieszkania? ");
        String answer = input.nextLine();
        if (answer.toLowerCase().equals("tak")) {
            System.out.println("Podaj numer mieszkania: ");
            apartmentNumber = input.nextLine();
        } else {
            System.out.println("-");
        }
    }

    public void setPostCode () {
        System.out.println("Podaj kod pocztowy: ");
        postCode = input.nextLine();
    }
    public void setTown() {
        System.out.println("Podaj nazwę miasta: ");
        town = input.nextLine();
    }
    public void setCountry() {
        System.out.println("Podaj nazwę państwa: ");
        country = input.nextLine();
    }

    public String getStreetName () {
        return streetName;
    }
    public String getBuildingNumber () {
        return buildingNumber;
    }
    public String getApartmentNumber () {
        return apartmentNumber;
    }
    public String getPostCode(){
        return postCode;
    }
    public String getTown() {
        return town;
    }
    public String getCountry () { return country; }

    public void AddAddress() {
        UserProfile userProfile = new UserProfile();

        userProfile.setStreetName();
        userProfile.setBuildingNumber();
        userProfile.setApartmentNumber();
        userProfile.setPostCode();
        userProfile.setTown();
        userProfile.setCountry();

        System.out.println("Ulica:  " + userProfile.getStreetName());
        System.out.println("Numer budynku: " + userProfile.getBuildingNumber());
        System.out.println("Numer mieszkania: " + userProfile.getApartmentNumber());
        System.out.println("Kod pocztowy: " + userProfile.getPostCode());
        System.out.println("Miasto: " + userProfile.getTown());
        System.out.println("Państwo: " + userProfile.getCountry());
        System.out.println("Dane zostały zapisane.");
    }
}

