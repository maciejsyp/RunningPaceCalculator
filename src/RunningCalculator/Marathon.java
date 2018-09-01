package RunningCalculator;

public class Marathon extends RunningDistances {


    public final Distances distance = Distances.MARATHON;

    public Marathon() {}

    public Marathon(int hours, int minutes, int seconds, Distances distance) {
        super(hours, minutes, seconds, distance);
    }
}
