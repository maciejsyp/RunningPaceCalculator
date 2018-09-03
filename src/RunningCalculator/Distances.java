package RunningCalculator;

public enum Distances {
    KILOMETERS_5(5),
    KILOMETERS_10(10),
    HALFMARATHON(21.097),
    MARATHON(42.195);

    private final int HOURS_TO_SECONDS = 3600;
    private final int MINUTES_TO_SECONDS = 60;

    private double distance;

    Distances(double distance) {
        this.distance = distance;
    }

    public long convertToSeconds(int hours, int minutes, int seconds) {
        if (hours > 24 || minutes > 59 || seconds > 59) {
            System.out.println("Wprowadzono błędne dane.");
            boolean backToMenu = true;
        }
            int hoursToSeconds = hours * HOURS_TO_SECONDS;
            int minutesToSeconds = minutes * MINUTES_TO_SECONDS;
            int secondsToSeconds = seconds;
            long result = hoursToSeconds + minutesToSeconds + seconds;
            return result;
        }

        public String countPace (long timeInSeconds){
            double countedPaceInSeconds = (double) timeInSeconds / this.distance;
            String countedPace =
                    ((int) countedPaceInSeconds / MINUTES_TO_SECONDS) + ":" + (int) (countedPaceInSeconds % MINUTES_TO_SECONDS);
            return countedPace;
        }
    }