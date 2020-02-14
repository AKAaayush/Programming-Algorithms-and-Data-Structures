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
public class Deletequestion extends JFrame implements ActionListener{
    JFrame frame = new JFrame("Delete-Question");
    JLabel lhead, lid;
    JTextField tid;
    JButton bdelete ,Bback;
    
    Deletequestion(){
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
        Deletequestion D =new Deletequestion();
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
                int result=db.deletemodule(Integer.parseInt(tid.getText()));
                if(result>0)
                {
                    JOptionPane.showMessageDialog(null,"Deleted");
                    questions Q = new questions();
                    
                }
            }
               catch (Exception ea) {
                
            }
             } 
    }
    
}
