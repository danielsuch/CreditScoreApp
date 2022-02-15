package CreditScoreApplication.Eligibility;

import java.util.ArrayList;
import java.util.List;

public class SetUpPermissions {
    public List<Eligibility> permissions = new ArrayList<>();

    public SetUpPermissions() {
        Eligibility superuser = new Eligibility("superuser", null, "Has full CRUD permissions to all the data. Can grant permissions.", null);
        Eligibility personalClient = new Eligibility("personalClient", "UserPersonalClient", "Has full CRUD permissions to personal data, can request a raport.", null);
        Eligibility businessClient = new Eligibility("businessClient", "UserBusinessClient", "Has full CRUD permissions to personal and company data, can request a raport.", null);
        Eligibility employee = new Eligibility("employee", null, "Has full CRUD permissions to all the data.", null);
        this.permissions.add(superuser);
        this.permissions.add(personalClient);
        this.permissions.add(businessClient);
        this.permissions.add(employee);

        this.permissions = permissions;
    }

}

