/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_mcq_application.admin;

/**
 *
 * @author N I T R O
 */
public class Questionmodel {
      private int id;
    private String code;
    private String subject;
    private String question;
    private String answer1;
    private String answer2;
    private String annswer3;
    private String answer4;
    private String rightanswer;

    public Questionmodel(int id, String code, String subject,String question, String answer1, String answer2, String annswer3, String answer4, String rightanswer) {
        this.id = id;
        this.code = code;
        this.question = question;
        this.subject = subject;
        this.answer1 = answer1;
        this.answer2 = answer2;
        this.annswer3 = annswer3;
        this.answer4 = answer4;
        this.rightanswer = rightanswer;
    }

    public Questionmodel(String question) {
        this.question = question;
    }

    public String getQuestion() {
        return question;
    }

    public int getId() {
        return id;
    }

    public String getCode() {
        return code;
    }

    public String getSubject() {
        return subject;
    }

    public String getAnswer1() {
        return answer1;
    }

    public String getAnswer2() {
        return answer2;
    }

    public String getAnnswer3() {
        return annswer3;
    }

    public String getAnswer4() {
        return answer4;
    }

    public String getRightanswer() {
        return rightanswer;
    }
}
