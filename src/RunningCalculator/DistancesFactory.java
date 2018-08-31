package RunningCalculator;

public class DistancesFactory {

    public RunningDistances createDistance(String type) {
        RunningDistances distance = null;
        if (type.equals("FiveKilometers")) {
            distance = new FiveKilometers();
        } else if (type.equals("TenKilometers")) {
            distance = new TenKilometers();
        } else if (type.equals("HalfMarathon")) {
            distance = new HalfMarathon();
        } else if (type.equals("Marathon")) {
            distance = new Marathon();
        }
        return distance;
    }
}