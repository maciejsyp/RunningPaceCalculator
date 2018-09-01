package RunningCalculator;

public class Messages {

    public Messages(){}

    void instructionMessage(){
        System.out.println("Wprowadź swój szacowany wynik. Najpierw podaj liczbę godzin, później minut i na końcu" +
                " sekund. Po każdej wartości potwierdź Enterem");
    }

    void resultMessage(String result){
        System.out.println("Twoje szacowane tempo, to: " + result + " min/km");
    }

    void errorMessage(){
        System.out.println("Wprowadzono błędne dane. Podaj liczbę z zakresu 1 - 4");
    }

    void endMessage(){
        System.out.println("Dziękujemy za skorzystanie z kalkulatora tempa biegu");
    }
}
