// Brian Pucciani
// 11/24/2020
// Prompt the user for a name. Display the first, middle (if applicable), and 
// last name separately. If the name is too short or too long, display
// an error message.

import java.util.Scanner;

public class NameParserApp {

    public static void main(String[] args) {
        // Create a Scanner object
        Scanner sc = new Scanner(System.in);

        // Prompt the user for a name
        System.out.print("Enter a name: ");
        String name = sc.nextLine();
        System.out.println();
        
        // Trim the entered name to remove excess spaces
        name = name.trim();
        
        // Find the first space in the name
        int index1 = name.indexOf(" ");
        
        // If the name is too short, display an error message
        if(index1 == -1) {
            System.out.println("Invalid entry!");
        } else {
            // Find if there is a second space
            int index2 = name.indexOf(" ", index1 + 1);
            
            // If there is no second space, find the first and last name using
            // the location of the space
            if(index2 == -1) {
                String first = name.substring(0, index1);
                String last = name.substring(index1 + 1);
                
                // Display the first and last name
                System.out.println("First name: " + first);
                System.out.println("Last name: " + last);
                
            } else {
                // Find if there is a third space
                int index3 = name.indexOf(" ", index2 + 1);
                if (index3 == -1) {
                    // Find the first, middle, and last name using the locations
                    // of the spaces
                    String first = name.substring(0, index1);
                    String middle = name.substring(index1 + 1, index2);
                    String last = name.substring(index2 + 1);
                    
                    // Display the first, middle, and last name
                    System.out.println("First name: " + first);
                    System.out.println("Middle name: " + middle);
                    System.out.println("Last name: " + last);
                    
                } else {
                    // Display an error message if there is more tha 2 spaces
                    System.out.println("Invalid entry!");
                }
            }
        }
    }
}
