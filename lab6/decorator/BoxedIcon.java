package lab6;

import java.awt.Component;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;

import javax.swing.Icon;

public class BoxedIcon implements Icon
{

    private Icon icon;
    
    public BoxedIcon(Icon icon)
    {
        this.icon = icon;
    }
    
    @Override
    public void paintIcon(Component c, Graphics g, int x, int y)
    {
        Graphics2D g2 = (Graphics2D) g;
        g2.draw(new Rectangle2D.Double(x, y, getIconWidth() + 10, getIconHeight() * 10));
        icon.paintIcon(c, g, x, y);
        
    }

    @Override
    public int getIconWidth()
    {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public int getIconHeight()
    {
        // TODO Auto-generated method stub
        return 0;
    }

}
