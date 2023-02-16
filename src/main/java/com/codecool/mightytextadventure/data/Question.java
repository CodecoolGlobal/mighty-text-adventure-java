package com.codecool.mightytextadventure.data;

public class Question {

    public Question(String question, String answerA, String answerB, String answerC, String correctAnswer){
      this.question = question;
        this.answerA = answerA;
        this.answerB = answerB;
        this.answerC = answerC;
        this.correctAnswer = correctAnswer;

    }
    public String question;
    public String answerA;
    public String answerB;
    public String answerC;
    public String correctAnswer;


}
