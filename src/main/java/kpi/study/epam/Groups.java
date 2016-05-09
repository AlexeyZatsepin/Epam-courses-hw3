package kpi.study.epam;

/**
 * Epam_homework_3_regexp
 * Created 5/6/16, with IntelliJ IDEA
 *
 * @author Alex
 */
public enum Groups {
    first(1),second(2),third(3);
    int value;
    Groups(int value) {
        this.value= value;
    }
    public static Groups getName(int value) {
        switch (value){
            case 1:
                return first;
            case 2:
                return second;
            case 3:
                return third;
        }
        return null;
    }
}
