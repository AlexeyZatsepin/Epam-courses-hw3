package kpi.study.epam.Views;

/**
 * Epam_homework_3_regexp
 * Created 5/3/16, with IntelliJ IDEA
 *
 * @author Alex
 */
public interface View {
    //constants block
    String FIRST_NAME_LABEL= "First name:";
    String SECOND_NAME_LABEL= "Second name:";
    String MIDDLE_NAME_LABEL=" Middle name";
    String NICKNAME_LABEL=" Nickname:";
    String COMMENT_LABEL="Comment(isn't require):";
    String GROUP_LABEL="Group, write ID:";
    String HOME_PHONE_LABEL="Home number:";
    String MOBILE_NUMBER_LABEL="Mobile number:";
    String EMAIL_LABEL="E-mail :";
    String SKYPE_LABEL="Skype:";
    String STREET_LABEL="Street:";
    String HOUSE_NUMBER_LABEL="House number:";
    String APARTAMENT_LABEL="Street:";
    String CITY_LABEL="City: ";
    String INDEX_LABEL="Adress INDEX: ";
    String WRONG_DATA="wrong data!";

    //TODO: adress values


    void showMessage(String message);

}
