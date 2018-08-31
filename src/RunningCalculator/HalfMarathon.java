package RunningCalculator;

public class HalfMarathon extends RunningDistances {

    private String type = "HalfMarathon";

    public HalfMarathon() {}

    public HalfMarathon(String type) {
        this.type = type;
    }

    public HalfMarathon(int hours, int minutes, int seconds) {
        super(hours, minutes, seconds);
    }
}

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
