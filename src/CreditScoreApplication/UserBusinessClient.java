package CreditScoreApplication;

public class UserBusinessClient extends User
{

    boolean ownsCompany;
    int companyIncome;
    String companyName;


    public UserBusinessClient(String name,
                              String middleName,
                              String lastName,
                              String phoneNumber,
                              String email,
                              String password)
    {
        super(name, middleName, lastName, phoneNumber, email, password);
    }

}
