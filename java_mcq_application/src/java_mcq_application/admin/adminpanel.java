/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_mcq_application.admin;
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
/**
 *
 * @author N I T R O
 */
public class adminpanel extends JFrame implements ActionListener{
    JFrame frame = new JFrame("Admin Panel");
//     Container con = frame.getContentPane();
     JLabel lhead,lview,ladd,lupdate,ldelete;
     JButton userdetail1, questions1,questions2,questions3,userdetail3,questions4,userdetail4,Bback;
     
     
    adminpanel(){
         frame.setSize(800,600);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       
        frame.setLayout(null);
       
        
//        head
            Font F =new Font("Times New Roman", Font.BOLD,30); 
        lhead = new JLabel("Controle Panel");
        lhead.setBounds(250,5,400,35);
        lhead.setFont(F);
        frame.add(lhead);
        
        //        view
          Font FV =new Font("Times New Roman", Font.BOLD,20); 
        lview = new JLabel("View :");
        lview.setBounds(5,100,400,35);
        lview.setFont(FV);
        frame.add(lview);
//        add
          Font FA =new Font("Times New Roman", Font.BOLD,20); 
        ladd = new JLabel("Add :");
        ladd.setBounds(5,150,400,35);
        ladd.setFont(FA);
        frame.add(ladd); 
        
//        update
        Font FU =new Font("Times New Roman", Font.BOLD,20); 
        lupdate = new JLabel("Update :");
        lupdate.setBounds(5,200,400,35);
        lupdate.setFont(FU);
        frame.add(lupdate);
        
          Font FD =new Font("Times New Roman", Font.BOLD,20); 
        ldelete = new JLabel("Delete :");
        ldelete.setBounds(5,250,400,35);
        ldelete.setFont(FD);
        frame.add(ldelete);
        
        
//       buttonview
        questions1= new JButton("Questions");
        questions1.setBounds(125, 100,110,25);
        frame.add(questions1);
        
        questions1.addActionListener(this);
        
          userdetail1= new JButton("User-Details");
        userdetail1.setBounds(320, 100,110,25);
        frame.add(userdetail1);
        userdetail1.addActionListener(this);

//        buttonadd
         questions2= new JButton("Questions");
        questions2.setBounds(125, 150,110,25);
        frame.add(questions2);
        questions2.addActionListener(this);
        
         
        
//        buttonupdate
            questions3= new JButton("Questions");
        questions3.setBounds(125, 200,110,25);
        frame.add(questions3);
        questions3.addActionListener(this);
        
//          userdetail3= new JButton("User-Details");
//        userdetail3.setBounds(320, 200,110,25);
//        frame.add(userdetail3);
//        userdetail3.addActionListener(this);
        
//        buttondelete
            questions4= new JButton("Questions");
        questions4.setBounds(125, 250,110,25);
        frame.add(questions4);
        questions4.addActionListener(this);
        
          userdetail4= new JButton("User-Details");
        userdetail4.setBounds(320, 250,110,25);
        frame.add(userdetail4);
        userdetail4.addActionListener(this);
        
        //      backbutton
        
             Bback = new JButton("<=");
        Bback.setBounds(0, 0,50,25);
        frame.add(Bback);
        Bback.addActionListener(this);
        
        
    }

    public static void main (String[] args){
//        adminpanel AP = new adminpanel();
        
    }
    @Override
    public void actionPerformed(ActionEvent e) {
          if(e.getSource() == Bback){
              adminlogin A = new adminlogin();
              frame.dispose();
              
          }
        
        if(e.getSource() == userdetail1){
            userdetails U = new userdetails();
//            setVisible(true);
            
            
        }
      
        
        if(e.getSource() == questions1){
            questions U = new questions();
            
           
            
        }
        
        if(e.getSource() == questions2){
            addquestion A = new addquestion();
            frame.dispose();
                    
        }
        if(e.getSource() == questions3){
            Updatequestion U = new Updatequestion();
            frame.dispose();
        }
        
        if(e.getSource() == questions4){
            Deletequestion U = new Deletequestion();
            frame.dispose();
        
    }
        if(e.getSource() == userdetail4){
            Deleteuser U = new Deleteuser();
            frame.dispose();
        
    }
    
}
}
