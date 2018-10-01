// Name: Maurice Savage Netid: msavag5
/* potential enums for excepting larger range of inputs for directions
enum North{
    N,North, NORTH, n, north
}

enum East{
    E, East, EAST, e, east
}

enum South{
    S, South, SOUTH, s, south
}

enum West{
    W, West, WEST, w, west
}

enum Up{
    U, Up, UP,u, up
}

enum Down{
    D, Down, DOWN, d, down
}
*/

public class Direction {
    private int ID;
    private Place From;
    private Place To;
    private String Dir;
    private Boolean Locked;

    // direction constructor
    public Direction(int id, Place from, Place to, String dir) {
        ID = id;
        From = from;
        To = to;
        Dir = dir;
        Locked = false;
        return;
    }

    public boolean match(String s){
        /* potential code for use with enum
        North n[] = North.values();
        East e[] = East.values();
        South s[] = South.values();
        West w[] = West.values();

        for (North )
        */
        return Dir.equals(s);
    }

    // sets locked bool to true
    public void lock(){
        Locked = true;
    }

    // sets locked bool to false
    public void unlock(){
        Locked = false;
    }

    // returns the value of locked
    public boolean isLocked(){
        return Locked;
    }

    // returns to place if unlocked, otherwise the current place
    public Place follow(){
        if(!Locked) {
            return To;
        }
        return From;
    }

    // returns the direction
    public String getDirection(){
        return Dir;
    }

    // prints out all information related to direction
    public void print(){
        System.out.println("Direction ID is " + ID);
        System.out.println("Direction From is " + From.name());
        System.out.println("Direction To is " + To.name());
        System.out.println("Direction is " + Dir);
        if(Locked)
            System.out.println("Direction is locked");
        else
            System.out.println("Direction is unlocked");
    }
}
