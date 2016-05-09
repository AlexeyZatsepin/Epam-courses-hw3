package kpi.study.epam;

import kpi.study.epam.Views.TerminalView;

public class Main {

    public static void main(String[] args) {
        new Controller(new Model(),new TerminalView()).processUser();
    }
}
