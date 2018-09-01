package RunningCalculator;

public class DistancesFactory {

    public static RunningDistances createDistance(Distances givenDistance) {
        RunningDistances distance = null;
        if (givenDistance.equals(Distances.KILOMETERS_5)) {
            distance = new FiveKilometers();
        } else if (givenDistance.equals(Distances.KILOMETERS_10)) {
            distance = new TenKilometers();
        } else if (givenDistance.equals(Distances.HALFMARATHON)) {
            distance = new HalfMarathon();
        } else if (givenDistance.equals(Distances.MARATHON)) {
            distance = new Marathon();
        }
        return distance;
    }
}