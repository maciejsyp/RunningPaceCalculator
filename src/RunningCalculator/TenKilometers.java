package RunningCalculator;

public class TenKilometers implements PaceCalculator {

    final int distance = 10000;

    private int expectedMinutes;
    private int expectedSeconds;

    public TenKilometers(int expectedMinutes, int expectedSeconds) {
        this.expectedMinutes = expectedMinutes;
        this.expectedSeconds = expectedSeconds;
    }

    @Override

    public String countPace(){
        int countedMinutesToSeconds = ((expectedMinutes * 60)) / (distance / 1000);
        int countedMinutes = countedMinutesToSeconds / 60;
        int countedSeconds = (countedMinutesToSeconds % 60) + ((expectedSeconds) / (distance / 1000));
        if(countedSeconds > 59){
            countedSeconds = countedSeconds - 59;
            countedMinutes++;
        }
        return (countedMinutes + ":" + countedSeconds);
    }

}

