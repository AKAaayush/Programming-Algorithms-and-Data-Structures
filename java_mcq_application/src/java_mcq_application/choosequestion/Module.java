/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_mcq_application.choosequestion;

/**
 *
 * @author N I T R O
 */
public class Module {
    String code, subject, question, answer1, answer2,answer3,answer4,rightanswer;

    public Module(String code, String subject, String question, String answer1, String answer2, String answer3, String answer4,String rightanswer) {
        this.code = code;
        this.subject = subject;
        this.question = question;
        this.answer1 = answer1;
        this.answer2 = answer2;
        this.answer3 = answer3;
        this.answer4 = answer4;
        this.rightanswer = rightanswer;
        
    }

    public String getCode() {
        return code;
    }

    public String getSubject() {
        return subject;
    }

    public String getQuestion() {
        return question;
    }

    public String getAnswer1() {
        return answer1;
    }

    public String getAnswer2() {
        return answer2;
    }

    public String getAnswer3() {
        return answer3;
    }

    public String getAnswer4() {
        return answer4;
    }

    public String getRightanswer() {
        return rightanswer;
    }
    
    
    
    
}
