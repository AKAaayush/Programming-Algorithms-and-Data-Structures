/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_mcq_application.loginsignup;
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
import javax.swing.JFrame;

/**
 *
 * @author N I T R O
 */

public class Java_mcq_application  implements ActionListener{
    JFrame frame ;
    JLabel lhead, lusername,lpassword;
    JTextField tusername,tpassword;
    JPasswordField pass;
    JButton signin , signup,Bback;
    JTextArea display;
    ImageIcon icon;
    
   // signin object
    Java_mcq_application(){
        frame= new JFrame("SignIn");
        frame.setSize(800, 500);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        frame.setLayout(null);
       
        
        //Heading
        Font F =new Font("Times New Roman", Font.BOLD,30); 
        lhead = new JLabel("Sign In");
        lhead.setBounds(350,5,400,35);
        lhead.setFont(F);
        frame.add(lhead);
        
        //For Label
        lusername = new JLabel("UserName");
        lusername.setBounds(300,100,60,30);
        frame.add(lusername);  
        
        
        lpassword= new JLabel("Password");
        lpassword.setBounds(300,150,60,30);
        frame.add(lpassword);
        
        //text box
        tusername= new JTextField("");
        tusername.setBounds(425,100,150,25);
        frame.add(tusername);
        
        //password
        pass = new JPasswordField("");
        pass.setBounds(425,150,150,25);
        frame.add(pass);
        
        //button
        signin = new JButton("SIGN_IN");
        signin.setBounds(400, 200,90,25);
        frame.add(signin);
        signin.addActionListener(this);
       
        
         signup = new JButton("SIGN-UP");
        signup.setBounds(500, 200,90,25);
        frame.add(signup);
        signup.addActionListener(this);
        
//        backbutton
        
             Bback = new JButton("<=");
        Bback.setBounds(0, 0,50,25);
        frame.add(Bback);
        Bback.addActionListener(this);
        
    }
    

    @Override
    public void actionPerformed(ActionEvent e) {
      
       
    if(e.getSource()==signup){
         signup signup = new signup();
         frame.dispose();
    }
    
    if(e.getSource()==Bback){
         Welcome W = new Welcome();
         frame.dispose();
   
    }
     
//       Database login validation
       if(e.getSource()==signin)
        {
            System.out.println(tusername.getText().toString()+ ":" +pass.getText().toString());
            try {
                Database db=new Database();
                if(db.loginStatus(tusername.getText().toString(),pass.getText().toString())){
                    JOptionPane.showMessageDialog(null, "Login success");
                    
                    Insert_token t = new Insert_token();
                    
                    frame.dispose();
                    
                    
                }
               
                
                else{
                    JOptionPane.showMessageDialog(null, "not success");
                }
            } catch (Exception ae) {
            }
        }
//    
//    
    }


    
}
