import java.util.ArrayList;
import java.awt.Rectangle;
import java.awt.Shape;
import java.awt.geom.*;

public class CompositeShape implements Shape
{
    ArrayList<Shape> shapeList;

    public CompositeShape()
    {
        shapeList = new ArrayList<>();
    }

    public void add(Shape shape)
    {
        shapeList.add(shape);
    }

    public boolean contains(double x, double y)
    {
        for (Shape s : shapeList)
        {
            if (s.contains(x, y)) 
            {
                return true;
            }
        }
        return false;
    }

    public boolean contains(double x, double y, double width, double height)
    {
        for (Shape s : shapeList)
        {
            if (s.contains(x, y, width, height)) 
            {
                return true;
            }
        }
        return false;
    }

    public boolean contains(Point2D p)
    {
        for (Shape s : shapeList)
        {
            if (s.contains(p)) 
            {
                return true;
            }
        }
        return false;
    }

    public boolean contains(Rectangle2D r)
    {
        for (Shape s : shapeList)
        {
            if (s.contains(r)) return true;
        }
        return false;
    }

    public Rectangle getBounds()
    {
        if (shapeList.size() == 0) 
        {
            return new Rectangle();
        }
        Shape s = shapeList.get(0);
        Rectangle rec = s.getBounds();

        for (int i = 1; i < shapeList.size(); i++)
        {
            s = shapeList.get(i);
            rec = rec.union(s.getBounds());
        }
        return rec;
    }

    public Rectangle2D getBounds2D()
    {
        if (shapeList.size() == 0) 
        {
            return new Rectangle2D.Double();
        }
        Shape s = shapeList.get(0);
        Rectangle2D r = s.getBounds2D();
        for (int i = 1; i < shapeList.size(); i++)
        {
            s = shapeList.get(i);
            Rectangle2D.union(r, s.getBounds(), r);
        }
        return r;
    }

    public boolean intersects(double x, double y, double width, double height)
    {
        for (Shape s : shapeList)
        {
            if (s.intersects(x, y, width, height)) 
            {
                return true;
            }
        }
        return false;
    }

    public boolean intersects(Rectangle2D r)
    {
        for (Shape s : shapeList)
        {
            if (s.intersects(r)) 
            {
                return true;
            }
        }
        return false;
    }

    public PathIterator getPathIterator(AffineTransform at)
    {
        CompositeShapePathIterator iterator = new CompositeShapePathIterator();
        
        for (Shape s : shapeList)
        {
            iterator.add(s.getPathIterator(at));
        }
        return iterator;
    }

    public PathIterator getPathIterator(AffineTransform at, double flatness)
    {
        CompositeShapePathIterator iterator = new CompositeShapePathIterator();

        for (Shape s : shapeList)
        {
            iterator.add(s.getPathIterator(at, flatness));
        }
        return iterator;
    }

}