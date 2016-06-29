package charFinder;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

public class charcterFinder implements ActionListener{
	
	JLabel labelText,labelChar;
    JTextField Ch;
    JTextArea text;

	public void screen()
	{
		JFrame content = new JFrame("Character Finder");
		content.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		content.setSize(1000, 200);
		content.setResizable(true);
		content.setLayout(new FlowLayout());
		content.setLocationRelativeTo(null);
		
		JPanel panel = new JPanel();
		panel.setSize(1000,200);
		content.add(panel);
		
		 labelText = new JLabel("Enter text to Search:");
	        panel.add(labelText);

	        text = new JTextArea(4,20);
	        JScrollPane sp = new JScrollPane(text);
	        panel.add(sp);

	        labelChar = new JLabel("Enter a Character:");
	        panel.add(labelChar);

	        Ch = new JTextField(5);
	        panel.add(Ch);

	        content.add(panel);
	        content.setVisible(true);
	        
	        Ch.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		int count = 0;
		String S = text.getText();
		char C = Ch.getText().charAt(0); 
		for(int i = 0 ; i < S.length(); i++)
		{
			if(S.charAt(i) == C)
			{
				count++;
			}
		}
		
		JOptionPane.showMessageDialog(null,"Char is" + count + "times");
		
	}

}
