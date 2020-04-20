package part2;

import java.util.ArrayList;

import javax.swing.event.ChangeListener;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.font.*;
import java.awt.geom.*;
import javax.swing.*;


public class Hw2P2
{

    @SuppressWarnings("deprecation")
    public static void main(String[] args)
    {
        ArrayList<Integer> data = new ArrayList<Integer>();

        data.add(0);
        data.add(20);
        data.add(40);
        data.add(60);
        data.add(80);
        data.add(100);
        data.add(120);
        data.add(140);
        data.add(160);
        data.add(180);


        DataModel dm = new DataModel(data);
        
        TextView tv = new TextView(dm);
        
        GraphView gv = new GraphView(dm);
        gv.addMouseListener(new 
                MouseAdapter()
        {
           public void mousePressed(MouseEvent event)
           {
               
//               System.out.println("X is " + event.getX());
//               System.out.println("Y is " + event.getY());
//               if (event.getX() )
           }
        });


//        TextFrame frame = new TextFrame(model);
//
//        BarFrame barFrame = new BarFrame(model);
        
//        model.attach(frame);
//        model.attach(barFrame);
//        
//        frame.pack();
//        frame.setVisible();
        
        
        JFrame tf = new JFrame();
        tf.setContentPane(tv);
        
        JFrame gf = new JFrame();
        gf.setContentPane(gv);
        
        tf.pack();  
        tf.setVisible(true);
        tf.setBounds(0, 0, 200, 200);
        tf.setSize(100, 300);
        
        gf.pack();  
        gf.setVisible(true);
        gf.setBounds(300, 0, 200, 200);
        gf.setSize(100, 300);
        

    }
}
