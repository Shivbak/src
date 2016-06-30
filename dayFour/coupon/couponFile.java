package dayFour.coupon;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Created by student on 30-Jun-16.
 */
public class couponFile implements ActionListener {

    //String [] File = {"Shoes Coupon £14.89","Clothes Coupon £15.00"};


    Files[] files = new Files[]{new Files("Shoes Coupon £",14),new Files("Clothes Coupon £",15)};
    JComboBox comboBox = new JComboBox(files);

    public couponFile(){


        JFrame content = new JFrame("Coupon App");
        content.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        content.setSize(400, 200);
        content.setResizable(true);
        content.setLayout(new FlowLayout());
        content.setLocationRelativeTo(null);


        JPanel panel = new JPanel();
        panel.setSize(400,200);
        content.add(panel);

         ;
        //comboBox.setSize(40,2);
        content.add(comboBox);

        JButton btn = new JButton("Save Coupon To File");
        content.add(btn);
        btn.addActionListener(this);
        content.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {



     writeToShoeFile();


    }

    static void writeToShoeFile()
    {
        System.out.println(System.getProperty("user.dir"));
        try{
            FileWriter fw = new FileWriter("ShoeCoupon.txt");

            BufferedWriter bw = new BufferedWriter(fw);
            bw.write("Shoe Coupon 14");
            bw.close();
            JOptionPane.showMessageDialog(null,"Your Coupon is Saved!");
        }
        catch (IOException e)
        {
            System.out.println("Error Writing to File : " + e);
        }
    }

    static void writeToClothFile()
    {
        System.out.println(System.getProperty("user.dir"));
        try{
            FileWriter fw = new FileWriter("ClothCoupon.txt");

            BufferedWriter bw = new BufferedWriter(fw);
            bw.write("Cloth Coupon 15");
            bw.close();
            JOptionPane.showMessageDialog(null,"Your Coupon is Saved!");
        }
        catch (IOException e)
        {
            System.out.println("Error Writing to File : " + e);
        }
    }

    public static void main(String[] args)
    {
        couponFile coupon = new couponFile();
    }
}
