/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_mcq_application.choosequestion;

import java_mcq_application.choosequestion.Choosequestion;
import java_mcq_application.database.Database;
import java_mcq_application.loginsignup.Insert_token;
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

/**
 *
 * @author N I T R O
 */
public class selectmodules extends JFrame implements ActionListener {

    JFrame frame = new JFrame("Select-Modules");
    Container con = frame.getContentPane();
    JLabel lhead, lmodules;
    JComboBox selctmodules;
    JButton benter, Bback;

     public selectmodules() {

        frame.setSize(800, 500);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        con.setLayout(null);
        con.setLayout(null);

        //        head
        Font F = new Font("Times New Roman", Font.BOLD, 30);
        lhead = new JLabel("Please Select your module");
        lhead.setBounds(250, 50, 400, 35);
        lhead.setFont(F);
        con.add(lhead);

        //label
        lmodules = new JLabel("Modules");
        lmodules.setBounds(250, 100, 90, 35);
        con.add(lmodules);

//        btn
        benter = new JButton("Enter");
        benter.setBounds(350, 150, 90, 35);
        con.add(benter);
        benter.addActionListener(this);

//      combobox
        String modules[] = {"Java", "C++", "C", "C#"};
        selctmodules = new JComboBox(modules);
        selctmodules.setBounds(500, 100, 60, 35);
        con.add(selctmodules);
//      backbutton
        
             Bback = new JButton("<=");
        Bback.setBounds(0, 0,50,25);
        frame.add(Bback);
        Bback.addActionListener(this);

    }

    public static void main(String[] args) {
        selectmodules S = new selectmodules();
        S.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == Bback){
            Insert_token I = new Insert_token();
            frame.dispose();
            
        }
        

        if (e.getSource() == benter) {
            Choosequestion C;
            frame.dispose();
            
            Database db = new Database();
            switch (selctmodules.getSelectedIndex()) {

                case 0:
                   C = new Choosequestion(db.modulequestion("Java")); 
                    break;
                case 1:
                    C = new Choosequestion(db.modulequestion("C++")); 
                    break;
                case 2:
                    C = new Choosequestion(db.modulequestion("C")); 
                    break;
                case 3:
                    C = new Choosequestion(db.modulequestion("C#")); 
                    break;
                    
            }
        }

    }

}
