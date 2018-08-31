package RunningCalculator;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.util.Scanner;

public class Menu {

    public static int menu() {
        System.out.println("Wybierz dystans, dla którego chcesz obliczyć szacowane tempo. Wybierz liczbę i potwierdź " +
                "Enterem:");
        System.out.println("  1. 5 kilometrów");
        System.out.println("  2. 10 kilometrów");
        System.out.println("  3. Półmaraton");
        System.out.println("  4. Maraton");

        Scanner in = new Scanner(System.in);
        int choice = in.nextInt();

        return choice;
    }
}