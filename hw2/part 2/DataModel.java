package part2;

import java.util.ArrayList;
import java.util.Observable;

import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

@SuppressWarnings("deprecation")
public class DataModel extends Observable
{
    ArrayList<Integer> data;
    ArrayList<ChangeListener> listeners;
    
    public DataModel(ArrayList<Integer> d)
    {
        data = d;
        listeners = new ArrayList<ChangeListener>();
    }

    /**
     Constructs a DataModel object
     @return the data in an ArrayList
     */
    public ArrayList<Integer> getData()
    {
        return (ArrayList<Integer>) (data.clone());
    }

    /**
     Attach a listener to the Model
     @param c the listener
     */
    public void attach(ChangeListener c)
    {
        listeners.add(c);
    }

    /**
     Change the data in the model at a particular location
     @param location the index of the field to change
     @param value the new value
     */
    public void update(int location, Integer value)
    {
        data.set(location, (value));
        for (ChangeListener l : listeners)
        {
            l.stateChanged(new ChangeEvent(this));
        }
    }
}
