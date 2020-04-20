package part2;

import java.awt.Component;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Shape;
import java.util.Observable;
import java.util.Observer;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JTextField;

@SuppressWarnings("deprecation")
public class TextView extends Box implements Observer
{
    public DataModel dm;
    private static final int HEIGHT = 20;
            
    public TextView(DataModel dm)
    {
       super(BoxLayout.Y_AXIS);
       this.dm = dm;
    }

    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);
//        Graphics2D g2 = (Graphics2D)g;
        
        for (int i = 0; i < dm.getData().size(); i++)
        {
            JTextField tf = new JTextField();
            tf.setText(dm.getData().get(i) + "");
            super.add(tf);
        }
    }
    
    @Override
    public void update(Observable o, Object arg)
    {
        super.repaint();
        Component[] arr = this.getComponents();
        
        for (int i = 0; i < arr.length; i++)
        {
            JTextField d = (JTextField) arr[i];
            if (!d.getText().equals(dm.getData().get(i)))
            {
                
                d.setText(dm.getData().get(i) + "");
            }
        }
        
    }
    
}
