/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_mcq_application.database;

import java.util.List;
import java_mcq_application.admin.Questionmodel;
import java_mcq_application.admin.Usermodel;
import java_mcq_application.choosequestion.Module;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author N I T R O
 */
public class DatabaseTest {
    
    public DatabaseTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of signup method, of class Database.
     */
    @Test
    public void testSignup() {
        System.out.println("signup");
        int id = 0;
        String gmail = "";
        String firstname = "";
        String lastname = "";
        String lusername = "";
        String lpassword = "";
        Database instance = new Database();
        int expResult = 0;
        int result = instance.signup(id, gmail, firstname, lastname, lusername, lpassword);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of randomAlphaNumeric method, of class Database.
     */
    @Test
    public void testRandomAlphaNumeric() {
        System.out.println("randomAlphaNumeric");
        int count = 0;
        String expResult = "";
        String result = Database.randomAlphaNumeric(count);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of loginStatus method, of class Database.
     */
    @Test
    public void testLoginStatus() {
        System.out.println("loginStatus");
        String username = "";
        String password = "";
        Database instance = new Database();
        boolean expResult = false;
        boolean result = instance.loginStatus(username, password);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of module method, of class Database.
     */
    @Test
    public void testModule() {
        System.out.println("module");
        int id = 0;
        int subcode = 0;
        String subject = "";
        String question = "";
        String ans1 = "";
        String ans2 = "";
        String ans3 = "";
        String ans4 = "";
        String rightanswer = "";
        Database instance = new Database();
        int expResult = 0;
        int result = instance.module(id, subcode, subject, question, ans1, ans2, ans3, ans4, rightanswer);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of updatemodule method, of class Database.
     */
    @Test
    public void testUpdatemodule() {
        System.out.println("updatemodule");
        int id = 0;
        int subcode = 0;
        String subject = "";
        String question = "";
        String ans1 = "";
        String ans2 = "";
        String ans3 = "";
        String ans4 = "";
        String rightanswer = "";
        Database instance = new Database();
        int expResult = 0;
        int result = instance.updatemodule(id, subcode, subject, question, ans1, ans2, ans3, ans4, rightanswer);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of deletemodule method, of class Database.
     */
    @Test
    public void testDeletemodule() {
        System.out.println("deletemodule");
        int id = 0;
        Database instance = new Database();
        int expResult = 0;
        int result = instance.deletemodule(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of deleteuser method, of class Database.
     */
    @Test
    public void testDeleteuser() {
        System.out.println("deleteuser");
        int id = 0;
        Database instance = new Database();
        int expResult = 0;
        int result = instance.deleteuser(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of modulequestion method, of class Database.
     */
    @Test
    public void testModulequestion() {
        System.out.println("modulequestion");
        String modelname = "";
        Database instance = new Database();
        List<Module> expResult = null;
        List<Module> result = instance.modulequestion(modelname);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of adminloginStatus method, of class Database.
     */
    @Test
    public void testAdminloginStatus() {
        System.out.println("adminloginStatus");
        int id = 0;
        String adminusername = "";
        String adminpassword = "";
        Database instance = new Database();
        boolean expResult = false;
        boolean result = instance.adminloginStatus(id, adminusername, adminpassword);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of getUserDetail method, of class Database.
     */
    @Test
    public void testGetUserDetail() {
        System.out.println("getUserDetail");
        Database instance = new Database();
        List<Usermodel> expResult = null;
        List<Usermodel> result = instance.getUserDetail();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of questiondata method, of class Database.
     */
    @Test
    public void testQuestiondata() {
        System.out.println("questiondata");
        Database instance = new Database();
        List<Questionmodel> expResult = null;
        List<Questionmodel> result = instance.questiondata();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
      //  fail("The test case is a prototype.");
    }
    
}
