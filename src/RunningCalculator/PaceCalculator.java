package RunningCalculator;


public abstract class PaceCalculator {

    private final int HOURS_TO_SECONDS = 3600;
    private final int MINUTES_TO_SECONDS = 60;

    public long convertToSeconds(int hours, int minutes, int seconds) {
        int hoursToSeconds = hours * HOURS_TO_SECONDS;
        int minutesToSeconds = minutes * MINUTES_TO_SECONDS;
        int secondsToSeconds = seconds;
        long result = hoursToSeconds + minutesToSeconds + seconds;
        return result;

    }
}
