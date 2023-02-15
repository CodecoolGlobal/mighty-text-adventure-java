package com.codecool.mightytextadventure;

import com.codecool.mightytextadventure.data.Area;
import com.codecool.mightytextadventure.data.QuestionAndAnswers;
import com.codecool.mightytextadventure.logic.Game;
import com.codecool.mightytextadventure.ui.Display;
import com.codecool.mightytextadventure.ui.Input;

public class Application {
    public static void main(String[] args) {
        Display display = new Display();
        Input input = new Input();

        display.printMessage("Starting Mighty Text Adventure!");

        Area[] areas = loadAreas();

        Game game = new Game(areas, input,display);

        game.run();


        display.printMessage("Exiting from Mighty Text Adventure!");
    }

    private static Area[] loadAreas(){
        QuestionAndAnswers questionAustria = new QuestionAndAnswers("Wer ist aktuell Bundespräsident?","Hofer","Lugner","Van der Bellen","Van der Bellen");
        QuestionAndAnswers questionSerbia = new QuestionAndAnswers("Frage","A","B","Ca","Ca");
        QuestionAndAnswers questionHungary = new QuestionAndAnswers("Frage","A","B","Ca","Ca");
        Area[] areas =   new Area[7];

          areas[0] = new Area("Austria","\n" +
                "╭╮╭╮╭╮╱╱╭╮╱╱╱╱╱╱╱╱╱╱╱╱╱╭━━━━╮╱╱╭━━━╮╱╱╱╱╱╭╮╱╱╱╱╱╱╱╱╱╱╭━━╮╱╱╱╱╱╱╱╭╮\n" +
                "┃┃┃┃┃┃╱╱┃┃╱╱╱╱╱╱╱╱╱╱╱╱╱┃╭╮╭╮┃╱╱┃╭━╮┃╱╱╱╱╭╯╰╮╱╱╱╱╱╱╱╱╱┃╭╮┃╱╱╱╱╱╱╱┃┃\n" +
                "┃┃┃┃┃┣━━┫┃╭━━┳━━┳╮╭┳━━╮╰╯┃┃┣┻━╮┃┃╱┃┣╮╭┳━┻╮╭╋━┳┳━━┳━╮╱┃╰╯╰┳━━┳━┳━╯┣━━┳━╮\n" +
                "┃╰╯╰╯┃┃━┫┃┃╭━┫╭╮┃╰╯┃┃━┫╱╱┃┃┃╭╮┃┃╰━╯┃┃┃┃━━┫┃┃╭╋┫╭╮┃╭╮╮┃╭━╮┃╭╮┃╭┫╭╮┃┃━┫╭╯\n" +
                "╰╮╭╮╭┫┃━┫╰┫╰━┫╰╯┃┃┃┃┃━┫╱╱┃┃┃╰╯┃┃╭━╮┃╰╯┣━━┃╰┫┃┃┃╭╮┃┃┃┃┃╰━╯┃╰╯┃┃┃╰╯┃┃━┫┃\n" +
                "╱╰╯╰╯╰━━┻━┻━━┻━━┻┻┻┻━━╯╱╱╰╯╰━━╯╰╯╱╰┻━━┻━━┻━┻╯╰┻╯╰┻╯╰╯╰━━━┻━━┻╯╰━━┻━━┻╯",questionAustria);

          areas[2] = new Area("Serbia","\n" +
                  "╭╮╭╮╭╮╱╱╭╮╱╱╱╱╱╱╱╱╱╱╱╱╱╭━━━━╮╱╱╭━━━╮╱╱╱╱╭╮//////\n" +
                  "┃┃┃┃┃┃╱╱┃┃╱╱╱╱╱╱╱╱╱╱╱╱╱┃╭╮╭╮┃╱╱┃╭━╮┃╱╱╱╱┃┃//////\n" +
                  "┃┃┃┃┃┣━━┫┃╭━━┳━━┳╮╭┳━━╮╰╯┃┃┣┻━╮┃╰━━┳━━┳━┫╰━┳┳━━╮\n" +
                  "┃╰╯╰╯┃┃━┫┃┃╭━┫╭╮┃╰╯┃┃━┫╱╱┃┃┃╭╮┃╰━━╮┃┃━┫╭┫╭╮┣┫╭╮┃\n" +
                  "╰╮╭╮╭┫┃━┫╰┫╰━┫╰╯┃┃┃┃┃━┫╱╱┃┃┃╰╯┃┃╰━╯┃┃━┫┃┃╰╯┃┃╭╮┃\n" +
                  "╱╰╯╰╯╰━━┻━┻━━┻━━┻┻┻┻━━╯╱╱╰╯╰━━╯╰━━━┻━━┻╯╰━━┻┻╯╰╯",questionSerbia );

          areas[1] = new Area("Hungary","\n" +
                "╭╮╭╮╭╮╱╱╭╮╱╱╱╱╱╱╱╱╱╱╱╱╱╭━━━━╮╱╱╭╮╱╭╮////////////////// \n" +
                "┃┃┃┃┃┃╱╱┃┃╱╱╱╱╱╱╱╱╱╱╱╱╱┃╭╮╭╮┃╱╱┃┃╱┃┃////////////////// \n" +
                "┃┃┃┃┃┣━━┫┃╭━━┳━━┳╮╭┳━━╮╰╯┃┃┣┻━╮┃╰━╯┣╮╭┳━╮╭━━┳━━┳━┳╮╱╭╮ \n" +
                "┃╰╯╰╯┃┃━┫┃┃╭━┫╭╮┃╰╯┃┃━┫╱╱┃┃┃╭╮┃┃╭━╮┃┃┃┃╭╮┫╭╮┃╭╮┃╭┫┃╱┃┃ \n" +
                "╰╮╭╮╭┫┃━┫╰┫╰━┫╰╯┃┃┃┃┃━┫╱╱┃┃┃╰╯┃┃┃╱┃┃╰╯┃┃┃┃╰╯┃╭╮┃┃┃╰━╯┃ \n" +
                "╱╰╯╰╯╰━━┻━┻━━┻━━┻┻┻┻━━╯╱╱╰╯╰━━╯╰╯╱╰┻━━┻╯╰┻━╮┣╯╰┻╯╰━╮╭╯ \n" +
                "╱╱╱╱╱╱╱╱╱╱╱╱╱╱╱╱╱╱╱╱╱╱╱╱╱╱╱╱╱╱╱╱╱╱╱╱╱╱╱╱╱╭━╯┃╱╱╱╱╭━╯┃  \n" +
                "╱╱╱╱╱╱╱╱╱╱╱╱╱╱╱╱╱╱╱╱╱╱╱╱╱╱╱╱╱╱╱╱╱╱╱╱╱╱╱╱╱╰━━╯╱╱╱╱╰━━╯",questionHungary);
       // areas[3] = new Area("");
       // areas[4] = new Area("Room 4");
     //   areas[5] = new Area("Room 5");
      //  areas[6] = new Area("Room 6");
     //   areas[7] = new Area("");


        return areas;
    }
}
