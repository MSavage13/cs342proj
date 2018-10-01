// Name: Maurice Savage Netid: msavag5
import java.io.File;
import java.util.Scanner;

public class GameTester {
    public static void main(String[] args) throws Exception{
        System.out.println("Name: Maurice Savage \t Netid: msavag5");

        // creates a new game and hard codes places and directions
        Game game = new Game("6 Rooms");
        Place p1 = new Place(12,"Entrance Hall", "\tYou are standing in the entrance hall of the great six-room dungeon\n\tThere are doors to the east and north, and a stairway leading down\n\tThe main exit ( from the game ) is to the west");
        Place p2 = new Place(13,"Ogre's Lair","\tYou have entered the Ogre's Lair!  Better leave before he wakes up . . .\n\tThere are doors to the south and the east");
        Place p3 = new Place(23,"Treasure Storeroom","\tYou have found a storeroom full of gold, jewels, and treasure!\n\tThere are doors to the north and south.");
        Place p4 = new Place(22,"Pool of Enchanment","\tYou are in a round room with a clear enchanting pool of water.\n\tThere are doors to the north and west.\n\tThere is a slide leading downwards to the floor below.");
        Place p5 = new Place(21,"Potions Lab","\tThere is a cauldron of thick green goop here,\n\tbubbling slowly over a cool blue flame.\n\tDoors lead to the west and east.");
        Place p6 = new Place(11,"Potions Storeroom","\tThis room has shelves full of bottles and jars\n\tSome labels read \"Powdered bat's wings\" and \"Toad eyes\".\n\tThere is a door to the east, and a stairway leading up.");
        Place p7 = new Place(1,"Exit","\tExit");
        Place p8 = new Place(0,"Nowhere","\tNowhere");

        Direction d1 = new Direction(1,p3,p2,"N");
        Direction d2 = new Direction(2, p2, p3,"E");
        Direction d3 = new Direction(3,p2,p1,"S");
        Direction d4 = new Direction(4,p1,p2,"N");
        Direction d5 = new Direction(5,p4,p3,"N");
            d5.lock();
        Direction d6 = new Direction(6,p3,p4,"S");
        Direction d7 = new Direction(7,p1,p7,"W");
        Direction d8 = new Direction(8,p1,p4,"E");
        Direction d9 = new Direction(9,p4,p1,"W");
        Direction d10 = new Direction(10,p1,p6,"D");
        Direction d11 = new Direction(11,p6,p1,"U");
        Direction d12 = new Direction(12,p4,p5,"D");
        Direction d13 = new Direction(13,p5,p6,"W");
        Direction d14 = new Direction(14,p6,p5,"E");
            d14.lock();
        Direction d15 = new Direction(15,p5,p8,"E");
            d15.lock();

        game.addPlace(p1);
        game.addPlace(p2);
        game.addPlace(p3);
        game.addPlace(p4);
        game.addPlace(p5);
        game.addPlace(p6);
        game.addPlace(p7);
        game.addPlace(p8);

        p1.addDirection(d4);
        p1.addDirection(d7);
        p1.addDirection(d8);
        p1.addDirection(d10);
        p2.addDirection(d2);
        p2.addDirection(d3);
        p3.addDirection(d1);
        p3.addDirection(d6);
        p4.addDirection(d5);
        p4.addDirection(d9);
        p4.addDirection(d12);
        p5.addDirection(d13);
        p5.addDirection(d15);
        p6.addDirection(d11);
        p6.addDirection(d14);

        game.play(); // starts the game

        /* potential code for parsing .gpd file
        File file = new File("C:\\Users\\mosterling13\\Documents\\UIC\\CS342\\msavag5Project1\\src\\sixRooms.gdf");
        Scanner scan = new Scanner(file);
        String line = scan.nextLine();

        while(scan.hasNextLine()) {
            if(line.isEmpty() || line.startsWith("//"))
                line = scan.nextLine();
            else if(line.startsWith("PLACES")){
                line = line.substring(6,line.indexOf('/')).trim();
                int places = Integer.parseInt(line);
                System.out.println(places);
                line = scan.nextLine();
            }
            else if(line.startsWith("*")) {
                String des = "\t" + line.substring(1).trim();
                line = scan.nextLine();
                while(line.startsWith("*")){
                    des = des + "\n\t" + line.substring(1).trim();
                    line = scan.nextLine();
                }
                System.out.println(des);
            }
            else if(line.startsWith("PATHS")){
                line = line.substring(5,line.indexOf('/')).trim();
                int places = Integer.parseInt(line);
                System.out.println(places);
                line = scan.nextLine();
            }
            else {
                System.out.println(line);
                line = scan.nextLine();
            }
        }
        */
    }
}
