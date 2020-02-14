
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
/**
 *
 * @author N I T R O
 */
public class signup extends JFrame implements ActionListener{
      
     JFrame frame = new JFrame("SignUp");
    
    JLabel lhead,lfirstname,llastname, lusername, lemail,lpassword,lpasswordconfig;
    JTextField tfirstname,tlastname,temail, tusername;
    JPasswordField pass,passconfig;
    JButton Register, Reset,Bback;
    JTextArea display;
   
    signup(){
        
        frame.setSize(800, 500);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setLayout(null);
//        con.setBackground(Color.BLUE);
        
         //Heading
        Font F =new Font("Times New Roman", Font.BOLD,30);
        lhead = new JLabel("Sign Up");
        lhead.setBounds(350,5,400,35);
        lhead.setFont(F);
        frame.add(lhead);
        
        //For Label
           
         lfirstname= new JLabel("First-Name");
        lfirstname.setBounds(300,50,80,30);
        frame.add(lfirstname);
        
         llastname= new JLabel("Last-Name");
        llastname.setBounds(300,100,80,30);
        frame.add(llastname);
        
         lemail= new JLabel("Email");
        lemail.setBounds(300,150,60,30);
        frame.add(lemail);
        
        lusername = new JLabel("UserName");
        lusername.setBounds(300,200,60,30);
        frame.add(lusername);
     
        
         lpassword= new JLabel("Password");
        lpassword.setBounds(300,250,60,30);
        frame.add(lpassword);
        
        lpasswordconfig= new JLabel("Confirm-Password");
        lpasswordconfig.setBounds(300,300,120,30);
        frame.add(lpasswordconfig);
        
        //text box
        tfirstname= new JTextField("");
        tfirstname.setBounds(425,50,180,25);
        frame.add(tfirstname);
        
        tlastname= new JTextField("");
        tlastname.setBounds(425,100,180,25);
        frame.add(tlastname);
        
        tusername= new JTextField("");
        tusername.setBounds(425,150,180,25);
        frame.add(tusername);
        
       temail= new JTextField("");
        temail.setBounds(425,200,180,25);
        frame.add(temail);
        
         //password
       
        pass = new JPasswordField("");
        pass.setBounds(425,250,180,25);
        frame.add(pass);
        
        passconfig = new JPasswordField("");
        passconfig.setBounds(425,300,180,25);
        frame.add(passconfig);
        
         //button
       Register = new JButton("SIGN-IN");
        Register.setBounds(425, 350,80,25);
        frame.add(Register);
         Register.addActionListener(this);
    
        
          Reset = new JButton("RESET");
        Reset.setBounds(525, 350,80,25);
        frame.add(Reset);
        Reset.addActionListener(this);
 
        //        backbutton
        
             Bback = new JButton("<=");
        Bback.setBounds(0, 0,50,25);
        frame.add(Bback);
        Bback.addActionListener(this);
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
          if(e.getSource() == Bback){
      new  Java_mcq_application();
     
        frame.dispose();
        }
          
        if(e.getSource() == Register){
      new  Java_mcq_application();
     
        frame.dispose();
        }
         
        
         if(e.getSource() == Reset){
            tusername.setText("");
            tfirstname.setText("");
             tlastname.setText("");
           pass.setText("");
           temail.setText("");
            
             passconfig.setText("");
             
         }
         if(e.getSource()==Register)
             
        {
            try {
               
                Database db=new Database();
                int result=db.signup(0, tfirstname.getText(),tlastname.getText(),tusername.getText(),temail.getText(), pass.getText());
                if(result>0)
                {
                    JOptionPane.showMessageDialog(null,"Saved");
                    
                }
           
                else
                {
                    JOptionPane.showMessageDialog(null,"Unable to saved");
                }
            } catch (Exception ea) {
            }
        }
    }
    
     public static void main(String[] args){
       signup  S = new signup();
    }
    
    
}
