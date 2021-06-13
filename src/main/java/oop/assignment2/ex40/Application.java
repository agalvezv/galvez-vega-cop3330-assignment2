package oop.assignment2.ex40;
import java.util.Scanner;

public class Application {
    static Scanner inputs = new Scanner(System.in);
    
    
    public static void main(String[] args) {
        TableOrganization newMap = new TableOrganization();
        String searchS="";
        
        System.out.println("Enter a search string:");
        System.out.println("Parsing first names....");

        try{
            searchS = inputs.nextLine();
            
        }
        catch(Exception error)
        {
            System.out.println("There was an issue. Restart the program.");
        }
        
        
        newMap.initLists();
        newMap.rearrangeLists();
        System.out.println("Result:");
        newMap.searchLists(searchS);
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("Complete List of Employees:");
        newMap.allmapLists();


    }
}
