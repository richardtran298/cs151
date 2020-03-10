package lab3;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ActionTester
{
    public static void main(String[] args)
    {
        int Hnum = 1;
        int Gnum = 1;
        
        JFrame frame = new JFrame();

        final int FIELD_WIDTH = 20;
        JTextField textField = new JTextField(FIELD_WIDTH);
        textField.setText("Click a button!");

        JButton helloButton = new JButton("Say Hello");
        helloButton.setEnabled(true);

        JButton goodbyeButton = new JButton("Say Goodbye");    
        goodbyeButton.addActionListener(new ActionListener() 
        { 
            public void actionPerformed(ActionEvent event) 
            {                
                textField.setText("Goodbye");           
            } 
            
        }
                );
        
        goodbyeButton.setEnabled(false);

        helloButton.addActionListener(new ActionListener() 
        { 
            public void actionPerformed(ActionEvent event) 
            { 
                textField.setText("Hello, World!"); 
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
