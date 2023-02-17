package com.codecool.mightytextadventure.data;

public class Area {

    public String description;
    public String reward;
    private String welcomeTo;
    private Question[] questions;


    public Area(String description, String welcomeTo, Question question1, Question question2,String reward) {
        this.welcomeTo =welcomeTo;
        this.description = description;
        this.questions = new Question[2];
        questions[0] = question1;
        questions[1] = question2;
        this.reward = reward;

    }
    public String description(){
        return description;
    }
    public String getWelcomeTo(){
        return welcomeTo;
    }

    public String getQuestion(int index){

        return questions[index].question;
    }
    public String getAnswerOptions(int index){

        String answers = " a) " + questions[index].answerA + "\n b) " +  questions[index].answerB + "\n c) " + questions[index].answerC;
            return answers;
    }
    public boolean answerIsCorrect(String answer, int index){
        return answer.toLowerCase().equals(questions[index].correctAnswer.toLowerCase());
    }
    public Question [] getQuestions(){

        return questions;
    }
}
