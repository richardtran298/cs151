package lab4v2;

import java.util.Iterator;

public abstract class Sequence<E> implements Iterator<E>
{
    private E[] data;
    private int size;
    private int count = 0;
    
    public Sequence()
    {
        data = (E[]) new Object[10];
        size = data.length;
    }
    
    @Override
    public boolean hasNext()
    {
        return count < size;
    }

    @Override
    public E next()
    {
        return data[count++];
    }
    
    public void remove()
    {
        throw new UnsupportedOperationException();
    }
    
    //SYSTEM.arraycopy()
}
