package com.codecool.mightytextadventure.data;

public class Area {

     String description;
    private String welcomeTo;
    private QuestionAndAnswers question1;
    private QuestionAndAnswers question2;



    public Area(String description, String welcomeTo, QuestionAndAnswers question1,QuestionAndAnswers question2) {
        this.welcomeTo =welcomeTo;
        this.description = description;
        this.question1 = question1;
        this.question2 = question2;

    }
    public String description(){
        return description;
    }
    public String getWelcomeTo(){
        return welcomeTo;
    }

    public String getQuestionOne(){

        return question1.question;
    }
    public String getQuestionTwo(){

        return question2.question;
    }

    public String getAnswersOptionsOne(){

        String answers = " a:" + question1.answerA + "\n b:" +  question1.answerB + "\n c:" + question1.answerC;
            return answers;
    }
    public String getAnswersOptionsTwo(){

        String answers = " a:" + question2.answerA + "\n b:" + question2.answerB + "\n c:" + question2.answerC;
        return answers;
    }


    public boolean answerOneIsCorrect(String answer){
        return answer.equals(question1.correctAnswer);
    }
    public boolean answerTwoIsCorrect(String answer){
        return answer.equals(question2.correctAnswer);
    }

}
