package RunningCalculator;

public class FiveKilometers extends RunningDistances {

    public final Distances distance = Distances.KILOMETERS_5;

    public FiveKilometers(){}


    public FiveKilometers(int hours, int minutes, int seconds, Distances distance) {
        super(hours, minutes, seconds, distance);
    }
}


