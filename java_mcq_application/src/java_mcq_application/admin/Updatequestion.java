/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_mcq_application.admin;
import java_mcq_application.admin.adminpanel;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java_mcq_application.database.Database;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextArea;
import javax.swing.JTextField;
/**
 *
 * @author N I T R O
 */
public class Updatequestion extends JFrame implements ActionListener{
     JFrame frame = new JFrame("Update-Question");
    
    JLabel lhead,lid,lsubjectcode,lsubjectname, lquestion, lans1,lans2,lans3,lans4,lrightanswer;
    JTextField tid, tsubjectcode,tsubjectname,tquestion, tans1,tans2,tans3,tans4,trightanswer;
    JButton add, Reset,Bback;
   
    Updatequestion(){
        
        frame.setSize(700,600);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        
        frame.setLayout(null);
        frame.setLayout(null);
//        con.setBackground(Color.BLUE);
        
         //Heading
        Font F =new Font("Times New Roman", Font.BOLD,30);
        lhead = new JLabel("Update Module Question");
        lhead.setBounds(250,5,400,35);
        lhead.setFont(F);
        frame.add(lhead);
        
        //For Label
            lid= new JLabel("ID");
        lid.setBounds(50,50,80,30);
        frame.add(lid);
        
         lsubjectcode= new JLabel("Subject Code");
        lsubjectcode.setBounds(50,100,80,30);
        frame.add(lsubjectcode);
        
         lsubjectname= new JLabel("Subject-Name");
        lsubjectname.setBounds(50,150,80,30);
        frame.add(lsubjectname);
        
         lquestion= new JLabel("Question");
        lquestion.setBounds(50,200,60,30);
        frame.add(lquestion);
        
        lans1 = new JLabel("Answer-One");
        lans1.setBounds(50,250,120,30);
        frame.add(lans1);
     
        
         lans2= new JLabel("Answer-Two");
        lans2.setBounds(50,300,120,30);
        frame.add(lans2);
        
        lans3= new JLabel("Answer-Three");
        lans3.setBounds(50,350,120,30);
        frame.add(lans3);
        
        lans4= new JLabel("Answer-Four");
        lans4.setBounds(50,400,120,30);
        frame.add(lans4);
        
        lrightanswer= new JLabel("Right-Answer");
        lrightanswer.setBounds(50,450,120,30);
        frame.add(lrightanswer);
        
        //text box
         tid= new JTextField("");
        tid.setBounds(200,50,180,20);
        frame.add(tid);
        
        tsubjectcode= new JTextField("");
        tsubjectcode.setBounds(200,100,180,20);
        frame.add(tsubjectcode);
        
        tsubjectname= new JTextField("");
        tsubjectname.setBounds(200,150,180,20);
        frame.add(tsubjectname);
        
        tquestion= new JTextField("");
        tquestion.setBounds(200,200,180,20);
        frame.add(tquestion);
        
       tans1= new JTextField("");
        tans1.setBounds(200,250,180,20);
        frame.add(tans1);
       
        tans2 = new JTextField("");
        tans2.setBounds(200,300,180,20);
        frame.add(tans2);
        
        tans3 = new JTextField("");
        tans3.setBounds(200,350,180,20);
        frame.add(tans3);
        
        tans4 = new JTextField("");
        tans4.setBounds(200,400,180,20);
        frame.add(tans4);
        
         trightanswer = new JTextField("");
        trightanswer.setBounds(200,450,180,20);
        frame.add(trightanswer);
        
        
         //button
       add = new JButton("Update");
        add.setBounds(200, 500,80,25);
        frame.add(add);
         add.addActionListener(this);
    
        
          Reset = new JButton("RESET");
        Reset.setBounds(300, 500,80,25);
        frame.add(Reset);
        Reset.addActionListener(this);
        
          //      backbutton
        
             Bback = new JButton("<=");
        Bback.setBounds(0, 0,50,25);
        frame.add(Bback);
        Bback.addActionListener(this);
 
    }
    
    public static void main (String[] args){
        Updatequestion U = new Updatequestion();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
           if(e.getSource() ==Bback){
            adminpanel A = new adminpanel();
            frame.dispose();
        }
           
//           reset
           if(e.getSource() == Reset){
            tsubjectcode.setText("");
            tsubjectname.setText("");
             tquestion.setText("");
           tans1.setText("");
           tans2.setText("");
           tans3.setText("");
            tans4.setText("");
            trightanswer.setText("");
             
         }
           
        //        updatemodule
        if(e.getSource()==add)
             
        {
            try {
                Database db=new Database();
                int result=db.updatemodule(Integer.parseInt(tid.getText()),Integer.parseInt(tsubjectcode.getText()) ,tsubjectname.getText(),tquestion.getText(),tans1.getText(), tans2.getText(), tans3.getText(),tans4.getText(),trightanswer.getText());
                if(result>0)
                {
                    JOptionPane.showMessageDialog(null,"Updated");
                    questions Q = new questions();
                    
                }
            }
               catch (Exception ea) {
                
            }
             } 
    }
    
}
