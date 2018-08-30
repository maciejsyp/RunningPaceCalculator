package RunningCalculator;

import java.util.Scanner;

import static RunningCalculator.Menu.menu;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);


        boolean backToMenu = true;
        while (backToMenu) {
            backToMenu = false;
            int choice = menu();

            if (choice == 1) {
                int minutes5K;
                int seconds5K;
                System.out.println("Podaj swój szacowany czas biegu na 5 kilometrów, najpierw liczbę minut, potem" +
                        "liczbę sekund. Za każdym razem potwierdź Enterem");
                minutes5K = in.nextInt();
                seconds5K = in.nextInt();

                FiveKilometers result = new FiveKilometers(minutes5K, seconds5K);
                System.out.println("Twoje szacowane tempo to: " + result.countPace() + " min/km");
            } else if (choice == 2) {
                int minutes10K;
                int seconds10K;
                System.out.println("Podaj swój szacowany czas biegu na 10 km, najpierw liczbę minut, potem liczbę" +
                        " sekund. Za każdym razem potwierdź Enterem");
                minutes10K = in.nextInt();
                seconds10K = in.nextInt();

                TenKilometers result2 = new TenKilometers(minutes10K, seconds10K);
                System.out.println("Twoje szacowane tempo to: " + result2.countPace() + " min/km");
            } else if (choice == 3) {
                int hours21K;
                int minutes21K;
                int seconds21K;
                System.out.println("Podaj swój szacowany czas półmaratonu, najpierw liczbę godzin, później minut," +
                        " a na koniec liczbę sekund. Za każdym razem potwierdź Enterem");
                hours21K = in.nextInt();
                minutes21K = in.nextInt();
                seconds21K = in.nextInt();

                HalfMarathon result3 = new HalfMarathon(hours21K, minutes21K, seconds21K);
                System.out.println("Twoje szacowane tempo to: " + result3.countPace() + " min/km");
            } else if (choice == 4) {
                int hours42K;
                int minutes42K;
                int seconds42K;
                System.out.println("Podaj swój szacowany czas maratonu, najpierw liczbę godzin, później minut, a " +
                        "na koniec liczbę sekund. Za każdym razem potwierdź enterem");
                hours42K = in.nextInt();
                minutes42K = in.nextInt();
                seconds42K = in.nextInt();

                Marathon result4 = new Marathon(hours42K, minutes42K, seconds42K);
                System.out.println("Twoje szacowane tempo to: " + result4.countPace() + " min/km");
            } else {
                System.out.println("Wprowadzono błędne dane. Podaj liczbę z zakresu 1 - 4");
                backToMenu = true;
            }
        }

        System.out.println("Dziękujemy za skorzystanie z kalkulatora tempa biegu");
        return;
    }

}