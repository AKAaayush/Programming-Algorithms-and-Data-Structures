/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_mcq_application.choosequestion;

import java.util.List;
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
import java.util.Collections;
import java.util.Random;

/**
 *
 * @author N I T R O
 */
public class Choosequestion extends JFrame implements ActionListener{
      JFrame frame = new JFrame("Questions");
     
     JLabel lquestion ;
     JButton next,prev;
     JRadioButton oneq, twoq,threeq, fourq;
     int counter,count = 0;
      List<Module> question;
     
     Choosequestion(List<Module> questions){
         
        frame.setSize(800,600);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        
        frame.setLayout(null);
        
        question = questions;
        Collections.shuffle(question);
        
        
//        questions
        
        lquestion = new JLabel();
        lquestion.setBounds(50, 50, 800, 30);
        frame.add(lquestion);
        
//        answer
        oneq = new JRadioButton();
        oneq.setBounds(80, 100, 800, 30);
        frame.add(oneq);
        
        twoq = new JRadioButton();
        twoq.setBounds(80, 150, 800, 30);
        frame.add(twoq);
        
        threeq = new JRadioButton();
        threeq.setBounds(80, 200, 800, 30);
        frame.add(threeq);
        
          fourq = new JRadioButton();
        fourq.setBounds(80, 250, 800, 30);
        frame.add(fourq);
        
//        select one radio button
        ButtonGroup group = new ButtonGroup();
        group.add(oneq);
        group.add(twoq);
        group.add(threeq);
        group.add(fourq);
        setquestion();
//      Button
        
       next = new JButton("Next");
        next.setBounds(300, 300, 90, 30);
        frame.add(next);
        next.addActionListener(this);
        
         prev = new JButton("Previous");
        prev.setBounds(50, 300, 90, 30);
        frame.add(prev);
        prev.addActionListener(this);
         
     }
    

    @Override
    public void actionPerformed(ActionEvent e) {
        String UserAnswer;
        if (e.getSource() == next) {
            if (oneq.isSelected()) { 
                    
                UserAnswer = question.get(counter).getAnswer1();
                   
                } 
  
                else if (twoq.isSelected()) { 
                    UserAnswer = question.get(counter).getAnswer2();
                    
                } 
                else if(threeq.isSelected()){ 
  
                    UserAnswer = question.get(counter).getAnswer3();
                } 
                else{
                    UserAnswer = question.get(counter).getAnswer4();
                }
            if(UserAnswer.equals(question.get(counter).getRightanswer())){
                count++;
            }
            if(counter+1!= question.size()){
            counter++;
            setquestion();
            }
            else{
                JOptionPane.showMessageDialog(null,"you have score"+ count+"/"+question.size());
                frame.dispose();
            }
        }
        if(e.getSource() == prev){
            if(counter!=0){
              counter--;  
              count--;

              setquestion();
            }
            
            
        }
       
    }
    public void setquestion(){
        lquestion.setText(question.get(counter).getQuestion());
        oneq.setText(question.get(counter).getAnswer1());
        twoq.setText(question.get(counter).getAnswer2());
        threeq.setText(question.get(counter).getAnswer3());
        fourq.setText(question.get(counter).getAnswer4());
    }
    
}
