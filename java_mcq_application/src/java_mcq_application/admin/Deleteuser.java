/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_mcq_application.admin;
import java_mcq_application.admin.adminpanel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java_mcq_application.database.Database;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

/**
 *
 * @author N I T R O
 */
public class Deleteuser extends JFrame implements ActionListener{
 JFrame frame = new JFrame("Delete-USer");
    JLabel lhead, lid;
    JTextField tid;
    JButton bdelete ,Bback;
    
    Deleteuser(){
        frame.setSize(400,400);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        
        frame.setLayout(null);
        frame.setLayout(null);
        
         //For Label
            lid= new JLabel("ID");
        lid.setBounds(50,50,80,30);
        frame.add(lid);
        
//        textbox
          tid= new JTextField("");
        tid.setBounds(200,50,80,30);
        frame.add(tid);
        
//        button
         bdelete = new JButton("Delete");
        bdelete.setBounds(200, 100,80,25);
        frame.add(bdelete);
         bdelete.addActionListener(this);
         
         //      backbutton
        
             Bback = new JButton("<=");
        Bback.setBounds(0, 0,50,25);
        frame.add(Bback);
        Bback.addActionListener(this);
    }
    public static void main (String[] args){
        Deleteuser D =new Deleteuser();
    }
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
            if(e.getSource() ==Bback){
            adminpanel A = new adminpanel();
            frame.dispose();
        }
            //        delete module
           if(e.getSource()==bdelete)
             
        {
            try {
                Database db=new Database();
                int result=db.deleteuser(Integer.parseInt(tid.getText()));
                if(result>0)
                {
                    JOptionPane.showMessageDialog(null,"Deleted");
                    userdetails Q = new userdetails();
                    
                }
            }
               catch (Exception ea) {
                
            }
             } 
    }
    
    
}
