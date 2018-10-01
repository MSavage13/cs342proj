// Name: Maurice Savage Netid: msavag5

import java.util.Scanner;
import java.util.Vector;

public class Game {
    private String Name;
    private Place Current;
    private Vector<Place> Places;
    private Scanner scanner;

    // game constuctor
    public Game(String name){
        Name = name;
        Current = null;
        Places = new Vector<Place>();
        scanner = new Scanner(System.in);
        return;
    }

    // adds a place to place vector
    public void addPlace(Place p){
        if(Places.isEmpty())
            Current = p;
        Places.add(p);
    }

    // adds a line of asterisks to distinguish different blocks of information
    public void spacer(){
        System.out.println("\n**********************************************************\n");
    }

    // prints out all information related to game
    public void print(){
        System.out.println("Game Name is " + Name);
        System.out.println("Game Current place is " + Current.name());
        System.out.println("Game Place(s):");
        for(Place p : Places){
            System.out.println('\t' + p.name());
        }
    }

    // prompts user and takes in input
    public void play(){
        Current.display();
        String input = "";

        while(!input.equals("QUIT") && !input.equals("EXIT")){
            System.out.println("What would you like to do?");
            System.out.println("\tQUIT or EXIT");
            System.out.println("\tLOOK");
            System.out.println("\tGO {N, S, E, W, U, D}");
            System.out.print("Enter decision: ");

            input = scanner.nextLine();

            spacer();

            // based on input determines what should be executed
            switch(input){
                case "QUIT":

                case "EXIT":
                    System.out.println("Thanks for exploring!");
                    break;

                case "LOOK":
                    Current.display();
                    break;

                case "N":
                case "GO N":
                    Current = Current.followDirection("N");
                    Current.display();
                    break;
                case "E":
                case "GO E":
                    Current = Current.followDirection("E");
                    Current.display();
                    break;
                case "W":
                case "GO W":
                    Current = Current.followDirection("W");
                    Current.display();
                    break;
                case "U":
                case "GO U":
                    Current = Current.followDirection("U");
                    Current.display();
                    break;
                case "D":
                case "GO D":
                    Current = Current.followDirection("D");
                    Current.display();
                    break;
                case "S":
                case "GO S":
                    Current = Current.followDirection("S");
                    Current.display();
                    break;
                default:
                    System.out.println("Error: input is invalid. Please try again.");
            }

            // if user enters the exit room, quit
            if(Current.id() == 1){
                System.out.println("Thanks for exploring!");
                spacer();
                return;
            }

            spacer();
        }
    }
}
