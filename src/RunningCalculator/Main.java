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
                    RunningDistances distance = new FiveKilometers(hours, minutes, seconds);
                    distance.calculateHoursToSeconds(hours, minutes, seconds);
                } else if (choice == 2) {
                    hours = in.nextInt();
                    minutes = in.nextInt();
                    seconds = in.nextInt();
                    RunningDistances distance = new TenKilometers(hours, minutes, seconds);

                } else if (choice == 3) {
                    hours = in.nextInt();
                    minutes = in.nextInt();
                    seconds = in.nextInt();
                    RunningDistances distance = new HalfMarathon(hours, minutes, seconds);

                } else if (choice == 4) {
                    hours = in.nextInt();
                    minutes = in.nextInt();
                    seconds = in.nextInt();
                    RunningDistances distance = new Marathon(hours, minutes, seconds);

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





//System.out.println("Podaj swój szacowany czas biegu na 5 kilometrów, najpierw liczbę minut, potem" +
////                                        "liczbę sekund, rozdzielając je dwukropkiem");
//        int minutes5K;
//        int seconds5K;
//        System.out.println("Podaj swój szacowany czas biegu na 5 kilometrów, najpierw liczbę minut, potem" +
//        " liczbę sekund. Za każdym razem potwierdź Enterem");
//        minutes5K = in.nextInt();
//        seconds5K = in.nextInt();
//
////                    DistancesFactory distance = new DistancesFactory();
////                    distance.createDistance("Five kilometers");
//        System.out.println("Twoje szacowane tempo to:  min/km");
//
//
//    int minutes10K;
//    int seconds10K;
//                    System.out.println("Podaj swój szacowany czas biegu na 10 km, najpierw liczbę minut, potem liczbę" +
//                            " sekund. Za każdym razem potwierdź Enterem");
//                            minutes10K = in.nextInt();
//                            seconds10K = in.nextInt();
////
//////                    TenKilometers result2 = new TenKilometers();
//////                    System.out.println("Twoje szacowane tempo to: " + result2.countPace() + " min/km");
//int hours21K;
//    int minutes21K;
//    int seconds21K;
//                    System.out.println("Podaj swój szacowany czas półmaratonu, najpierw liczbę godzin, później minut," +
//                            " a na koniec liczbę sekund. Za każdym razem potwierdź Enterem");
//                            hours21K = in.nextInt();
//                            minutes21K = in.nextInt();
//                            seconds21K = in.nextInt();
////
////                    HalfMarathon result3 = new HalfMarathon();
//////                    System.out.println("Twoje szacowane tempo to: " + result3.countPace() + " min/km");
//int hours42K;
//    int minutes42K;
//    int seconds42K;
//                    System.out.println("Podaj swój szacowany czas maratonu, najpierw liczbę godzin, później minut, a " +
//                            "na koniec liczbę sekund. Za każdym razem potwierdź enterem");
//                            hours42K = in.nextInt();
//                            minutes42K = in.nextInt();
//                            seconds42K = in.nextInt();
////
////                    Marathon result4 = new Marathon();
////                    System.out.println("Twoje szacowane tempo to: " + result4.countPace() + " min/km");