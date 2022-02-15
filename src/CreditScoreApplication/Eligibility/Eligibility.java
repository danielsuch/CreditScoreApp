package CreditScoreApplication.Eligibility;
import CreditScoreApplication.User;

import java.util.ArrayList;
import java.util.List;

public class Eligibility {
    public String name;
    public String defaultUserClass;
    public String desciption;
    public List<User> users;

    public static void grantPermission(User user, List<User> eligibleUsers) {
        eligibleUsers.add(user);
    }

    public void remove(User user) {
        this.getUsers().remove(user);
    }

    public static boolean hasPermission(User user, List<User> eligibleUsers) {
        for (User o : eligibleUsers) {
            if (user == o) {
                return true;
            }
        }
        return false;
    }

    public Eligibility(String name, String defaultUserClass, String desciption, List<User> users) {
        this.name = name;
        this.defaultUserClass = defaultUserClass;
        this.desciption = desciption;
        if(users==null)
            this.users = new ArrayList<>();
        else {
            this.setUsers(users);
        }
    }

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }

    public static List<Eligibility> SetUpPermissions() {
        List<Eligibility> permissions = new ArrayList<>();
        Eligibility superuser = new Eligibility("superuser", null, "Has full CRUD permissions to all the data. Can grant permissions.", null);
        Eligibility personalClient = new Eligibility("personalClient", "UserPersonalClient", "Has full CRUD permissions to personal data, can request a raport.", null);
        Eligibility businessClient = new Eligibility("businessClient", "UserBusinessClient", "Has full CRUD permissions to personal and company data,  can request a raport..", null);
        Eligibility employee = new Eligibility("employee", null, "Has full CRUD permissions to all the data.", null);
        permissions.add(superuser);
        permissions.add(personalClient);
        permissions.add(businessClient);
        permissions.add(employee);

        return permissions;
    }

}
