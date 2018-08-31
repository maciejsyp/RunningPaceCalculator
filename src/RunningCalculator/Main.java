package RunningCalculator;

import java.util.InputMismatchException;
import java.util.Scanner;
import static RunningCalculator.Menu.menu;


public class Main {

    public static void main(String[] args) {

        boolean backToMenu = true;

        Scanner in = new Scanner(System.in);

        while (backToMenu) {

            try {
                backToMenu = false;
                int choice = menu();

                int hours;
                int minutes;
                int seconds;

                if (choice == 1) {
//                 DistancesFactory distance1 = new DistancesFactory();
//                 distance1.createDistance("FiveKilometers");
                    hours = in.nextInt();
                    minutes = in.nextInt();
                    seconds = in.nextInt();
                    RunningDistances distance = new FiveKilometers(hours, minutes, seconds, Distances.KILOMETERS_5);
                    long timeInSeconds = distance.convertToSeconds(hours, minutes, seconds);
                    String countedPace = Distances.KILOMETERS_5.countPace(timeInSeconds);
                    System.out.println(countedPace);

                } else if (choice == 2) {
                    hours = in.nextInt();
                    minutes = in.nextInt();
                    seconds = in.nextInt();
                    RunningDistances distance = new FiveKilometers(hours, minutes, seconds, Distances.KILOMETERS_10);
                    long timeInSeconds = distance.convertToSeconds(hours, minutes, seconds);
                    String countedPace = Distances.KILOMETERS_10.countPace(timeInSeconds);
                    System.out.println(countedPace);
                } else if (choice == 3) {
                    hours = in.nextInt();
                    minutes = in.nextInt();
                    seconds = in.nextInt();
                    RunningDistances distance = new FiveKilometers(hours, minutes, seconds, Distances.HALFMARATHON);
                    long timeInSeconds = distance.convertToSeconds(hours, minutes, seconds);
                    String countedPace = Distances.HALFMARATHON.countPace(timeInSeconds);
                    System.out.println(countedPace);
                } else if (choice == 4) {
                    hours = in.nextInt();
                    minutes = in.nextInt();
                    seconds = in.nextInt();
                    RunningDistances distance = new FiveKilometers(hours, minutes, seconds, Distances.MARATHON);
                    long timeInSeconds = distance.convertToSeconds(hours, minutes, seconds);
                    String countedPace = Distances.MARATHON.countPace(timeInSeconds);
                    System.out.println(countedPace);
                } else {
                    System.out.println("Wprowadzono błędne dane. Podaj liczbę z zakresu 1 - 4");
                    backToMenu = true;
                }
            } catch (InputMismatchException i) {
                System.out.println("Wprowadzono błędne dane. Podaj liczbę z zakresu 1 - 4");
                backToMenu = true;
            }
        }
            System.out.println("Dziękujemy za skorzystanie z kalkulatora tempa biegu");
            return;

    }
}
