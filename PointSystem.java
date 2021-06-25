import java.util.ArrayList;

public class PointSystem {

    private ArrayList<Location> points;
    private ArrayList<Cluster> clusters;

    public PointSystem(ArrayList<Location> p, ArrayList<Cluster> c){
        this.points = p;
        this.clusters = c; 
    }

    public void cluster(){
        for(Location location : points){
            int closestToIndex = 0;
            double smallestDistance = Double.MAX_VALUE;
            for(Cluster cluster : clusters){
                double distanceToCluster = cluster.centroid.distanceTo(location);
                if(distanceToCluster > 0.1 && distanceToCluster < smallestDistance){
                    closestToIndex = clusters.indexOf(cluster);
                    smallestDistance = distanceToCluster;
                }
                clusters.get(closestToIndex).addToCluster(location);
            }
        } 
        for(Cluster cluster : clusters){
            int totalX = 0;
            int totalY = 0;
            double avgX = 0.0;
            double avgY = 0.0;

            for(Location point : cluster.getPoints()){
                totalX += point.x;
                totalY += point.y;
            }

            avgX = totalX / cluster.getPoints().size();
            avgY = totalY / cluster.getPoints().size();
            Location newAvgLocation = new Location((int)avgX, (int)avgY);
            cluster.centroid = newAvgLocation;
        }
    }

    public ArrayList<Cluster> getClusters(){
        return this.clusters;
    }

}
