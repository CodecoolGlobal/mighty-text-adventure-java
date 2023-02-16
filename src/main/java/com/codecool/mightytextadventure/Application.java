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
        QuestionAndAnswers questionAustria = new QuestionAndAnswers("Wer ist aktuell Bundespräsident?","Hofer","Lugner","Van der Bellen","Van der Bellen");
        QuestionAndAnswers questionSerbia = new QuestionAndAnswers("Frage","A","B","Ca","Ca");
        QuestionAndAnswers questionHungary = new QuestionAndAnswers("Frage","A","B","Ca","Ca");
        QuestionAndAnswers questionSwiss = new QuestionAndAnswers("Frage","A","B","Ca","Ca");
        QuestionAndAnswers questionFrance = new QuestionAndAnswers("Frage","A","B","Ca","Ca");
        QuestionAndAnswers questionSpain = new QuestionAndAnswers("Frage","A","B","Ca","Ca");
        Area[] areas =   new Area[6];

          areas[0] = new Area("Austria","\n" +
                "╭╮╭╮╭╮╱╱╭╮╱╱╱╱╱╱╱╱╱╱╱╱╱╭━━━━╮╱╱╭━━━╮╱╱╱╱╱╭╮╱╱╱╱╱╱╱╱╱╱╭━━╮╱╱╱╱╱╱╱╭╮\n" +
                "┃┃┃┃┃┃╱╱┃┃╱╱╱╱╱╱╱╱╱╱╱╱╱┃╭╮╭╮┃╱╱┃╭━╮┃╱╱╱╱╭╯╰╮╱╱╱╱╱╱╱╱╱┃╭╮┃╱╱╱╱╱╱╱┃┃\n" +
                "┃┃┃┃┃┣━━┫┃╭━━┳━━┳╮╭┳━━╮╰╯┃┃┣┻━╮┃┃╱┃┣╮╭┳━┻╮╭╋━┳┳━━┳━╮╱┃╰╯╰┳━━┳━┳━╯┣━━┳━╮\n" +
                "┃╰╯╰╯┃┃━┫┃┃╭━┫╭╮┃╰╯┃┃━┫╱╱┃┃┃╭╮┃┃╰━╯┃┃┃┃━━┫┃┃╭╋┫╭╮┃╭╮╮┃╭━╮┃╭╮┃╭┫╭╮┃┃━┫╭╯\n" +
                "╰╮╭╮╭┫┃━┫╰┫╰━┫╰╯┃┃┃┃┃━┫╱╱┃┃┃╰╯┃┃╭━╮┃╰╯┣━━┃╰┫┃┃┃╭╮┃┃┃┃┃╰━╯┃╰╯┃┃┃╰╯┃┃━┫┃\n" +
                "╱╰╯╰╯╰━━┻━┻━━┻━━┻┻┻┻━━╯╱╱╰╯╰━━╯╰╯╱╰┻━━┻━━┻━┻╯╰┻╯╰┻╯╰╯╰━━━┻━━┻╯╰━━┻━━┻╯",questionAustria);

        areas[1] = new Area("Hungary","\n" +
                "╭╮╭╮╭╮╱╱╭╮╱╱╱╱╱╱╱╱╱╱╱╱╱╭━━━━╮╱╱╭╮╱╭╮////////////////// \n" +
                "┃┃┃┃┃┃╱╱┃┃╱╱╱╱╱╱╱╱╱╱╱╱╱┃╭╮╭╮┃╱╱┃┃╱┃┃////////////////// \n" +
                "┃┃┃┃┃┣━━┫┃╭━━┳━━┳╮╭┳━━╮╰╯┃┃┣┻━╮┃╰━╯┣╮╭┳━╮╭━━┳━━┳━┳╮╱╭╮ \n" +
                "┃╰╯╰╯┃┃━┫┃┃╭━┫╭╮┃╰╯┃┃━┫╱╱┃┃┃╭╮┃┃╭━╮┃┃┃┃╭╮┫╭╮┃╭╮┃╭┫┃╱┃┃ \n" +
                "╰╮╭╮╭┫┃━┫╰┫╰━┫╰╯┃┃┃┃┃━┫╱╱┃┃┃╰╯┃┃┃╱┃┃╰╯┃┃┃┃╰╯┃╭╮┃┃┃╰━╯┃ \n" +
                "╱╰╯╰╯╰━━┻━┻━━┻━━┻┻┻┻━━╯╱╱╰╯╰━━╯╰╯╱╰┻━━┻╯╰┻━╮┣╯╰┻╯╰━╮╭╯ \n" +
                "╱╱╱╱╱╱╱╱╱╱╱╱╱╱╱╱╱╱╱╱╱╱╱╱╱╱╱╱╱╱╱╱╱╱╱╱╱╱╱╱╱╭━╯┃╱╱╱╱╭━╯┃  \n" +
                "╱╱╱╱╱╱╱╱╱╱╱╱╱╱╱╱╱╱╱╱╱╱╱╱╱╱╱╱╱╱╱╱╱╱╱╱╱╱╱╱╱╰━━╯╱╱╱╱╰━━╯",questionHungary);
          areas[2] = new Area("Serbia","\n" +
                  "╭╮╭╮╭╮╱╱╭╮╱╱╱╱╱╱╱╱╱╱╱╱╱╭━━━━╮╱╱╭━━━╮╱╱╱╱╭╮//////\n" +
                  "┃┃┃┃┃┃╱╱┃┃╱╱╱╱╱╱╱╱╱╱╱╱╱┃╭╮╭╮┃╱╱┃╭━╮┃╱╱╱╱┃┃//////\n" +
                  "┃┃┃┃┃┣━━┫┃╭━━┳━━┳╮╭┳━━╮╰╯┃┃┣┻━╮┃╰━━┳━━┳━┫╰━┳┳━━╮\n" +
                  "┃╰╯╰╯┃┃━┫┃┃╭━┫╭╮┃╰╯┃┃━┫╱╱┃┃┃╭╮┃╰━━╮┃┃━┫╭┫╭╮┣┫╭╮┃\n" +
                  "╰╮╭╮╭┫┃━┫╰┫╰━┫╰╯┃┃┃┃┃━┫╱╱┃┃┃╰╯┃┃╰━╯┃┃━┫┃┃╰╯┃┃╭╮┃\n" +
                  "╱╰╯╰╯╰━━┻━┻━━┻━━┻┻┻┻━━╯╱╱╰╯╰━━╯╰━━━┻━━┻╯╰━━┻┻╯╰╯",questionSerbia );

        areas[3] = new Area("Swiss","\n" +
                "╭╮╭╮╭╮╱╱╭╮╱╱╱╱╱╱╱╱╱╱╱╱╱╱╭╮╱╱╱╱╭━━━╮\n" +
                "┃┃┃┃┃┃╱╱┃┃╱╱╱╱╱╱╱╱╱╱╱╱╱╭╯╰╮╱╱╱┃╭━╮┃\n" +
                "┃┃┃┃┃┣━━┫┃╭━━┳━━┳╮╭┳━━╮╰╮╭╋━━╮┃╰━━┳╮╭╮╭┳┳━━┳━━╮\n" +
                "┃╰╯╰╯┃┃━┫┃┃╭━┫╭╮┃╰╯┃┃━┫╱┃┃┃╭╮┃╰━━╮┃╰╯╰╯┣┫━━┫━━┫\n" +
                "╰╮╭╮╭┫┃━┫╰┫╰━┫╰╯┃┃┃┃┃━┫╱┃╰┫╰╯┃┃╰━╯┣╮╭╮╭┫┣━━┣━━┃\n" +
                "╱╰╯╰╯╰━━┻━┻━━┻━━┻┻┻┻━━╯╱╰━┻━━╯╰━━━╯╰╯╰╯╰┻━━┻━━╯",questionSwiss);
         areas[4] = new Area("France","\n" +
                 "╭╮╭╮╭╮╱╱╭╮╱╱╱╱╱╱╱╱╱╱╱╱╱╱╭╮╱╱╱╱╭━━━╮\n" +
                 "┃┃┃┃┃┃╱╱┃┃╱╱╱╱╱╱╱╱╱╱╱╱╱╭╯╰╮╱╱╱┃╭━━╯\n" +
                 "┃┃┃┃┃┣━━┫┃╭━━┳━━┳╮╭┳━━╮╰╮╭╋━━╮┃╰━━┳━┳━━┳━╮╭━━┳━━╮\n" +
                 "┃╰╯╰╯┃┃━┫┃┃╭━┫╭╮┃╰╯┃┃━┫╱┃┃┃╭╮┃┃╭━━┫╭┫╭╮┃╭╮┫╭━┫┃━┫\n" +
                 "╰╮╭╮╭┫┃━┫╰┫╰━┫╰╯┃┃┃┃┃━┫╱┃╰┫╰╯┃┃┃╱╱┃┃┃╭╮┃┃┃┃╰━┫┃━┫\n" +
                 "╱╰╯╰╯╰━━┻━┻━━┻━━┻┻┻┻━━╯╱╰━┻━━╯╰╯╱╱╰╯╰╯╰┻╯╰┻━━┻━━╯",questionFrance);

          areas[5] = new Area("Spain","\n" +
                  "╭╮╭╮╭╮╱╱╭╮╱╱╱╱╱╱╱╱╱╱╱╱╱╱╭╮╱╱╱╱╭━━━╮\n" +
                  "┃┃┃┃┃┃╱╱┃┃╱╱╱╱╱╱╱╱╱╱╱╱╱╭╯╰╮╱╱╱┃╭━╮┃\n" +
                  "┃┃┃┃┃┣━━┫┃╭━━┳━━┳╮╭┳━━╮╰╮╭╋━━╮┃╰━━┳━━┳━━┳┳━╮\n" +
                  "┃╰╯╰╯┃┃━┫┃┃╭━┫╭╮┃╰╯┃┃━┫╱┃┃┃╭╮┃╰━━╮┃╭╮┃╭╮┣┫╭╮╮\n" +
                  "╰╮╭╮╭┫┃━┫╰┫╰━┫╰╯┃┃┃┃┃━┫╱┃╰┫╰╯┃┃╰━╯┃╰╯┃╭╮┃┃┃┃┃\n" +
                  "╱╰╯╰╯╰━━┻━┻━━┻━━┻┻┻┻━━╯╱╰━┻━━╯╰━━━┫╭━┻╯╰┻┻╯╰╯\n" +
                  "╱╱╱╱╱╱╱╱╱╱╱╱╱╱╱╱╱╱╱╱╱╱╱╱╱╱╱╱╱╱╱╱╱╱┃┃\n" +
                  "╱╱╱╱╱╱╱╱╱╱╱╱╱╱╱╱╱╱╱╱╱╱╱╱╱╱╱╱╱╱╱╱╱╱╰╯",questionSpain);


      //  areas[6] = new Area("Room 6");
     //   areas[7] = new Area("");


        return areas;
    }
}
