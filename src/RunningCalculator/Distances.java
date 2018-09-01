package RunningCalculator;

public enum Distances {
    KILOMETERS_5(5),
    KILOMETERS_10(10),
    HALFMARATHON(21.097),
    MARATHON(42.195);

    private final int MINUTES_TO_SECONDS = 60;

    private double distance;

    Distances(double distance) {
        this.distance = distance;
    }

    public String countPace(long timeInSeconds){
        double countedPaceInSeconds = (double) timeInSeconds/this.distance;
        String countedPace =
                ((int)countedPaceInSeconds / MINUTES_TO_SECONDS) + ":" + (int)(countedPaceInSeconds % MINUTES_TO_SECONDS);
        return countedPace;
    }
}
