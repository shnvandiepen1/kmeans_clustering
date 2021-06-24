import java.util.ArrayList;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class KMeans {

    private static ArrayList<Location> generatedRandCentroids = new ArrayList<Location>();

    public static final int XRANGE = 1000;
    public static final int YRANGE = 1000;

    public static ArrayList<Location> generateRandomCentroids(int amountOfClusters){
        for(int i = 0; i < amountOfClusters; i++){
            int randomX = ThreadLocalRandom.current().nextInt(0, XRANGE+1);
            int randomY = ThreadLocalRandom.current().nextInt(0, YRANGE+1);
            Location randomCentroid = new Location(randomX, randomY);
            generatedRandCentroids.add(randomCentroid);
        } 
        return generatedRandCentroids;
    }

}
