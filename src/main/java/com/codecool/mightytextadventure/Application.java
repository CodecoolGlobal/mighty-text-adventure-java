package com.codecool.mightytextadventure;

import com.codecool.mightytextadventure.data.Area;
import com.codecool.mightytextadventure.data.QuestionAndAnswers;
import com.codecool.mightytextadventure.logic.Game;
import com.codecool.mightytextadventure.ui.Display;
import com.codecool.mightytextadventure.ui.InputInteger;
import com.codecool.mightytextadventure.ui.InputString;

public class Application {
    public static void main(String[] args) {
        Display display = new Display();
        InputString inputString = new InputString();
        InputInteger inputInteger = new InputInteger();

        display.printMessage("Starting Mighty Text Adventure!");

        Area[] areas = loadAreas();

        Game game = new Game(areas, inputString,inputInteger,display);

        game.run();

        display.printMessage("Exiting from Mighty Text Adventure!");
    }

    private static Area[] loadAreas(){
        QuestionAndAnswers questionAustriaOne = new QuestionAndAnswers("Wer ist aktuell Bundespräsident?","Hofer","Lugner","Van der Bellen","Van der Bellen");
        QuestionAndAnswers questionAustriaTwo = new QuestionAndAnswers("Wer ist aktuell Bundespräsident?","Hofer","Lugner","Van der Bellen","Van der Bellen");
        QuestionAndAnswers questionSerbiaOne = new QuestionAndAnswers("Frage","Aakd","B","Ca","Ca");
        QuestionAndAnswers questionSerbiaTwo = new QuestionAndAnswers("Frage","Adas","B","Ca","Ca");
        QuestionAndAnswers questionHungaryOne = new QuestionAndAnswers("Frage","s","B","Ca","Ca");
        QuestionAndAnswers questionHungaryTwo= new QuestionAndAnswers("Frage","A","B","Ca","Ca");
        QuestionAndAnswers questionSwissOne = new QuestionAndAnswers("Frage","A","B","Ca","Ca");
        QuestionAndAnswers questionSwissTwo = new QuestionAndAnswers("Frage","A","B","Ca","Ca");
        QuestionAndAnswers questionFranceOne = new QuestionAndAnswers("Frage","A","B","Ca","Ca");
        QuestionAndAnswers questionFranceTwo= new QuestionAndAnswers("Frage","A","B","Ca","Ca");
        QuestionAndAnswers questionSpainOne = new QuestionAndAnswers("Frage","A","B","Ca","Ca");
        QuestionAndAnswers questionSpainTwo = new QuestionAndAnswers("Frage","A","B","Ca","Ca");
        Area[] areas =   new Area[6];

          areas[0] = new Area("Austria","\n" +
                "╭╮╭╮╭╮╱╱╭╮╱╱╱╱╱╱╱╱╱╱╱╱╱╭━━━━╮╱╱╭━━━╮╱╱╱╱╱╭╮╱╱╱╱╱╱╱╱╱╱╭━━╮╱╱╱╱╱╱╱╭╮\n" +
                "┃┃┃┃┃┃╱╱┃┃╱╱╱╱╱╱╱╱╱╱╱╱╱┃╭╮╭╮┃╱╱┃╭━╮┃╱╱╱╱╭╯╰╮╱╱╱╱╱╱╱╱╱┃╭╮┃╱╱╱╱╱╱╱┃┃\n" +
                "┃┃┃┃┃┣━━┫┃╭━━┳━━┳╮╭┳━━╮╰╯┃┃┣┻━╮┃┃╱┃┣╮╭┳━┻╮╭╋━┳┳━━┳━╮╱┃╰╯╰┳━━┳━┳━╯┣━━┳━╮\n" +
                "┃╰╯╰╯┃┃━┫┃┃╭━┫╭╮┃╰╯┃┃━┫╱╱┃┃┃╭╮┃┃╰━╯┃┃┃┃━━┫┃┃╭╋┫╭╮┃╭╮╮┃╭━╮┃╭╮┃╭┫╭╮┃┃━┫╭╯\n" +
                "╰╮╭╮╭┫┃━┫╰┫╰━┫╰╯┃┃┃┃┃━┫╱╱┃┃┃╰╯┃┃╭━╮┃╰╯┣━━┃╰┫┃┃┃╭╮┃┃┃┃┃╰━╯┃╰╯┃┃┃╰╯┃┃━┫┃\n" +
                "╱╰╯╰╯╰━━┻━┻━━┻━━┻┻┻┻━━╯╱╱╰╯╰━━╯╰╯╱╰┻━━┻━━┻━┻╯╰┻╯╰┻╯╰╯╰━━━┻━━┻╯╰━━┻━━┻╯",questionAustriaOne,questionAustriaTwo);

        areas[1] = new Area("Hungary","\n" +
                "╭╮╭╮╭╮╱╱╭╮╱╱╱╱╱╱╱╱╱╱╱╱╱╭━━━━╮╱╱╭╮╱╭╮////////////////// \n" +
                "┃┃┃┃┃┃╱╱┃┃╱╱╱╱╱╱╱╱╱╱╱╱╱┃╭╮╭╮┃╱╱┃┃╱┃┃////////////////// \n" +
                "┃┃┃┃┃┣━━┫┃╭━━┳━━┳╮╭┳━━╮╰╯┃┃┣┻━╮┃╰━╯┣╮╭┳━╮╭━━┳━━┳━┳╮╱╭╮ \n" +
                "┃╰╯╰╯┃┃━┫┃┃╭━┫╭╮┃╰╯┃┃━┫╱╱┃┃┃╭╮┃┃╭━╮┃┃┃┃╭╮┫╭╮┃╭╮┃╭┫┃╱┃┃ \n" +
                "╰╮╭╮╭┫┃━┫╰┫╰━┫╰╯┃┃┃┃┃━┫╱╱┃┃┃╰╯┃┃┃╱┃┃╰╯┃┃┃┃╰╯┃╭╮┃┃┃╰━╯┃ \n" +
                "╱╰╯╰╯╰━━┻━┻━━┻━━┻┻┻┻━━╯╱╱╰╯╰━━╯╰╯╱╰┻━━┻╯╰┻━╮┣╯╰┻╯╰━╮╭╯ \n" +
                "╱╱╱╱╱╱╱╱╱╱╱╱╱╱╱╱╱╱╱╱╱╱╱╱╱╱╱╱╱╱╱╱╱╱╱╱╱╱╱╱╱╭━╯┃╱╱╱╱╭━╯┃  \n" +
                "╱╱╱╱╱╱╱╱╱╱╱╱╱╱╱╱╱╱╱╱╱╱╱╱╱╱╱╱╱╱╱╱╱╱╱╱╱╱╱╱╱╰━━╯╱╱╱╱╰━━╯",questionHungaryOne,questionHungaryTwo);
          areas[2] = new Area("Serbia","\n" +
                  "╭╮╭╮╭╮╱╱╭╮╱╱╱╱╱╱╱╱╱╱╱╱╱╭━━━━╮╱╱╭━━━╮╱╱╱╱╭╮//////\n" +
                  "┃┃┃┃┃┃╱╱┃┃╱╱╱╱╱╱╱╱╱╱╱╱╱┃╭╮╭╮┃╱╱┃╭━╮┃╱╱╱╱┃┃//////\n" +
                  "┃┃┃┃┃┣━━┫┃╭━━┳━━┳╮╭┳━━╮╰╯┃┃┣┻━╮┃╰━━┳━━┳━┫╰━┳┳━━╮\n" +
                  "┃╰╯╰╯┃┃━┫┃┃╭━┫╭╮┃╰╯┃┃━┫╱╱┃┃┃╭╮┃╰━━╮┃┃━┫╭┫╭╮┣┫╭╮┃\n" +
                  "╰╮╭╮╭┫┃━┫╰┫╰━┫╰╯┃┃┃┃┃━┫╱╱┃┃┃╰╯┃┃╰━╯┃┃━┫┃┃╰╯┃┃╭╮┃\n" +
                  "╱╰╯╰╯╰━━┻━┻━━┻━━┻┻┻┻━━╯╱╱╰╯╰━━╯╰━━━┻━━┻╯╰━━┻┻╯╰╯",questionSerbiaOne,questionSerbiaTwo);

        areas[3] = new Area("Swiss","\n" +
                "╭╮╭╮╭╮╱╱╭╮╱╱╱╱╱╱╱╱╱╱╱╱╱╱╭╮╱╱╱╱╭━━━╮\n" +
                "┃┃┃┃┃┃╱╱┃┃╱╱╱╱╱╱╱╱╱╱╱╱╱╭╯╰╮╱╱╱┃╭━╮┃\n" +
                "┃┃┃┃┃┣━━┫┃╭━━┳━━┳╮╭┳━━╮╰╮╭╋━━╮┃╰━━┳╮╭╮╭┳┳━━┳━━╮\n" +
                "┃╰╯╰╯┃┃━┫┃┃╭━┫╭╮┃╰╯┃┃━┫╱┃┃┃╭╮┃╰━━╮┃╰╯╰╯┣┫━━┫━━┫\n" +
                "╰╮╭╮╭┫┃━┫╰┫╰━┫╰╯┃┃┃┃┃━┫╱┃╰┫╰╯┃┃╰━╯┣╮╭╮╭┫┣━━┣━━┃\n" +
                "╱╰╯╰╯╰━━┻━┻━━┻━━┻┻┻┻━━╯╱╰━┻━━╯╰━━━╯╰╯╰╯╰┻━━┻━━╯",questionSwissOne,questionSwissTwo);
         areas[4] = new Area("France","\n" +
                 "╭╮╭╮╭╮╱╱╭╮╱╱╱╱╱╱╱╱╱╱╱╱╱╱╭╮╱╱╱╱╭━━━╮\n" +
                 "┃┃┃┃┃┃╱╱┃┃╱╱╱╱╱╱╱╱╱╱╱╱╱╭╯╰╮╱╱╱┃╭━━╯\n" +
                 "┃┃┃┃┃┣━━┫┃╭━━┳━━┳╮╭┳━━╮╰╮╭╋━━╮┃╰━━┳━┳━━┳━╮╭━━┳━━╮\n" +
                 "┃╰╯╰╯┃┃━┫┃┃╭━┫╭╮┃╰╯┃┃━┫╱┃┃┃╭╮┃┃╭━━┫╭┫╭╮┃╭╮┫╭━┫┃━┫\n" +
                 "╰╮╭╮╭┫┃━┫╰┫╰━┫╰╯┃┃┃┃┃━┫╱┃╰┫╰╯┃┃┃╱╱┃┃┃╭╮┃┃┃┃╰━┫┃━┫\n" +
                 "╱╰╯╰╯╰━━┻━┻━━┻━━┻┻┻┻━━╯╱╰━┻━━╯╰╯╱╱╰╯╰╯╰┻╯╰┻━━┻━━╯",questionFranceOne,questionFranceTwo);

          areas[5] = new Area("Spain","\n" +
                  "╭╮╭╮╭╮╱╱╭╮╱╱╱╱╱╱╱╱╱╱╱╱╱╱╭╮╱╱╱╱╭━━━╮\n" +
                  "┃┃┃┃┃┃╱╱┃┃╱╱╱╱╱╱╱╱╱╱╱╱╱╭╯╰╮╱╱╱┃╭━╮┃\n" +
                  "┃┃┃┃┃┣━━┫┃╭━━┳━━┳╮╭┳━━╮╰╮╭╋━━╮┃╰━━┳━━┳━━┳┳━╮\n" +
                  "┃╰╯╰╯┃┃━┫┃┃╭━┫╭╮┃╰╯┃┃━┫╱┃┃┃╭╮┃╰━━╮┃╭╮┃╭╮┣┫╭╮╮\n" +
                  "╰╮╭╮╭┫┃━┫╰┫╰━┫╰╯┃┃┃┃┃━┫╱┃╰┫╰╯┃┃╰━╯┃╰╯┃╭╮┃┃┃┃┃\n" +
                  "╱╰╯╰╯╰━━┻━┻━━┻━━┻┻┻┻━━╯╱╰━┻━━╯╰━━━┫╭━┻╯╰┻┻╯╰╯\n" +
                  "╱╱╱╱╱╱╱╱╱╱╱╱╱╱╱╱╱╱╱╱╱╱╱╱╱╱╱╱╱╱╱╱╱╱┃┃\n" +
                  "╱╱╱╱╱╱╱╱╱╱╱╱╱╱╱╱╱╱╱╱╱╱╱╱╱╱╱╱╱╱╱╱╱╱╰╯",questionSpainOne,questionSpainTwo);

        return areas;
    }
}
