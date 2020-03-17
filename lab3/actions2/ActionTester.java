package lab3;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ActionTester
{
    static int Hnum = 0;
    static int Gnum = 0;
    
    public static void main(String[] args)
    {
        
        JFrame frame = new JFrame();

        final int FIELD_WIDTH = 20;
        JTextField textField = new JTextField(FIELD_WIDTH);
        textField.setText("Click a button!");

        JButton helloButton = new JButton("Say Hello");
        helloButton.setEnabled(true);

        JButton goodbyeButton = new JButton("Say Goodbye");  
        goodbyeButton.setEnabled(false);
        
        goodbyeButton.addActionListener(new ActionListener() 
        { 
            public void actionPerformed(ActionEvent event) 
            {                
                Gnum++;
                textField.setText("Goodbye " + Gnum);   
                helloButton.setEnabled(true);
                goodbyeButton.setEnabled(false);

            } 
            
        }
                );
        
        helloButton.addActionListener(new ActionListener() 
        { 
            public void actionPerformed(ActionEvent event) 
            { 
                Hnum++;
                textField.setText("Hello " + Hnum); 
                helloButton.setEnabled(false);
                goodbyeButton.setEnabled(true);
            } 
        }
                );


        frame.setLayout(new FlowLayout());

        frame.add(helloButton);
        frame.add(goodbyeButton);
        frame.add(textField);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
