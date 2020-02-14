 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_mcq_application.loginsignup;

import java_mcq_application.loginsignup.Java_mcq_application;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java_mcq_application.database.Database;
import java_mcq_application.choosequestion.selectmodules;

/**
 *
 * @author N I T R O
 */
public class Insert_token extends JFrame implements ActionListener {

    JFrame frame = new JFrame("Token");
    JLabel lhead, ltoken, linserttokennumber, ltokennumber, luser, lusername;
    JTextField ttoken;
    JButton btoken,Bback;

    //token validation
    String labeltoken = (Database.TEMP_TOKEN);

    String texttoken = (Database.TEMP_TOKEN);

   public Insert_token() {
        frame.setSize(800, 500);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        

//        head
        Font F = new Font("Times New Roman", Font.BOLD, 30);
        lhead = new JLabel("Token");
        lhead.setBounds(350, 5, 400, 35);
        lhead.setFont(F);
        frame.add(lhead);

        luser = new JLabel("username :");
        luser.setBounds(300, 100, 90, 35);
        frame.add(luser);

        lusername = new JLabel(Database.TEMP_USERNAME);
        lusername.setBounds(425, 100, 90, 35);
        frame.add(lusername);

        ltoken = new JLabel("Token-Number :");
        ltoken.setBounds(300, 150, 90, 35);
        frame.add(ltoken);

        ltokennumber = new JLabel(labeltoken);
        ltokennumber.setBounds(425, 150, 290, 35);
        frame.add(ltokennumber);
//        ltokennumber.addMouseListener((MouseListener) this);

        linserttokennumber = new JLabel("Insert-Number");
        linserttokennumber.setBounds(300, 200, 90, 30);
        frame.add(linserttokennumber);

//        textfield
        ttoken = new JTextField();
        ttoken.setBounds(425, 200, 60, 25);
        frame.add(ttoken);

//        button
        btoken = new JButton("Enter");
        btoken.setBounds(350, 250, 80, 25);
        frame.add(btoken);
//        setTitle("Username: "+Database.TEMP_USERNAME +" Curent user token: " +Database.TEMP_TOKEN);
        btoken.addActionListener(this);
         //        backbutton
        
             Bback = new JButton("<=");
        Bback.setBounds(0, 0,50,25);
        frame.add(Bback);
        Bback.addActionListener(this);

    }

    public static void main(String[] args) {

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        if (e.getSource() == Bback) {
            Java_mcq_application J = new Java_mcq_application();
            frame.dispose();
        }
        

        if (e.getSource() == btoken) {
            try {
                if (ttoken.getText().equals(Database.TEMP_TOKEN)) {
                    JOptionPane.showMessageDialog(null, "Token is correct");

                    selectmodules S = new selectmodules();
                    frame.dispose();
                    //setVisible(true);
                } else {
                    JOptionPane.showMessageDialog(null, "Token is incorrect");

                }
            } catch (Exception ae) {

            }

        }

    }
}
