package RunningCalculator;

public class HalfMarathon extends RunningDistances {


    public final Distances distance = Distances.HALFMARATHON;

    public HalfMarathon() {}

    public HalfMarathon(int hours, int minutes, int seconds, Distances distance) {
        super(hours, minutes, seconds, distance);
    }
}
