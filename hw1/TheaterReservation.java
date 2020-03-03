package hw1;

import java.io.File;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;

import java.util.Scanner;
import java.io.FileReader;
import java.io.BufferedReader;


public class TheaterReservation
{

    public static void main(String[] args) throws IOException
    {
        boolean running = true;

        Scanner sc = new Scanner(System.in);
        File myObj;
        //FileWriter myWriter = null;
        FileWriter myWriter = null;
        BufferedWriter bw = null;
        
        FileReader fr = null;
        BufferedReader br = null;
        
        int state = 1;

        myObj = new File("reservation.txt");
        if (myObj.exists())
        {
            System.out.println("file exists");
        }
        myWriter = new FileWriter(myObj, true);
        bw = new BufferedWriter(myWriter);
        
        fr = new FileReader(myObj);
        br = new BufferedReader(fr);
        
        while (running) 
        {    
        if (state==1)
            {
                System.out.println("Sign [U]p   Sign [I]n   E[X]it");
                String letter = sc.nextLine();
                if(letter.equalsIgnoreCase("u"))
                {
                    System.out.println("Enter User id");
                    // if username exists in file, say error
                    String id = sc.nextLine();
        
                    //myWriter.write(id);
        
                    System.out.println("Enter password");
                    String password = sc.nextLine();
        
                    //myWriter.write(password);
                    
                    bw.write("User ID: " + id + " , Password: " + password);
                    bw.newLine();
    
                    System.out.println("Account Saved");
                } 
                else if(letter.equalsIgnoreCase("i"))
                {
                    //System.out.println("null");
                    // Use buffered reader line by line to parse
                    System.out.println("Input user id");
                    String id = sc.nextLine();
                    boolean searching = true;
                    String line = "";
                    
                    Scanner idsearch = new Scanner(myObj);
                    while(searching)
                    {
                        line = idsearch.nextLine();
                        //System.out.println(line);
 
                        String[] words = line.split("\\s+");
                        for (String w : words)
                        {
                            if (w.equals(id))
                            {
                                System.out.println("ID found");
                                System.out.println("Input password");
                                String searchPass = sc.nextLine();
                                for (String w2 : words)
                                {
                                    if (w2.equals(searchPass))
                                    {
                                        System.out.println("User confirmed");
                                        state = 2;
                                        searching = false;
                                        break;
                                    }   
                                    
                                }
                                System.out.println("Wrong password");
                                
                            }
                        }                    
                        if (!idsearch.hasNextLine())
                          {
                              System.out.println("No user found");
                              searching = false;
                              break;
                          }
                        // String[] stringValidTokens = line.split(":");
                    }
                    idsearch.close();
                } 
                else if(letter.equalsIgnoreCase("x"))
                {
                    System.out.println("Program closing");
                    running = false;   
                    break;
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
                System.out.println("Enter date of show");  
                String date = sc.nextLine();
                System.out.println("Enter time of show");
                String time = sc.nextLine();
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
        bw.close(); // BufferedWriter Close
        myWriter.close(); // FileWriter Close
        br.close(); // BufferedReader Close
        fr.close(); // FileReader Close
        System.out.println("Reservation closed");

    }
}
