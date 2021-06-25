import java.util.ArrayList;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class KMeans {

    private static ArrayList<Cluster> generatedRandCentroids= new ArrayList<Cluster>();
    private static ArrayList<Location> generatedRandPoints = new ArrayList<Location>();

    public static final int XRANGE = 1000;
    public static final int YRANGE = 1000;

    public static ArrayList<Cluster> generateRandomCentroids(int amountOfClusters){
        for(int i = 0; i < amountOfClusters; i++){
            int randomX = ThreadLocalRandom.current().nextInt(0, XRANGE+1);
            int randomY = ThreadLocalRandom.current().nextInt(0, YRANGE+1);
            Location randomCentroid = new Location(randomX, randomY);
            Cluster randomCluster = new Cluster(randomCentroid);
            generatedRandCentroids.add(randomCluster);
        } 
        return generatedRandCentroids;
    }

    public static ArrayList<Location> generateRandomPoints(int amountOfPoints){
        for(int i = 0; i < amountOfPoints; i++){
            int randomX = ThreadLocalRandom.current().nextInt(0, XRANGE+1);
            int randomY = ThreadLocalRandom.current().nextInt(0, YRANGE+1);
            Location randomPoint = new Location(randomX, randomY);
            generatedRandPoints.add(randomPoint);
        } 
        return generatedRandPoints;
    }
}
