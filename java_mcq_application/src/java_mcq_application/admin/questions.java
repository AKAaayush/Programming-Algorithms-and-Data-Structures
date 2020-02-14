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
import java.sql.PreparedStatement;
import java_mcq_application.database.Database;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author N I T R O
 */
public class questions extends JFrame {

    // frame 

    JFrame f;
    // Table 
    JTable j;
    DefaultTableModel defaultTableModel;

    // Constructor 
    questions() {
        // Frame initiallization 
        f = new JFrame();

        // Frame Title 
        f.setTitle("Questions tabel");

      
        // Initializing the JTable 
        j = new JTable();
        j.setBounds(30, 40, 800, 100);

        // adding it to JScrollPane 
        JScrollPane sp = new JScrollPane(j);
        f.add(sp);
        // Frame Size 
        f.setSize(800, 800);
        // Frame Visible = true 
        f.setVisible(true);
        questionData();
    }

    public void questionData() {
        Database database = new Database();
        defaultTableModel = (DefaultTableModel) j.getModel();
        defaultTableModel.setColumnCount(0);
                defaultTableModel.addColumn("Id");

        defaultTableModel.addColumn("code");
        defaultTableModel.addColumn("subject");
        defaultTableModel.addColumn("question");
        defaultTableModel.addColumn("answer1");
        defaultTableModel.addColumn("answer2");
        defaultTableModel.addColumn("answer3");
        defaultTableModel.addColumn("answer4");
        defaultTableModel.addColumn("rightanswer");
        defaultTableModel.setRowCount(0);

        try {
            for (Questionmodel questionListTemp : database.questiondata()) {
                   defaultTableModel.addRow(new String[]{
                       String.valueOf(questionListTemp.getId()),questionListTemp.getCode(),questionListTemp.getSubject(),questionListTemp.getQuestion(),questionListTemp.getAnswer1(),questionListTemp.getAnswer2(),questionListTemp.getAnnswer3(),questionListTemp.getAnswer4(),questionListTemp.getRightanswer()
                   });
            }
        } catch (Exception e) {
            System.out.println(e.getLocalizedMessage());
        }

    }

    // Driver  method 

    public static void main(String[] args) {
        new questions();
    }

}
