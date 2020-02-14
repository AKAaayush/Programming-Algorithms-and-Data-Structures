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
public class userdetails extends JFrame {

    // frame 

    JFrame f;
    // Table 
    JTable j;
    DefaultTableModel defaultTableModel;

    // Constructor 
    userdetails() {
        // Frame initiallization 
        f = new JFrame();

        // Frame Title 
        f.setTitle("user tabel");

      
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
        loadUserData();
    }

    public void loadUserData() {
        Database database = new Database();
        defaultTableModel = (DefaultTableModel) j.getModel();
        defaultTableModel.setColumnCount(0);
                defaultTableModel.addColumn("Id");

        defaultTableModel.addColumn("FirstName");
        defaultTableModel.addColumn("LastName");
        defaultTableModel.addColumn("Email");
        defaultTableModel.addColumn("UserName");
        defaultTableModel.addColumn("Password");
        defaultTableModel.addColumn("tokenno");
        defaultTableModel.setRowCount(0);

        try {
            for (Usermodel userTemp : database.getUserDetail()) {
                   defaultTableModel.addRow(new String[]{
                       String.valueOf(userTemp.getId()),userTemp.getFirstName(),userTemp.getLastName(),userTemp.getEmail(),userTemp.getUserName(),userTemp.getPassword(),userTemp.getTokenno()
                   });
            }
        } catch (Exception e) {
            System.out.println(e.getLocalizedMessage());
        }

    }

    // Driver  method 

    public static void main(String[] args) {
        new userdetails();
    }

}
