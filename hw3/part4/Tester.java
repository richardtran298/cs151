package part4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Tester
{
    public static void main(String[] args)
    {
        ArrayList<Employee> list = new ArrayList<Employee>();
        list.add(new Employee(3, "Steve"));
        list.add(new Employee(1, "Bob"));
        list.add(new Employee(2, "Joe"));


        ArrayList<Employee> copyList = new ArrayList<Employee>();

        for (Employee e : list)
        {
            Employee cloned = e.clone();
            copyList.add(cloned);
        }

        Collections.sort(copyList, comp);
    }
}
