package RunningCalculator;

public abstract class TimeConverter {

    private final int HOURS_TO_SECONDS = 3600;
    private final int MINUTES_TO_SECONDS = 60;


    public int calculateHoursToSeconds(int hours, int minutes, int seconds) {
        int hoursToSeconds = hours * HOURS_TO_SECONDS;
        int minutesToSeconds = minutes * MINUTES_TO_SECONDS;
        int secondsToSeconds = seconds;
        return hoursToSeconds + minutesToSeconds + seconds;
    }

    public int calculateMinutesToSeconds(int time) {
        return time * MINUTES_TO_SECONDS;
    }
}