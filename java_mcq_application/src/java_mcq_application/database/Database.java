/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_mcq_application.database;

/**
 *
 * @author LENOVO
 */
import java.util.List;
import java.sql.*;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java_mcq_application.choosequestion.Module;
import java_mcq_application.admin.Questionmodel;
import java_mcq_application.admin.Usermodel;
import javax.swing.JOptionPane;
import sun.security.rsa.RSACore;

public class Database {

    private static final String ALPHA_NUMERIC_STRING = "abcdefghijklmnopqrstuvwxyz0123456789";

    public Connection con;
    PreparedStatement pstmt;
    public static String TEMP_TOKEN = "";
    public static String TEMP_USERNAME = "";

    public Database() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/model_chose_question", "root", "");

        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
    }

    public int signup(int id,String gmail, String firstname, String lastname, String lusername, String lpassword) {
        int result = 0;
        try {

            
            pstmt = con.prepareStatement("insert into tbluser values(?,?,?,?,?,?,?)");
            pstmt.setInt(1, id);
            pstmt.setString(2, firstname);
            pstmt.setString(3, lastname);
            pstmt.setString(4, gmail);
            pstmt.setString(5, lusername);
            pstmt.setString(6, lpassword);
            pstmt.setString(7, randomAlphaNumeric(5));

            result = pstmt.executeUpdate();
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }

        return result;

    }
//RandomToken

    public static String randomAlphaNumeric(int count) {
        StringBuilder builder = new StringBuilder();
        while (count-- != 0) {
            int character = (int) (Math.random() * ALPHA_NUMERIC_STRING.length());
            builder.append(ALPHA_NUMERIC_STRING.charAt(character));
        }
        return builder.toString();
    }

    //    login validation
    boolean status = false;

    public boolean loginStatus(String username, String password) {

        try {

            pstmt = con.prepareStatement("select * from tbluser where UserName=? and Password=?");
            pstmt.setString(1, username);
            pstmt.setString(2, password);
            ResultSet rs = pstmt.executeQuery();
            if (rs.next()) {
                TEMP_TOKEN = rs.getString("tokenno");
                TEMP_USERNAME = rs.getString("UserName");

                return status = true;
            }
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }

        return status;

    }

//    tokennumber
//    public String token(String tokennumber) {
//        String tokenno = "";
//
//        try {
//            pstmt = con.prepareStatement("select * from tbluser where tokenno=? ");
//            pstmt.setString(1, tokennumber);
//            pstmt.setString(6, randomAlphaNumeric(1));
//
//            ResultSet rs = pstmt.executeQuery();
//
//            if (rs.next()) {
//
//            }
//        } catch (Exception e) {
//            System.out.println("Error: " + e);
//        }
//        return tokenno;
//
//    }
//inserting moduel
      public int module(int id,int subcode, String subject, String question, String ans1, String ans2, String ans3,String ans4,String rightanswer) {
        int result = 0;
        try {

            
            pstmt = con.prepareStatement("insert into modulequestion  values(?,?,?,?,?,?,?,?,?)");
            pstmt.setInt(1, id);
            pstmt.setInt(2, subcode);
            pstmt.setString(3, subject);
            pstmt.setString(4, question);
            pstmt.setString(5, ans1);
            pstmt.setString(6, ans2);
             pstmt.setString(7, ans3);
              pstmt.setString(8, ans4);
              pstmt.setString(9, rightanswer);
              
           

            result = pstmt.executeUpdate();
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }

        return result;

    }
          public int updatemodule(int id,int subcode, String subject, String question, String ans1, String ans2, String ans3,String ans4,String rightanswer) {
        int result = 0;
        try {

            
            pstmt = con.prepareStatement("update modulequestion set code = ?,subject = ?, question = ? , answer1 =? , answer2 =? , answer3 = ? , answer4 = ?, rightanswer = ? where id = ? ");
           
            pstmt.setInt(1, subcode);
            pstmt.setString(2, subject);
            pstmt.setString(3, question);
            pstmt.setString(4, ans1);
            pstmt.setString(5, ans2);
             pstmt.setString(6, ans3);
              pstmt.setString(7, ans4);
              pstmt.setString(8, rightanswer);
               pstmt.setInt(9, id);
              
           

            result = pstmt.executeUpdate();
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }

        return result;

    }
          
