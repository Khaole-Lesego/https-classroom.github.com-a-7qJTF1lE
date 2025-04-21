
 prog5121poe; // Defines the package name for organizing related classes.

import java.util.Scanner; // Imports the Scanner class for user input handling.

public class PROG5121POE { // Main class for the program, containing user registration and login functionalities.
    
    // Private variables to hold user information.
    private String username; // Stores the username of the user.
    private String password; // Stores the password of the user.
    private String cellPhoneNumber; // Stores the cell phone number of the user.
    private boolean isLoggedIn = false; // Tracks the login status of the user.
    
   


    
   // Method to check the validity of the username.
    public boolean checkUserName() {
        // Validates that the username contains an underscore and is no longer than 5 characters.
        if (username.contains("_") && username.length() <= 5) {
            System.out.println("Username successfully captured.");
            return true; // Returns true if username is valid.
        } else {
            // Error message for invalid username format.
            System.out.println("Username is not correctly formatted.\nPlease ensure that your username contains:\nAn underscore(_)\nAnd is no more than five characters in length.");
            return false; // Returns false if username is invalid.
        }
    }
        
        
        
        
    
    
   public boolean checkPasswordComplexity(){
        
        
    }
    
    boolean checkCellPhoneNumber(){
        
    }
    
    String registerUser(){
        
    }

    
    boolean loginUser(){
        
    }
    
    String returnLoginStatus(){
        
    }
    
    
    
    
     



    
    
    
    
    
    public static void main(String[] args) {
         
    }
    
}
