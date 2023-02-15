package com.codecool.mightytextadventure.logic;

import com.codecool.mightytextadventure.data.Area;
import com.codecool.mightytextadventure.data.Player;
import com.codecool.mightytextadventure.ui.Display;
import com.codecool.mightytextadventure.ui.Input;

public class Game {
    private final Area[] areas;
    private final Input input;
    private final Display display;

    public String playersName;

    public Game(Area[] areas, Input input, Display display) {
        this.areas = areas;
        this.input = input;
        this.display = display;
    }

    public void run() {
        Player player = new Player(2);
        boolean isRunning = true;
        int rounds = 1;
        int answerCounter = 0;
        boolean answerIsCorrect = false;

        while (isRunning) {
          //  isRunning = step();
            printWelcomeToGame();
            System.out.println("Welcome To Tripico Adventure Game!\nPlease enter your name:");
            player.setName(input.getInputFromUser());

            if(rounds == 1){

                while(!answerIsCorrect) {
                    System.out.println(areas[0].description());
                    System.out.println(areas[0].getWelcomeTo());
                    System.out.println(areas[0].getQuestion());
                    System.out.println(areas[0].getAnswersOptions());
                    answerIsCorrect =  areas[0].answerIsCorrect(input.getInputFromUser());
                }
            }
                answerIsCorrect = false;

                while(!answerIsCorrect) {
                    System.out.println(areas[1].description());
                    System.out.println(areas[1].getWelcomeTo());
                    System.out.println(areas[1].getQuestion());
                    System.out.println(areas[1].getAnswersOptions());
                    answerIsCorrect = areas[1].answerIsCorrect(input.getInputFromUser());
                    System.out.println(answerIsCorrect);
                    rounds++;
}
        }
    }

    private void areaChallenge(int areaIndex){
        System.out.println(areas[areaIndex].description());
        System.out.println(areas[areaIndex].getWelcomeTo());
        System.out.println(areas[areaIndex].getQuestion());
        System.out.println(areas[areaIndex].getAnswersOptions());
    }

    private boolean step() {
        display.printMessage("Steps");
        return true;
    }


    private void printWelcomeToGame(){
        System.out.println("\n" +
                "░█████╗░██████╗░██╗░░░██╗███████╗███╗░░██╗████████╗██╗░░░██╗██████╗░███████╗  ████████╗██╗░░██╗██████╗░░█████╗░░██╗░░░░░░░██╗\n" +
                "██╔══██╗██╔══██╗██║░░░██║██╔════╝████╗░██║╚══██╔══╝██║░░░██║██╔══██╗██╔════╝  ╚══██╔══╝██║░░██║██╔══██╗██╔══██╗░██║░░██╗░░██║\n" +
                "███████║██║░░██║╚██╗░██╔╝█████╗░░██╔██╗██║░░░██║░░░██║░░░██║██████╔╝█████╗░░  ░░░██║░░░███████║██████╔╝██║░░██║░╚██╗████╗██╔╝\n" +
                "██╔══██║██║░░██║░╚████╔╝░██╔══╝░░██║╚████║░░░██║░░░██║░░░██║██╔══██╗██╔══╝░░  ░░░██║░░░██╔══██║██╔══██╗██║░░██║░░████╔═████║░\n" +
                "██║░░██║██████╔╝░░╚██╔╝░░███████╗██║░╚███║░░░██║░░░╚██████╔╝██║░░██║███████╗  ░░░██║░░░██║░░██║██║░░██║╚█████╔╝░░╚██╔╝░╚██╔╝░\n" +
                "╚═╝░░╚═╝╚═════╝░░░░╚═╝░░░╚══════╝╚═╝░░╚══╝░░░╚═╝░░░░╚═════╝░╚═╝░░╚═╝╚══════╝  ░░░╚═╝░░░╚═╝░░╚═╝╚═╝░░╚═╝░╚════╝░░░░╚═╝░░░╚═╝░░\n" +
                "\n" +
                "                                      ███████╗██╗░░░██╗██████╗░░█████╗░██████╗░███████╗\n" +
                "                                      ██╔════╝██║░░░██║██╔══██╗██╔══██╗██╔══██╗██╔════╝\n" +
                "                                      █████╗░░██║░░░██║██████╔╝██║░░██║██████╔╝█████╗░░\n" +
                "                                      ██╔══╝░░██║░░░██║██╔══██╗██║░░██║██╔═══╝░██╔══╝░░\n" +
                "                                      ███████╗╚██████╔╝██║░░██║╚█████╔╝██║░░░░░███████╗\n" +
                "                                      ╚══════╝░╚═════╝░╚═╝░░╚═╝░╚════╝░╚═╝░░░░░╚══════╝");
    }

}
