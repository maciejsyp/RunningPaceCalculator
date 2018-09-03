package RunningCalculator;

import java.util.InputMismatchException;
import java.util.Scanner;
import static RunningCalculator.Menu.menu;


public class Main {

    public static void main(String[] args) {

        boolean backToMenu = true;

        Scanner in = new Scanner(System.in);
        Messages message = new Messages();

        while (backToMenu) {

            try {
                backToMenu = false;
                int choice = menu();

                int hours;
                int minutes;
                int seconds;

                if (choice == 1) {
                    message.instructionMessage();
                    hours = in.nextInt();
                    minutes = in.nextInt();
                    seconds = in.nextInt();
                    long timeInSeconds = Distances.KILOMETERS_5.convertToSeconds(hours, minutes, seconds);
                    String countedPace = Distances.KILOMETERS_5.countPace(timeInSeconds);
                    message.resultMessage(countedPace);

                } else if (choice == 2) {
                    message.instructionMessage();
                    hours = in.nextInt();
                    minutes = in.nextInt();
                    seconds = in.nextInt();
                    long timeInSeconds = Distances.KILOMETERS_10.convertToSeconds(hours, minutes, seconds);
                    String countedPace = Distances.KILOMETERS_10.countPace(timeInSeconds);
                    message.resultMessage(countedPace);
                } else if (choice == 3) {
                    message.instructionMessage();
                    hours = in.nextInt();
                    minutes = in.nextInt();
                    seconds = in.nextInt();
                    long timeInSeconds = Distances.HALFMARATHON.convertToSeconds(hours, minutes, seconds);
                    String countedPace = Distances.HALFMARATHON.countPace(timeInSeconds);
                    message.resultMessage(countedPace);
                } else if (choice == 4) {
                    message.instructionMessage();
                    hours = in.nextInt();
                    minutes = in.nextInt();
                    seconds = in.nextInt();
                    long timeInSeconds = Distances.MARATHON.convertToSeconds(hours, minutes, seconds);
                    String countedPace = Distances.MARATHON.countPace(timeInSeconds);
                    message.resultMessage(countedPace);
                } else {
                    message.errorMessage();
                    backToMenu = true;
                }
            } catch (InputMismatchException i) {
                message.errorMessage();
                backToMenu = true;
            }
            message.endMessage();
            backToMenu = true;
        }
    }
}
