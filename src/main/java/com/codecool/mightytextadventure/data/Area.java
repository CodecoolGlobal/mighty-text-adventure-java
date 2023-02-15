package com.codecool.mightytextadventure.data;

public class Area {

     String description;
    private String welcomeTo;
    private QuestionAndAnswers question1;



    public Area(String description, String welcomeTo, QuestionAndAnswers question1) {
        this.welcomeTo =welcomeTo;
        this.description = description;
        this.question1 = question1;

    }
    public String description(){
        return description;
    }
    public String getWelcomeTo(){
        return welcomeTo;
    }

    public String getQuestion(){

        return question1.question;
    }

    public String getAnswersOptions(){

        String answers = " a:" + question1.answerA + "\n b:" +  question1.answerB + "\n c:" + question1.answerC;
            return answers;
    }

    public boolean answerIsCorrect(String answer){
        return answer.equals(question1.correctAnswer);
    }


}
