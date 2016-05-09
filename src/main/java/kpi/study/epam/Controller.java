package kpi.study.epam;


import com.sun.tools.doclint.Messages;
import kpi.study.epam.Views.TerminalView;
import kpi.study.epam.Views.View;

import java.util.Date;
import java.util.Scanner;

/**
 * Epam_homework_3_regexp
 * Created 5/3/16, with IntelliJ IDEA
 *
 * @author Alex
 */
public class Controller {

    // The Regex
    // example
    public static final String REGEX_WORD="^[A-Za-z]+$";
    // biff777
    public static final String REGEX_NICKNAME="^[A-Za-z0-9_-]{3,16}$";
    // «example@mail.com»
    public static final String REGEX_MAIL = "^([a-z0-9_-]+\\.)*[a-z0-9_-]+@[a-z0-9_-]+(\\.[a-z0-9_-]+)*\\.[a-z]{2,6}$";
    // «http://www.example.com»
    public static final String REGEX_URL = "^((https?|ftp)\\:\\/\\/)?([a-z0-9]{1})((\\.[a-z0-9-])|([a-z0-9-]))*\\.([a-z]{2,6})(\\/?)$";
    // «+38(044)555-55-55»
    public static final String REGEX_PHONE = "^\\+\\d{2}\\(\\d{3}\\)\\d{3}-\\d{2}-\\d{2}$";
    //for group id
    public static final String REGEX_GROUP="^[123]$";
    //apartaments and house numbers can't be over 999
    public static final String REGEX_BUILD_RESTRICTIONS="^[0-9]{3}$";
    //not required
    public static final String REGEX_NOT_REQUIRED="^[A-Za-z]{0,}?$";
    //postal index
    public static final String REGEX_POST_INDEX="[0-9]{6}";


    Model model;
    TerminalView view;


    Controller(Model model,TerminalView view){
        this.model = model;
        this.view = view;
    }

    //Work method
    public void processUser(){
        String name=inputValueWithScannerByRegexp(REGEX_WORD,View.FIRST_NAME_LABEL);
        String surname=inputValueWithScannerByRegexp(REGEX_WORD,View.SECOND_NAME_LABEL);
        String midlename=inputValueWithScannerByRegexp(REGEX_WORD,View.MIDDLE_NAME_LABEL);
        String nickname=inputValueWithScannerByRegexp(REGEX_NICKNAME,View.NICKNAME_LABEL);
        String comment=inputValueWithScannerByRegexp(REGEX_NOT_REQUIRED,View.COMMENT_LABEL);
        Groups group =Groups.getName(Integer.valueOf(inputValueWithScannerByRegexp(REGEX_GROUP,View.GROUP_LABEL)));
        String homeNumber=inputValueWithScannerByRegexp(REGEX_PHONE,View.HOME_PHONE_LABEL);
        String mobileNumber=inputValueWithScannerByRegexp(REGEX_PHONE,View.MOBILE_NUMBER_LABEL);
        String email=inputValueWithScannerByRegexp(REGEX_MAIL,View.EMAIL_LABEL);
        String skype=inputValueWithScannerByRegexp(REGEX_NICKNAME,View.SKYPE_LABEL);
        String adress=generateCommonFormAddress();
        String mailAdress=generateMailFormAddress(adress);
        Date created= new Date(System.currentTimeMillis());
        Date updated= new Date(System.currentTimeMillis());
        model.setInstance(generateFIO(name,surname,midlename),nickname,comment,group,homeNumber,
                mobileNumber,email,skype,adress,mailAdress,created,updated);



        //todo: set instance
    }

    /**
     * method for input checked data
     * @return String that maches pattern
     */
    public String inputValueWithScannerByRegexp(String pattern,String message) {
        Scanner sc = new Scanner(System.in);
        view.showMessage(message);
        while( !sc.hasNext(pattern)) {
            view.showMessage(View.WRONG_DATA);
            view.showMessage(message);
            sc.next();
        }
        return sc.next(pattern);
    }



    /**
     * method creates fio from first,second and middle name
     * @return FIO
     */
    private String generateFIO(String name,String surname,String middle){
        return surname + " " + name.charAt(0) + ". " + middle.charAt(0) + ". ";
    }
    /**
     * method creates  postal address that fits the common pattern
     * @return postal address
     */
    private String generateMailFormAddress(String commonAdress) {
        return (commonAdress +"\n" + inputValueWithScannerByRegexp(REGEX_WORD,View.CITY_LABEL) + "\n" + inputValueWithScannerByRegexp(REGEX_POST_INDEX,View.INDEX_LABEL));
    }

    /**
     * method creates address that fits the common pattern
     * @return common form address
     */
    private String generateCommonFormAddress() {
        return ("St " + inputValueWithScannerByRegexp(REGEX_WORD,View.STREET_LABEL) + ", "
                + inputValueWithScannerByRegexp(REGEX_BUILD_RESTRICTIONS,View.HOUSE_NUMBER_LABEL) + ", Apt "
                + inputValueWithScannerByRegexp(REGEX_BUILD_RESTRICTIONS,View.APARTAMENT_LABEL));
    }
}
