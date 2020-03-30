package hw1;

import java.util.ArrayList;

public class Reservation
{
    private int mf = 45;
    private int mflr = 35;
    private int sb = 50;
    private int sb2 = 55;
    private int wb = 40;
    private int eb = 40;
    private Show s;   
    private User userr;

    
    public Reservation(Show s, User userr, ArrayList<String> reservation)
    {
        this.s = s;
        this.userr = userr;
        
    }
    
}
