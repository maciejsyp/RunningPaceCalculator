package RunningCalculator;

public enum Distances {
    KILOMETERS_5(5),
    KILOMETERS_10(10),
    HALFMARATHON(21.097),
    MARATHON(42.195);

    private double distance;

    Distances(double distance){

        this.distance = distance;
    }

    public double getDistance(){
        return distance;
    }

    public double countPace(long timeInSeconds){
        return (double) timeInSeconds/this.distance;
    }
}