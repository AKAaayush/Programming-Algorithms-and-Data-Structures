/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_mcq_application.admin;

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
import java_mcq_application.loginsignup.Welcome;


/**
 *
 * @author N I T R O
 */
public class adminlogin extends JFrame implements ActionListener{
    
 
    
     JFrame frame = new JFrame("Welcome to Admin");
        
        JLabel lhead, luseradmin,luserpass,lid;
        JTextField tuseradmin, tidno;
         JPasswordField passadmin;
         JButton signadmin,Bback;
         
        
       public adminlogin(){
         frame.setSize(800, 500);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        frame.setLayout(null);
        
        
        //Heading
        Font F =new Font("Times New Roman", Font.BOLD,30); 
        lhead = new JLabel("Welcome To Admin");
        lhead.setBounds(300,5,400,35);
        lhead.setFont(F);
        frame.add(lhead);
        

        
//        for label
          luseradmin = new JLabel("UserName");
        luseradmin.setBounds(300,150,60,30);
        frame.add(luseradmin);  
        
         lid = new JLabel("AdminID");
        lid.setBounds(300,100,60,30);
        frame.add(lid); 
        
        luserpass= new JLabel("Password");
        luserpass.setBounds(300,200,60,30);
        frame.add(luserpass);
        
       //text box
        tuseradmin= new JTextField();
        tuseradmin.setBounds(425,150,150,20);
        frame.add(tuseradmin);
        
          tidno= new JTextField();
        tidno.setBounds(425,100,150,20);
        frame.add(tidno);
        
        //passfield
         passadmin = new JPasswordField();
        passadmin.setBounds(425,200,150,20);
        frame.add(passadmin);
        
        //button
         signadmin = new JButton("SIGN_IN");
        signadmin.setBounds(450, 250,90,25);
        frame.add(signadmin);
        signadmin.addActionListener(this);
     //      backbutton
        
             Bback = new JButton("<=");
        Bback.setBounds(0, 0,50,25);
        frame.add(Bback);
        Bback.addActionListener(this);
        
            
        }
    public static void main(String[] args){
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==Bback){
            Welcome W = new Welcome();
            frame.dispose();
        }
        //       Database admin login validation
       if(e.getSource()==signadmin)
        {
            System.out.println(tuseradmin.getText().toString()+ ":" +passadmin.getText().toString());
            try {
                Database db=new Database();
                if(db.adminloginStatus(Integer.parseInt(tidno.getText()),tuseradmin.getText().toString(),passadmin.getText().toString())){
                    JOptionPane.showMessageDialog(null, "Login success");
                    
                    adminpanel a = new adminpanel();
                    
                    
                    frame.dispose();
                    
                }
               
                
                else{
                    JOptionPane.showMessageDialog(null, "not success");
                }
            } catch (Exception ae) {
            }
        }
       
            
        }
        
        
        
    
    }
    

