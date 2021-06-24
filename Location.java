public class Location {
   
    public int x;
    public int y; 

    public Location(int x, int y){
        this.x = x;
        this.y = y;
    }
   
    public double distanceTo(Location l1){
        double distance = 0.0;
        distance = Math.sqrt(Math.pow(this.x-l1.x, 2)+Math.pow(this.y-l1.y, 2));
        return distance;
    } 
}
