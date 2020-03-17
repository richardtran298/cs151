package lab3;

import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

import javax.swing.*;

/**
   This program implements an animation that moves
   a car shape.
*/
public class AnimationTester
{
   public static void main(String[] args)
   {
      JFrame frame = new JFrame();

      ArrayList<MoveableShape> shapes = new ArrayList<>();   
      MoveableShape shape = new CarShape(0, 0, CAR_WIDTH);
      MoveableShape shape2 = new CarShape(0, 0, CAR_WIDTH);
      
      
      shapes.add(shape);
      shapes.add(shape2);
      
      for (MoveableShape carShape: shapes)
      {
          ShapeIcon icon = new ShapeIcon(shape, ICON_WIDTH, ICON_HEIGHT);
          JLabel label = new JLabel(icon);
          frame.setLayout(new FlowLayout());
          frame.add(label);
          
          frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
          frame.pack();
          frame.setVisible(true);
          
          
          final int DELAY = 100;
          // Milliseconds between timer ticks
          Timer t = new Timer(DELAY, event ->
             {
                shape.move();
                label.repaint();
                shape2.move();             
                
             
             });
          t.start();
      }
      
     

          

    
   }

   private static final int ICON_WIDTH = 400;
   private static final int ICON_HEIGHT = 100;
   private static final int CAR_WIDTH = 100;
}
