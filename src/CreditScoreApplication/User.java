package CreditScoreApplication;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class User<user>
{


    private  String name;
    private  String middleName;
    private  String lastName;
    private  String phoneNumber;
    private  String email;
    private String password;
    private boolean isActive = true;
    private String fullName = name + "" + middleName + "" + lastName;
    Scanner input = new Scanner(System.in);

    public User()
    {

    }
    public User(String name,
                String middleName,
                String lastName,
                String phoneNumber,
                String email,
                String password)

    {
        this.name = name;
        this.middleName = middleName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.password = password;
    }


    public void setName()
    {
        System.out.println("Podaj imię: ");
        name = input.nextLine();

    }
    public void setMiddleName()
    {
        boolean hasLastName = false;
        System.out.println("Czy posiadasz drugie imię?");
        String answer = input.nextLine();
        if (answer.toLowerCase().equals("tak"))
        {
            hasLastName = true;
            System.out.println("Podaj drugie imię:");
            middleName = input.nextLine();
        }else{
            hasLastName = false;
        }
    }
        public void setLastName()
        {
            System.out.println("Podaj nazwisko: ");
            lastName = input.nextLine();
        }
    public void setPhoneNumber()
    {
        System.out.println("Podaj numer telefonu: ");
        phoneNumber = input.nextLine();
    }
    public void setEmail()
    {

        System.out.println("Podaj adres email: ");
        email = input.nextLine();

    }
    public void setPassword() throws FileNotFoundException
    {
        System.out.println("Podaj hasło: ");
        PrintWriter write = new PrintWriter("C:\\Users\\suchd\\Documents\\passwords.txt");
        password = input.nextLine();
        write.println(password);
        write.close();
    }

    public String getName()
    {
        return name;
    }
    public  String getMiddleName()
    {
        return middleName;
    }
    public  String getLastName()
    {
        return lastName;
    }
    public String getPhoneNumber()
    {
        return phoneNumber;
    }
    public String getEmail()
    {
        return email;
    }
    public String getPassword()
    {
        return password;
    }


    // create demo superuser
    public User(String name, String middleName, String lastName, String phoneNumber, String email, String password, boolean isActive, String fullName) {
        this.name = "John";
        this.middleName = "Johnny";
        this.lastName = "Doe";
        this.phoneNumber = "123321123";
        this.email = "johndoe@xd.com";
        this.password = "secret";
        this.isActive = true;
        this.fullName = "John Johnny Doe";
    }

}
