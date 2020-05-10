package part3;

public class Television
{
    public void changeChannel(Channel c) 
    {
        switch(c)
        {
        case ABC: System.out.println("Channel switched to ABC");
        case CBS: System.out.println("Channel switched to CBS");
        case PBS: System.out.println("Channel switched to PBS");
        case NBC: System.out.println("Channel switched to NBC");
        }
    }
}
