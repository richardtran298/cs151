package lab5;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public abstract class MVCTester extends JFrame implements ChangeListener
{
	public static void main(String[] args) 
	{
		ArrayList<String> list = new ArrayList<String>();
		Model model = new Model(list);
		
		
		JFrame jf = new JFrame();
		JTextArea textArea = new JTextArea(10, 20);
		
		jf.setLayout(new BorderLayout());
		
		JButton addButton = new JButton("Add text");
		JTextField textField = new JTextField();
			
		
		addButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				model.add(textField.getText());
				textField.setText("");
			}
		}
		);
		
		jf.add(textArea, BorderLayout.NORTH);
		jf.add(textField, BorderLayout.CENTER);
		jf.add(addButton, BorderLayout.SOUTH);
		
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.pack();
		jf.setVisible(true);

		//Listener
		ChangeListener listenerX = new ChangeListener() {
		@Override
		public void stateChanged(ChangeEvent event) 
		{
			int size = model.getList().size();
			if (size >1) 
			{
				textArea.append("\n");
				textArea.append(model.getList().get(size - 1));
			}
		}
		};
	}
}
