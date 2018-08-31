package RunningCalculator;

public abstract class RunningDistances extends TimeConverter {

    private String type;
    protected int hours;
    protected int minutes;
    protected int seconds;

    public RunningDistances() {
    }

    public RunningDistances(String type) {
        this.type = type;
    }

    public RunningDistances(int hours, int minutes, int seconds) {
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }



}