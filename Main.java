import java.util.ArrayList;

public class Main {

    public static void main(String[] args){

        ArrayList<Cluster> rc = KMeans.generateRandomCentroids(20);
        ArrayList<Location> pointList = KMeans.generateRandomPoints(900);

        PointSystem pointSystem = new PointSystem(pointList, rc);
        System.out.println("Before clustering");
        for(Cluster c : rc){
            System.out.println("Cluster x: " + c.centroid.x + " and y: " + c.centroid.y);
        }
        pointSystem.cluster();
        System.out.println("After clustering");
        for(Cluster c : rc){
            System.out.println("Cluster x: " + c.centroid.x + " and y: " + c.centroid.y);
        }
        
    }
}
