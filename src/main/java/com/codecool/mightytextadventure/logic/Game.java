package com.codecool.mightytextadventure.logic;

import com.codecool.mightytextadventure.data.Area;
import com.codecool.mightytextadventure.data.Player;
import com.codecool.mightytextadventure.data.Route;
import com.codecool.mightytextadventure.ui.Display;
import com.codecool.mightytextadventure.ui.InputInteger;
import com.codecool.mightytextadventure.ui.InputString;

public class Game {
    private final Area[] areas;
    private final InputString inputString;

    private final InputInteger inputInteger;
    private final Display display;

    public String playersName;

    public Game(Area[] areas, InputString inputString, InputInteger inputInteger, Display display) {
        this.areas = areas;
        this.inputString = inputString;
        this.inputInteger = inputInteger;
        this.display = display;

    }

    public void run() {
        Player player = new Player(2);

        boolean isRunning = true;
        int rounds = 1;
        int answerCounter = 0;
        boolean onTheWay = false;
        int routeIndex = 0;

        while (isRunning) {

            printWelcomeToGame();
            System.out.println("Please enter your name:");
            player.setName(inputString.getInputFromUser());
            System.out.println(player.getName() + " choose where u like to travel:");



            for (int i = 0;i < areas.length; i++) {
                if(i==0){
                    System.out.println();
                    continue;
                }
                System.out.println("          " + (i) + ":  " + areas[i].description() +"      ");
            }

            Route route = getChosenRoute(inputInteger.getInputFromUser()-1);

            for(int i = 0;i< route.countries.length;i++){

                areaChallenge(route.countries[i]);
            }

        }
    }

    private boolean areaChallenge(int areaIndex){

        boolean answerIsCorrect = false;
        int wrongAnswers = 0;
        while(!answerIsCorrect) {

            System.out.println(areas[areaIndex].getWelcomeTo());
            System.out.println(areas[areaIndex].getQuestion());
            System.out.println(areas[areaIndex].getAnswersOptions());
            answerIsCorrect =  areas[areaIndex].answerIsCorrect(inputString.getInputFromUser());
            wrongAnswers++;
            if(wrongAnswers == 2){
                answerIsCorrect = false;
            }

        }

        return answerIsCorrect;
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

    public Route getChosenRoute(int routeIndex){
        Route[] allRoutes = new Route[5];

        Route routeToHungary = new Route(new int []{0,1});
        Route routeToSerbia = new Route(new int[]{0,1,2});
        Route routeToSwiss = new Route(new int [] {0,3});
        Route routeToFrance = new Route(new int [] {0,3,4});
        Route routeToSpain = new Route(new int[]{0,3,4,5});

        allRoutes[0] = routeToHungary;
        allRoutes[1] = routeToSerbia;
        allRoutes[2] = routeToSwiss;
        allRoutes[3] = routeToFrance;
        allRoutes[4] = routeToSpain;

        return allRoutes[routeIndex];
    }

}
