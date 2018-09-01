package RunningCalculator;

public abstract class RunningDistances extends PaceCalculator {

    protected int hours;
    protected int minutes;
    protected int seconds;
    protected Distances distance;

    public RunningDistances() {
    }


    public RunningDistances(int hours, int minutes, int seconds, Distances distance) {
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
        this.distance = distance;
    }



}