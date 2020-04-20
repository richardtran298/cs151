import java.awt.geom.PathIterator;
import java.util.ArrayList;

public class CompositeShapePathIterator implements PathIterator
{
    private ArrayList<PathIterator> iteratorList;

    public CompositeShapePathIterator()
    {
        iteratorList = new ArrayList<>();
    }

    public void add(PathIterator iterator)
    {
        iteratorList.add(iterator);
    }

    public int currentSegment(float[] coordinates)
    {
        PathIterator currentIterator = iteratorList.get(0);
        return currentIterator.currentSegment(coordinates);
    }

    public int currentSegment(double[] coordinates)
    {
        PathIterator currentIterator = iteratorList.get(0);
        return currentIterator.currentSegment(coordinates);
    }

    public int getWindingRule()
    {
        if (isDone())
        {
            return 0;
        }
        PathIterator currentIterator = iteratorList.get(0);
        
        return (currentIterator.getWindingRule());
    }

    public boolean isDone()
    {
        return (iteratorList.size() == 0);
    }

    public void next()
    {
        PathIterator currentIterator = iteratorList.get(0);
        currentIterator.next();
        
        if (currentIterator.isDone()) 
        {
            iteratorList.remove(0);
        }
    }

}