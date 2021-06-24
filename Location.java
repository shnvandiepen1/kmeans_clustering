public class Location {
   
    public int x;
    public int y; 
   
    public double distanceTo(Location l1){
        double distance = 0.0;
        distance = Math.sqrt((this.x-l1.x)**2+(this.y-l1.y)**2);
    } 
}
