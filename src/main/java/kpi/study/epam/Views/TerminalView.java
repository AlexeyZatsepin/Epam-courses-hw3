package kpi.study.epam.Views;

/**
 * Epam_homework_3_regexp
 * Created 5/3/16, with IntelliJ IDEA
 *
 * @author Alex
 */
public class TerminalView implements View{

    @Override
    public void showMessage(String message) {
        System.out.println(message);
    }

    public void concatAndPrint(String... params){
        StringBuilder builder=new StringBuilder();
        for (String v:params){
            builder.append(v);
        }
        showMessage(builder.toString());
    }
}
