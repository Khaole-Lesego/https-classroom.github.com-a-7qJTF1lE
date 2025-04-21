/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package prog5121poe;
import java.util.Scanner;

/**
 *
 * @author leseg
 */
public class PROG5121POE {
    Scanner Input = new Scanner(System.in);
    public String UserName;
    public String Password = Input.nextLine();
    public int CellPhoneNumber = Input.nextInt();
    
   


    
    public boolean checkUserName(){
        
        if (UserName.contains("_") && UserName.length() <=5;){
          return true; 
    }
        
        
        
        
    }
    
   /* boolean checkPasswordComplexity(){
        
        
    }
    
    boolean checkCellPhoneNumber(){
        
    }
    
    String registerUser(){
        
    }

    
    boolean loginUser(){
        
    }
    
    String returnLoginStatus(){
        
    }
    
    
    
    public  boolean CheckUserName(String UserName, String Password, int CellPhoneNumber){
      this.UserName = UserName;
     this.Password = Password;    
     this.CellPhoneNumber = CellPhoneNumber;   
     return UserName.contains("_") && UserName.length() <=10;
  
    
for(int i = 0; i < Password.length(); i++){
    if (Character.isUpperCase(Password.charAt(i)) 
        && Character.isDigit(Password.charAt(i + 1))
        && !Character.isLetterOrDigit(Password.charAt(i + 2))) { // Check for special character
        return true;
    }
}

     /*if(UserName.contains("_") && UserName.length() <= 5){
    return true;
     }else {
     return false;
     }
      if(Password.isUpperCase() && Password.length() <= 8){
    return true;
     }else {
     return false; */
     



    
    
    
    
    
    public static void main(String[] args) {
         
    }
    
}
