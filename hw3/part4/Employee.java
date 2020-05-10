package part4;

import java.util.Comparator;

public class Employee implements Cloneable, Comparator<Employee>
{
    private int id;
    private String name;

    public Employee(int id, String name)
    {
        this.id = id;
        this.name = name;
    }

    public Employee clone()
    {
        try 
        {
            Employee cloned = (Employee)super.clone();
//            cloned.id = id.clone();
//            cloned.name = name.clone();
            return cloned;
        } 
        catch(CloneNotSupportedException e)
        {
            return null; 
        }
    }

    @Override
    public int compare(Employee o1, Employee o2)
    {
        if (o1.id < o2.id)
        {
            return -1;
        }
        if (o1.id > o2.id)
        {
            return 1;
        }
        return 0;
    }


}
