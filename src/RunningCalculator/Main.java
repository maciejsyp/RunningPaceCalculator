package RunningCalculator;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Main {

    public static int menu(){
        System.out.println("Wybierz dystans, dla którego chcesz obliczyć szacowane tempo. Wybierz liczbę i potwierdź " +
                "Enterem:");
        System.out.println("     1. 5 kilometrów");
        System.out.println("     2. 10 kilometrów");
        System.out.println("     3. Półmaraton");
        System.out.println("     4. Maraton");

        Scanner in = new Scanner(System.in);
        int choice = in.nextInt();

        return choice;
    }

    public static void main(String[] args) throws InterruptedException {

        Scanner in = new Scanner(System.in);

        int choice = menu();

        while(choice != 0){
            switch(choice){
                case 1:
                    int minutes5K;
                    int seconds5K;
                    System.out.println("Podaj swój szacowany czas biegu na 5 kilometrów, najpierw liczbę minut, potem" +
                            "liczbę sekund. Za każdym razem potwierdź Enterem");
                    minutes5K = in.nextInt();
                    seconds5K = in.nextInt();

                    FiveKilometers result = new FiveKilometers(minutes5K, seconds5K);
                    System.out.println("Twoje szacowane tempo to: " + result.countPace() + " min/km");
                    break;

                case 2:
                    int minutes10K;
                    int seconds10K;
                    System.out.println("Podaj swój szacowany czas biegu na 10 km, najpierw liczbę minut, potem liczbę" +
                            " sekund. Za każdym razem potwierdź Enterem");
                    minutes10K = in.nextInt();
                    seconds10K = in.nextInt();

                    TenKilometers result2 = new TenKilometers(minutes10K, seconds10K);
                    System.out.println("Twoje szacowane tempo to: " + result2.countPace() + " min/km");
                    break;

                case 3:
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
                    break;

                case 4:
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
                    break;
            }
            System.out.println("Dziękujemy za skorzystanie z kalkulatora tempa biegu");
            TimeUnit.SECONDS.sleep(3);
            menu();
        }
    }
}

