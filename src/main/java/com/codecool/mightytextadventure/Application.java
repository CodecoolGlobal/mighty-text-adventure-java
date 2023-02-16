package com.codecool.mightytextadventure;

import com.codecool.mightytextadventure.data.Area;
import com.codecool.mightytextadventure.data.Question;
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
        Question questionAustriaOne = new Question("Who is the current president in Austria?","Hofer","Lugner","Van der Bellen","Van der Bellen");
        Question questionAustriaTwo = new Question("How tall is the DC Tower-1 in Vienna?","250m","230m","200m","250m");
        Question questionSerbiaOne = new Question("What is the most well-know and beloved Serbian food?","Cevapcici","Sarma","Burek","Sarma");
        Question questionSerbiaTwo = new Question("What is the second largest city in Serbia?","Nis","Kragujevac","Novi Sad","Novi Sad");
        Question questionHungaryOne = new Question("What is the one of the most famous dishes from the Hungarian?","Fisherman’s Soup","Goulash","Chicken Paprikash","Goulash");
        Question questionHungaryTwo= new Question("What's the population of Hungary in 2023?","8 million","more than 9 million","more than 10 million","more than 9 million");
        Question questionSwissOne = new Question("Which is the capital of Switzerland?","Zurich","Geneva","Bern","Bern");
        Question questionSwissTwo = new Question("What is the number 1 chocolate in Switzerland?","Toblerone","Milka","Lindt","Lindt");
        Question questionFranceOne = new Question("How tall is the Eiffel Tower?","275m","330m","350m","330m");
        Question questionFranceTwo= new Question("Which product is the most exported by France?","Wine","Aircraft's","Parfumes","Aircraft's");
        Question questionSpainOne = new Question("Spain is the largest producer in the world of?","Wine","Olive oil","Fruits","Olive oil");
        Question questionSpainTwo = new Question("Spain is in which place in the world in terms of the number of tourists?","3","5","2","2");
        Area[] areas =   new Area[6];

          areas[0] = new Area("Austria","\n" +
                "╭╮╭╮╭╮╱╱╭╮╱╱╱╱╱╱╱╱╱╱╱╱╱╭━━━━╮╱╱╭━━━╮╱╱╱╱╱╭╮╱╱╱╱╱╱╱╱╱╱╭━━╮╱╱╱╱╱╱╱╭╮\n" +
                "┃┃┃┃┃┃╱╱┃┃╱╱╱╱╱╱╱╱╱╱╱╱╱┃╭╮╭╮┃╱╱┃╭━╮┃╱╱╱╱╭╯╰╮╱╱╱╱╱╱╱╱╱┃╭╮┃╱╱╱╱╱╱╱┃┃\n" +
                "┃┃┃┃┃┣━━┫┃╭━━┳━━┳╮╭┳━━╮╰╯┃┃┣┻━╮┃┃╱┃┣╮╭┳━┻╮╭╋━┳┳━━┳━╮╱┃╰╯╰┳━━┳━┳━╯┣━━┳━╮\n" +
                "┃╰╯╰╯┃┃━┫┃┃╭━┫╭╮┃╰╯┃┃━┫╱╱┃┃┃╭╮┃┃╰━╯┃┃┃┃━━┫┃┃╭╋┫╭╮┃╭╮╮┃╭━╮┃╭╮┃╭┫╭╮┃┃━┫╭╯\n" +
                "╰╮╭╮╭┫┃━┫╰┫╰━┫╰╯┃┃┃┃┃━┫╱╱┃┃┃╰╯┃┃╭━╮┃╰╯┣━━┃╰┫┃┃┃╭╮┃┃┃┃┃╰━╯┃╰╯┃┃┃╰╯┃┃━┫┃\n" +
                "╱╰╯╰╯╰━━┻━┻━━┻━━┻┻┻┻━━╯╱╱╰╯╰━━╯╰╯╱╰┻━━┻━━┻━┻╯╰┻╯╰┻╯╰╯╰━━━┻━━┻╯╰━━┻━━┻╯\n\n",questionAustriaOne,questionAustriaTwo,"Cheese-liver-cheese roll");

        areas[1] = new Area("Hungary","\n" +
                "╭╮╭╮╭╮╱╱╭╮╱╱╱╱╱╱╱╱╱╱╱╱╱╭━━━━╮╱╱╭╮╱╭╮////////////////// \n" +
                "┃┃┃┃┃┃╱╱┃┃╱╱╱╱╱╱╱╱╱╱╱╱╱┃╭╮╭╮┃╱╱┃┃╱┃┃////////////////// \n" +
                "┃┃┃┃┃┣━━┫┃╭━━┳━━┳╮╭┳━━╮╰╯┃┃┣┻━╮┃╰━╯┣╮╭┳━╮╭━━┳━━┳━┳╮╱╭╮ \n" +
                "┃╰╯╰╯┃┃━┫┃┃╭━┫╭╮┃╰╯┃┃━┫╱╱┃┃┃╭╮┃┃╭━╮┃┃┃┃╭╮┫╭╮┃╭╮┃╭┫┃╱┃┃ \n" +
                "╰╮╭╮╭┫┃━┫╰┫╰━┫╰╯┃┃┃┃┃━┫╱╱┃┃┃╰╯┃┃┃╱┃┃╰╯┃┃┃┃╰╯┃╭╮┃┃┃╰━╯┃ \n" +
                "╱╰╯╰╯╰━━┻━┻━━┻━━┻┻┻┻━━╯╱╱╰╯╰━━╯╰╯╱╰┻━━┻╯╰┻━╮┣╯╰┻╯╰━╮╭╯ \n" +
                "╱╱╱╱╱╱╱╱╱╱╱╱╱╱╱╱╱╱╱╱╱╱╱╱╱╱╱╱╱╱╱╱╱╱╱╱╱╱╱╱╱╭━╯┃╱╱╱╱╭━╯┃  \n" +
                "╱╱╱╱╱╱╱╱╱╱╱╱╱╱╱╱╱╱╱╱╱╱╱╱╱╱╱╱╱╱╱╱╱╱╱╱╱╱╱╱╱╰━━╯╱╱╱╱╰━━╯\n\n",questionHungaryOne,questionHungaryTwo,"T-shirt");
          areas[2] = new Area("Serbia","\n" +
                  "╭╮╭╮╭╮╱╱╭╮╱╱╱╱╱╱╱╱╱╱╱╱╱╭━━━━╮╱╱╭━━━╮╱╱╱╱╭╮//////\n" +
                  "┃┃┃┃┃┃╱╱┃┃╱╱╱╱╱╱╱╱╱╱╱╱╱┃╭╮╭╮┃╱╱┃╭━╮┃╱╱╱╱┃┃//////\n" +
                  "┃┃┃┃┃┣━━┫┃╭━━┳━━┳╮╭┳━━╮╰╯┃┃┣┻━╮┃╰━━┳━━┳━┫╰━┳┳━━╮\n" +
                  "┃╰╯╰╯┃┃━┫┃┃╭━┫╭╮┃╰╯┃┃━┫╱╱┃┃┃╭╮┃╰━━╮┃┃━┫╭┫╭╮┣┫╭╮┃\n" +
                  "╰╮╭╮╭┫┃━┫╰┫╰━┫╰╯┃┃┃┃┃━┫╱╱┃┃┃╰╯┃┃╰━╯┃┃━┫┃┃╰╯┃┃╭╮┃\n" +
                  "╱╰╯╰╯╰━━┻━┻━━┻━━┻┻┻┻━━╯╱╱╰╯╰━━╯╰━━━┻━━┻╯╰━━┻┻╯╰╯\n\n",questionSerbiaOne,questionSerbiaTwo,"Football");

        areas[3] = new Area("Swiss","\n" +
                "╭╮╭╮╭╮╱╱╭╮╱╱╱╱╱╱╱╱╱╱╱╱╱╱╭╮╱╱╱╱╭━━━╮\n" +
                "┃┃┃┃┃┃╱╱┃┃╱╱╱╱╱╱╱╱╱╱╱╱╱╭╯╰╮╱╱╱┃╭━╮┃\n" +
                "┃┃┃┃┃┣━━┫┃╭━━┳━━┳╮╭┳━━╮╰╮╭╋━━╮┃╰━━┳╮╭╮╭┳┳━━┳━━╮\n" +
                "┃╰╯╰╯┃┃━┫┃┃╭━┫╭╮┃╰╯┃┃━┫╱┃┃┃╭╮┃╰━━╮┃╰╯╰╯┣┫━━┫━━┫\n" +
                "╰╮╭╮╭┫┃━┫╰┫╰━┫╰╯┃┃┃┃┃━┫╱┃╰┫╰╯┃┃╰━╯┣╮╭╮╭┫┣━━┣━━┃\n" +
                "╱╰╯╰╯╰━━┻━┻━━┻━━┻┻┻┻━━╯╱╰━┻━━╯╰━━━╯╰╯╰╯╰┻━━┻━━╯\n\n",questionSwissOne,questionSwissTwo,"A watch from swatch ");
         areas[4] = new Area("France","\n" +
                 "╭╮╭╮╭╮╱╱╭╮╱╱╱╱╱╱╱╱╱╱╱╱╱╱╭╮╱╱╱╱╭━━━╮\n" +
                 "┃┃┃┃┃┃╱╱┃┃╱╱╱╱╱╱╱╱╱╱╱╱╱╭╯╰╮╱╱╱┃╭━━╯\n" +
                 "┃┃┃┃┃┣━━┫┃╭━━┳━━┳╮╭┳━━╮╰╮╭╋━━╮┃╰━━┳━┳━━┳━╮╭━━┳━━╮\n" +
                 "┃╰╯╰╯┃┃━┫┃┃╭━┫╭╮┃╰╯┃┃━┫╱┃┃┃╭╮┃┃╭━━┫╭┫╭╮┃╭╮┫╭━┫┃━┫\n" +
                 "╰╮╭╮╭┫┃━┫╰┫╰━┫╰╯┃┃┃┃┃━┫╱┃╰┫╰╯┃┃┃╱╱┃┃┃╭╮┃┃┃┃╰━┫┃━┫\n" +
                 "╱╰╯╰╯╰━━┻━┻━━┻━━┻┻┻┻━━╯╱╰━┻━━╯╰╯╱╱╰╯╰╯╰┻╯╰┻━━┻━━╯\n\n",questionFranceOne,questionFranceTwo,"Bottle wine");

          areas[5] = new Area("Spain","\n" +
                  "╭╮╭╮╭╮╱╱╭╮╱╱╱╱╱╱╱╱╱╱╱╱╱╱╭╮╱╱╱╱╭━━━╮\n" +
                  "┃┃┃┃┃┃╱╱┃┃╱╱╱╱╱╱╱╱╱╱╱╱╱╭╯╰╮╱╱╱┃╭━╮┃\n" +
                  "┃┃┃┃┃┣━━┫┃╭━━┳━━┳╮╭┳━━╮╰╮╭╋━━╮┃╰━━┳━━┳━━┳┳━╮\n" +
                  "┃╰╯╰╯┃┃━┫┃┃╭━┫╭╮┃╰╯┃┃━┫╱┃┃┃╭╮┃╰━━╮┃╭╮┃╭╮┣┫╭╮╮\n" +
                  "╰╮╭╮╭┫┃━┫╰┫╰━┫╰╯┃┃┃┃┃━┫╱┃╰┫╰╯┃┃╰━╯┃╰╯┃╭╮┃┃┃┃┃\n" +
                  "╱╰╯╰╯╰━━┻━┻━━┻━━┻┻┻┻━━╯╱╰━┻━━╯╰━━━┫╭━┻╯╰┻┻╯╰╯\n" +
                  "╱╱╱╱╱╱╱╱╱╱╱╱╱╱╱╱╱╱╱╱╱╱╱╱╱╱╱╱╱╱╱╱╱╱┃┃\n" +
                  "╱╱╱╱╱╱╱╱╱╱╱╱╱╱╱╱╱╱╱╱╱╱╱╱╱╱╱╱╱╱╱╱╱╱╰╯\n\n",questionSpainOne,questionSpainTwo,"Cap");

        return areas;
    }
}
