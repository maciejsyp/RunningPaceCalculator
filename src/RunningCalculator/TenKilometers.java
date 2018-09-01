package RunningCalculator;

public class TenKilometers extends RunningDistances {


    public final Distances distance = Distances.KILOMETERS_10;

    public TenKilometers() {}


    public TenKilometers(int hours, int minutes, int seconds, Distances distance) {
        super(hours, minutes, seconds, distance);
    }
}
