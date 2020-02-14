/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_mcq_application.loginsignup;
import java_mcq_application.loginsignup.signup;
import java_mcq_application.loginsignup.Java_mcq_application;
import java_mcq_application.admin.adminlogin;
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
                                           

public class Welcome extends JFrame implements ActionListener{
         JFrame frame = new JFrame("Welcome");
       
        JLabel lhead,lhead1, lLongin;
        JButton bsignin,bsigninadmin,bsignup;
        
       public  Welcome(){
        frame.setSize(800, 500);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setBackground(Color.RED);
        
        
          
            
  
        
//      welcome-head
         Font F =new Font("Italic", Font.BOLD,30); 
        lhead = new JLabel("Welcome T0 MCQ ");
        lhead.setBounds(250,5,400,35);
        lhead.setFont(F);
        frame.add(lhead);
        lhead. setBackground(Color.blue);
        
        
      
        
       
        
        
       
        lhead1 = new JLabel("Of Programming ");
        lhead1.setBounds(260,50,400,35);
        lhead1.setFont(F);
        frame.add(lhead1);
//      singin 
          bsignin = new JButton("Signin");
        bsignin.setBounds(125, 200,80,25);
        frame.add(bsignin);
        bsignin.addActionListener(this);
      //  bsignin.addActionListener(this);
        
//        singinadmin
         bsigninadmin = new JButton("Admin");
        bsigninadmin.setBounds(320, 200,80,25);
        frame.add(bsigninadmin);
        bsigninadmin.addActionListener(this);
        
//        signup
          bsignup = new JButton("signup");
        bsignup.setBounds(500, 200,80,25);
        frame.add(bsignup);
        bsignup.addActionListener(this);
        
        
        
            
        }
        
        
    @Override
    public void actionPerformed(ActionEvent e) {
if (e.getSource()== bsignin){
   new Java_mcq_application();
    frame.dispose();
    
}

if(e.getSource() == bsigninadmin){
    adminlogin A = new adminlogin();
   
    frame.dispose();
    
}
else{
    setVisible(false);
}
if(e.getSource() == bsignup){
    signup A = new signup();
    frame.dispose();
    
}
        
    }
       
        
       
   
    
    public static void main(String[] args){
       Welcome W = new Welcome();
      
        
    }

  
    
}
