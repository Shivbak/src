package dayThree.Project;
import java.awt.*;
import javax.swing.*;

/**
 * Created by student on 29-Jun-16.
 */
public class CharacterFinder {

    JFrame mainFrame;
    JPanel panel;
    JLabel labelText,labelChar;
    JTextField Ch;
    JTextArea text;

    public CharacterFinder()
    {
        mainFrame = new JFrame("Character Finder");
        mainFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        mainFrame.setSize(1000,200);
        mainFrame.setResizable(true);
        mainFrame.setLayout(new FlowLayout());
        mainFrame.setLocationRelativeTo(null);

        panel = new JPanel();
        panel.setSize(1000,200);

        labelText = new JLabel("Enter Texts to be Searched:");
        panel.add(labelText);

        text = new JTextArea(4,20);
        JScrollPane sp = new JScrollPane(text);
        panel.add(sp);

        labelChar = new JLabel("Enter a Character:");
        panel.add(labelChar);

        Ch = new JTextField(5);
        panel.add(Ch);

        mainFrame.add(panel);
        mainFrame.setVisible(true);
        //panel.setBackground(Color.LIGHT_GRAY);

        //Ch.addAncestorListener();


    }

    public void Finder ()
    {

    }

    public static void main(String[] args){ new CharacterFinder();}
}