//          delete question
         public int deletemodule(int id) {
        int result = 0;
        try {

            
            pstmt = con.prepareStatement("delete from modulequestion where id = ? ");
           
               pstmt.setInt(1, id);
              
           

            result = pstmt.executeUpdate();
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }

        return result;

    }
         
//         delete user
           public int deleteuser(int id) {
        int result = 0;
        try {

            
            pstmt = con.prepareStatement("delete from tbluser where id = ? ");
           
               pstmt.setInt(1, id);
              
           

            result = pstmt.executeUpdate();
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }

        return result;

    }
         
      
//      module
      public List<Module> modulequestion(String modelname){
          List<Module> modleques= new ArrayList<Module>();
          try{
          pstmt = con.prepareStatement("select * from modulequestion where subject =?");    
          pstmt.setString(1, modelname);
          ResultSet rs = pstmt.executeQuery();
          while(rs.next()){
              modleques.add(new Module(rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7), rs.getString(8),rs.getString(9)));
          }
          }
          catch(Exception e){
              System.out.println("Error: " + e);
              
          }
          
          return modleques;
          
      }//    admin login validation
    boolean admin = false;

    public boolean adminloginStatus(int id, String adminusername, String adminpassword) {

        try {

            pstmt = con.prepareStatement("select * from admin where id=? and adminname=? and adminpassword=?");
            pstmt.setInt(1, id);
            pstmt.setString(2, adminusername);
            pstmt.setString(3, adminpassword);
            ResultSet rs = pstmt.executeQuery();
            if (rs.next()) {
//                TEMP_TOKEN = rs.getString("tokenno");
//                TEMP_USERNAME = rs.getString("UserName");

                return status = true;
            }
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }

        return admin;

    }
    
    //show user detail 
    public List<Usermodel> getUserDetail() {
         List<Usermodel> userListTemp= new ArrayList<Usermodel>();
          try{
          pstmt = con.prepareStatement("select * from tbluser");
          
          ResultSet rs = pstmt.executeQuery();
          while(rs.next()){
              userListTemp.add(new Usermodel(rs.getInt("id"), rs.getString("FirstName"), rs.getString("LastName"),
                      rs.getString("Email"), rs.getString("UserName"), rs.getString("Password"), rs.getString("tokenno")));
           }
          }
          catch(Exception e){
              System.out.println("Error: " + e);
              
          }
          
          return userListTemp;
    }
    
//    show question/asnwer deatils
         public List<Questionmodel> questiondata() {
         List<Questionmodel> questionListTemp= new ArrayList<Questionmodel>();
          try{
          pstmt = con.prepareStatement("select * from modulequestion");
          
          ResultSet rs = pstmt.executeQuery();
          while(rs.next()){
              questionListTemp.add(new Questionmodel(rs.getInt("id"), rs.getString("code"), rs.getString("subject"),rs.getString("question"), rs.getString("answer1"), rs.getString("answer2"), rs.getString("answer3"),rs.getString("answer4"),rs.getString("rightanswer")));
           }
          }
          catch(Exception e){
              System.out.println("Error: " + e);
              
          }
          
          return questionListTemp;
    }
      
//    
//    public int update(String name,String email,String address,String password)
//    {
//        int result=0;
//        try {
//            pstmt=con.prepareStatement("update student set name=?, address=?, password=? where email=?");
//            pstmt.setString(1,name);
//            pstmt.setString(2,address);
//            pstmt.setString(3,password);
//            pstmt.setString(4,email);
//            result=pstmt.executeUpdate();
//        } catch (Exception e) {
//            System.out.println("Error: "+e);
//        }
//           
//            return result;
//        
//    }
//    
//
//    Iterable<Usermodel> getquestiondata() {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
}
