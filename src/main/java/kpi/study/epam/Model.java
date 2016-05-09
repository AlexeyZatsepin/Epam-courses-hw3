package kpi.study.epam;

import java.util.Date;

/**
 * Epam_homework_3_regexp
 * Created 5/3/16, with IntelliJ IDEA
 *
 * @author Alex
 *
 * Model is user account entity
 */

public class Model {
    //
    String fio;
    String nickname;
    String comment;
    Groups group;
    String homeNumber;
    String mobileNumber;
    String email;
    String skype;
    String postalAdress;
    String adress;
    Date created;
    Date updated;

    public Model() {
    }

    public void setInstance(String fio, String nickname, String comment, Groups group, String homeNumber, String mobileNumber, String email, String skype, String postalAdress, String adress, Date created, Date updated) {
        this.fio = fio;
        this.nickname = nickname;
        this.comment = comment;
        this.group = group;
        this.homeNumber = homeNumber;
        this.mobileNumber = mobileNumber;
        this.email = email;
        this.skype = skype;
        this.postalAdress = postalAdress;
        this.adress = adress;
        this.created = created;
        this.updated = updated;
    }
}

