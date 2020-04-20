package part2;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.Observable;
import java.util.Observer;

import javax.swing.JPanel;

@SuppressWarnings("deprecation")
public class GraphView extends JPanel implements Observer
{
    public DataModel dm;
    private static final int HEIGHT = 20;
    
    public GraphView(DataModel dm)
    {
        this.dm = dm;
        
    }
    
    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D)g;
        
        for (int i = 0; i < dm.getData().size(); i++)
        {
            g2.drawRect(0, HEIGHT * i, dm.getData().get(i), HEIGHT);
        }
    }

    @Override
    public void update(Observable o, Object arg)
    {
        super.repaint();
    }
}
