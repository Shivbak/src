package dayOne;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 * Created by student on 27-Jun-16.
 */
public class ValidatePassword {

    JFrame mainFrame;
    JPanel panel;
    JButton btnValidate;
    JTextArea passwordTxt;

    boolean result;

    //constructor


    public ValidatePassword() {

        mainFrame = new JFrame("Password Validation");
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainFrame.setSize(400,100);
        mainFrame.setResizable(false);
        mainFrame.setLayout(new FlowLayout());
        mainFrame.setLocationRelativeTo(null);

        panel = new JPanel();
        panel.setSize(400,100);

        //add components to panel

        passwordTxt = new JTextArea("",1,15);
        panel.add(passwordTxt, BorderLayout.WEST);

        btnValidate = new JButton("Validate");
        /**
        btnValidate.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });*/

        btnValidate.addActionListener(event -> {

            result = validate(passwordTxt.getText());
            if (result)JOptionPane.showMessageDialog(null,"Your Password met the requirements");
            else JOptionPane.showMessageDialog(null,"Your Password does not met the requirements");

        });

        panel.add(btnValidate, BorderLayout.EAST);
        mainFrame.add(panel);
        mainFrame.setVisible(true);
    }

    static boolean validate(String password)
    {
        String pattern = "(?=.*[0-9]) (?=.*[a-z]) (?=.*[A-Z]) (?=.*[@$^&*+-=]) (?=\\s+$).{8,}";
        return password.matches(pattern);
       /** int upper = 0 , lower = 0,specialchar = 0 , length = 0 , number = 0 , space = 0;
        for (char c : password.toCharArray())
        {
            if (Character.isLowerCase(c)) upper++;
            if (Character.isUpperCase(c)) lower++;
            if (c == '#' || c == '$' || c == '%' || c == '&' || c == '*') specialchar++;
            if (password.length() >= 8) length++;
            if (Character.isDigit(c)) number++;
            if (Character.isSpaceChar(c)) space++;
        }

        if (upper>0 && lower>0 && specialchar > 0 && length>0 && number>0 && space ==0)
            return true;

        return false;*/



    }

    public static void main(String[] args){
        new ValidatePassword();
    }
}
