package RunningCalculator;

public class Marathon implements PaceCalculator {

    final int distance = 42195;

    private int expectedHours;
    private int expectedMinutes;
    private int expectedSeconds;


    public Marathon(int expectedHours, int expectedMinutes, int expectedSeconds) {
        this.expectedHours = expectedHours;
        this.expectedMinutes = expectedMinutes;
        this.expectedSeconds = expectedSeconds;
    }

    @Override

    public String countPace(){

        int countedHoursToMinutes = expectedHours * 60;
        int countedMinutesToSeconds =
                ((countedHoursToMinutes * 60) / (distance / 1000)) + ((expectedMinutes * 60)) / (distance / 1000);
        int countedMinutes = countedMinutesToSeconds / 60;
        int countedSeconds = (countedMinutesToSeconds % 60) + ((expectedSeconds) / (distance / 1000));
        if(countedSeconds > 59){
            countedSeconds = countedSeconds - 59;
            countedMinutes++;
        }
        return (countedMinutes + ":" + countedSeconds);
    }

}
