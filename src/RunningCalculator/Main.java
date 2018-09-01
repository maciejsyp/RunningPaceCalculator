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
                    RunningDistances distance = DistancesFactory.createDistance(Distances.KILOMETERS_5);
                    message.instructionMessage();
                    hours = in.nextInt();
                    minutes = in.nextInt();
                    seconds = in.nextInt();
                    long timeInSeconds = distance.convertToSeconds(hours, minutes, seconds);
                    String countedPace = Distances.KILOMETERS_5.countPace(timeInSeconds);
                    message.resultMessage(countedPace);

                } else if (choice == 2) {
                    RunningDistances distance = DistancesFactory.createDistance(Distances.KILOMETERS_10);
                    message.instructionMessage();
                    hours = in.nextInt();
                    minutes = in.nextInt();
                    seconds = in.nextInt();
                    long timeInSeconds = distance.convertToSeconds(hours, minutes, seconds);
                    String countedPace = Distances.KILOMETERS_10.countPace(timeInSeconds);
                    message.resultMessage(countedPace);
                } else if (choice == 3) {
                    RunningDistances distance = DistancesFactory.createDistance(Distances.HALFMARATHON);
                    message.instructionMessage();
                    hours = in.nextInt();
                    minutes = in.nextInt();
                    seconds = in.nextInt();
                    long timeInSeconds = distance.convertToSeconds(hours, minutes, seconds);
                    String countedPace = Distances.HALFMARATHON.countPace(timeInSeconds);
                    message.resultMessage(countedPace);
                } else if (choice == 4) {
                    RunningDistances distance = DistancesFactory.createDistance(Distances.MARATHON);
                    message.instructionMessage();
                    hours = in.nextInt();
                    minutes = in.nextInt();
                    seconds = in.nextInt();
                    long timeInSeconds = distance.convertToSeconds(hours, minutes, seconds);
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
