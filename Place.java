// Name: Maurice Savage Netid: msavag5
import java.util.Vector;

public class Place {
    private int ID;
    private String Name;
    private String Desc;
    private Vector<Direction> Directions;

    // place constructor
    public Place(int id, String name, String desc){
        ID = id;
        Name = name;
        Desc = desc;
        Directions = new Vector<Direction>();
        return;
    }

    // returns the name of the place
    public String name(){
        return Name;
    }

    // returns the id of the place
    public int id(){
        return ID;
    }

    // returns the description of the place
    public String description(){
        return Desc;
    }

    // prints the description of the place
    public void display(){
        System.out.println(Desc);
    }

    // adds a direction to the direction vector
    public void addDirection(Direction d){
        Directions.add(d);
    }

    // searches direction vector for a direction matching input
    public Place followDirection(String dir){
        for(Direction d : Directions){
            if(d.match(dir)){
                if(d.isLocked()) { // if locked, prints that it is locked and returns current place
                    System.out.println("It appears to be locked. Try again.");
                    return this;
                }
                return d.follow();
            }
        }
        // input direction was not found, print message and return current place
        System.out.println("Can't go that way. Try again.");
        return this;
    }

    // prints out all information related to place
    public void print(){
        System.out.println("Place ID: " + ID);
        System.out.println("Place Name: " + Name);
        System.out.println("Place Description:\n " + Desc);
        System.out.println("Place Direction(s):");
        for(Direction d : Directions){
            System.out.print('\t' + d.getDirection());
        }
    }
}
