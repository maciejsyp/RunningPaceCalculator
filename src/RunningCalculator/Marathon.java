package RunningCalculator;

public class Marathon extends RunningDistances {

    private String type = "Marathon";

    public Marathon() {}

    public Marathon(String type) {
        this.type = type;
    }

    public Marathon(int hours, int minutes, int seconds) {
        super(hours, minutes, seconds);
    }
}


//    @Override
//
//    public String countPace(){
//
//        int countedHoursToMinutes = expectedHours * 60;
//        int countedMinutesToSeconds =
//                ((countedHoursToMinutes * 60) / (distance / 1000)) + ((expectedMinutes * 60)) / (distance / 1000);
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
