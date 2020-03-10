package lab3;

import java.awt.*;
import java.awt.geom.*;
import java.util.*;


public class BouncingBall implements MoveableShape
{
    private int x;
    private int y;
    private int width;
    
    public BouncingBall(int x, int y, int width)
    {
        this.x = x;
        this.y = y;
        this.width = width;
    }

    @Override
    public void draw(Graphics2D g2)
    {
        Ellipse2D.Double ball = new Ellipse2D.Double(x, y, width, width);
        g2.draw(ball);
    }

    @Override
    public void move()
    {
        y++;
    }

}
