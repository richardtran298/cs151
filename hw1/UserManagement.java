package hw1;

import java.util.HashMap;


public class UserManagement
{
    HashMap<String, String> users;
    
    public UserManagement()
    {
        users = new HashMap<>();
    }
    
    public void addUser(String username, String password)
    {
        users.put(username,password);
    }
    
    public boolean login(String username, String password)
    {
        for (String key : users.keySet())
        {
            if (key.equalsIgnoreCase(username))
            {
                if(users.get(key).equalsIgnoreCase(password))
                {
                    return true;
                }                
            }
        }
        return false;
    }
        
    public boolean searchUser(String username)
    {
        for (String key : users.keySet())
        {
            if (key.equalsIgnoreCase(username))
            {
                return true;         
            }
        }
        return false;
    }
}
