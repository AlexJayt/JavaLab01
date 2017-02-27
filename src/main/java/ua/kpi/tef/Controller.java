package ua.kpi.tef;

import java.util.Scanner;

public class Controller {
    // Constructor
    Model model;
    View view;

    public Controller(Model model, View view) {
        this.model  = model;
        this.view = view;
    }

    // The Work method
    public void processUser() {
        Scanner sc = new Scanner(System.in);
        model.setValue(inputIntValueWithScanner(sc));

        view.printMessage(model.getLine());
    }

    public String inputIntValueWithScanner(Scanner sc) {
        view.printMessage(view.INPUT_DATA);
        String newLine = sc.nextLine();
        while( !newLine.equals(view.OUR_STRING)) {
            view.printMessage(view.WRONG_INPUT_DATA);
            newLine = sc.nextLine();
        }
        return newLine;
    }
}