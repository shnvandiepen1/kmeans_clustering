import java.util.ArrayList;

public class Cluster {

    public Location centroid;

    private ArrayList<Location> points;

    public Cluster(Location locationCentroid){
        this.centroid = locationCentroid;
        this.points = new ArrayList<Location>();
    }

    public void addToCluster(Location location){
        this.points.add(location);
    }

    public ArrayList<Location> getPoints(){
        return this.points;
    }

}
