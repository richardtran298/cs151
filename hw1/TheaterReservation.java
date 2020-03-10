package hw1;

import java.io.File;
import java.util.Scanner;
import java.io.FileReader;
import java.io.BufferedReader;


public class TheaterReservation
{

    public static void main(String[] args) 
    {
        boolean running = true;

        Scanner sc = new Scanner(System.in);    
        UserManagement UM = new UserManagement();
        
        Section s = new Section();
        
        int state = 1;

//        myObj = new File("reservation.txt");
//        if (myObj.exists())
//        {
//            System.out.println("file exists");
//        }
//     
        
        while (running) 
        {    
        if (state==1)
            {
                System.out.println("Sign [U]p   Sign [I]n   E[X]it");
                String letter = sc.nextLine();
                String username;
                String password;
                
                if(letter.equalsIgnoreCase("u"))
                {
                   System.out.println("Enter username");
                   username = sc.nextLine();
                   System.out.println("Enter password");
                   password = sc.nextLine();
                   UM.addUser(username, password);

                } 
                else if(letter.equalsIgnoreCase("i"))
                {
                    System.out.println("Enter username");
                    username = sc.nextLine();
                    if (UM.searchUser(username) == true) 
                    {
                        System.out.println("Enter password");
                        password = sc.nextLine();
                        if(UM.login(username, password) == true);
                        {
                            System.out.println("Successfully logged in");
                            state = 2;
                        }
                    }
                    else
                    {
                        System.out.println("User not found");
                    }
                        
                   
                } 
                else if(letter.equalsIgnoreCase("x"))
                {
                    
                }
                else
                {
                    break;
                }
            }  
        
        if (state == 2)
        {
            System.out.println("Transaction Mode Start");
            System.out.println("[R]eserve    [V]iew    [C]ancel    [O]ut");
            String letter = sc.nextLine();
            
            
            if (letter.equalsIgnoreCase("r"))
            {
                System.out.println("Enter date of show (MM/DD/YYYY)");  
                String date = sc.nextLine();
                System.out.println("Enter time of show (H:MM)");
                String time = sc.nextLine();
                s.getShow();
            }
            else if (letter.equalsIgnoreCase("v"))
            {
                
            }
            else if (letter.equalsIgnoreCase("c"))
            {
                
            }
            else if (letter.equalsIgnoreCase("o"))
            {
                System.out.println("Signed out");
                state = 1;   
            }
            else
            {
                break;
            }
        }        
    }
   
        sc.close(); // Scanner Close
        System.out.println("Reservation closed");

    }
}
