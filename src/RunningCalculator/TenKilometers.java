package RunningCalculator;

public class TenKilometers extends RunningDistances {

    private String type = "TenKilometers";

    public TenKilometers() {}

    public TenKilometers(String type) {
        this.type = type;
    }

    public TenKilometers(int hours, int minutes, int seconds) {
        super(hours, minutes, seconds);
    }
}


//    @Override
//
//    public String countPace(){
//        int countedMinutesToSeconds = ((expectedMinutes * 60)) / (distance / 1000);
//        int countedMinutes = countedMinutesToSeconds / 60;
//        int countedSeconds = (countedMinutesToSeconds % 60) + ((expectedSeconds) / (distance / 1000));
//        if(countedSeconds > 59){
//            countedSeconds = countedSeconds - 59;
//            countedMinutes++;
//        }
//        return (countedMinutes + ":" + countedSeconds);
//    }
//
//}