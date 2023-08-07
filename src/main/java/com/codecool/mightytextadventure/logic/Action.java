package com.codecool.mightytextadventure.logic;

import com.codecool.mightytextadventure.data.Area;
import com.codecool.mightytextadventure.data.Player;
import com.codecool.mightytextadventure.data.Route;
import com.codecool.mightytextadventure.ui.InputInteger;
import com.codecool.mightytextadventure.ui.InputString;

public class Action {
    private final Area[] areas;
    private final InputString inputString;
    private final InputInteger inputInteger;
    private Route route;
    private boolean isRunning = true;

    boolean areaChallengeCompleted = false;

    public Action(InputInteger inputInteger, InputString inputString, Area[] areas, Route route) {
        this.inputInteger = inputInteger;
        this.inputString = inputString;
        this.areas = areas;
        this.route = route;


    }

    public boolean travelling(Player player) {
        for (int i = 0; i < route.countries.length; i++) {
            areaChallengeCompleted = areaChallenge(route.countries[i], player);
            if (!areaChallengeCompleted) {
                printGameOver();
                System.out.println("Do you like to play again?");
                isRunning = playAgain(inputString.getInputFromUser());
                break;
            }
        }
        return isRunning;
    }

    public boolean arrivedToDestination(Player player) {
        if (areaChallengeCompleted) {
            printWelcomeToHoliday();
            System.out.println("Congratulation you have collected a lot of great things!\n");
            player.printBag();
            System.out.println("Do you like to play again? Then enter yes!");
            isRunning = playAgain(inputString.getInputFromUser());
        }
        return isRunning;

    }

    public void chooseRouteToTravel(Player player) {
        System.out.println(player.getName() + " choose where u like to travel:");
        for (int i = 0; i < areas.length; i++) {
            if (i == 0) {
                System.out.println();
                continue;
            }
            System.out.println("          " + (i) + ":  " + areas[i].description() + "      ");
        }
        route = getChosenRoute(inputInteger.getInputFromUser() - 1);

    }

    public void setPlayerName(Player player) {
        player.cleaningBag();
        printWelcomeToGame();
        System.out.println("Please enter your name:");
        player.setName(inputString.getInputFromUser());
    }

    private boolean areaChallenge(int areaIndex, Player player) {

        boolean areaChallengeComplete;
        int wrongAnswers;

        for (int i = 0; i < areas[areaIndex].getQuestions().length; i++) {
            areaChallengeComplete = false;
            wrongAnswers = 0;

            while (!areaChallengeComplete) {

                System.out.println(areas[areaIndex].getWelcomeTo());
                System.out.println(areas[areaIndex].getQuestion(i));
                System.out.println(areas[areaIndex].getAnswerOptions(i));
                areaChallengeComplete = areas[areaIndex].answerIsCorrect(inputString.getInputFromUser(), i);
                System.out.println("\n");

                if (!areaChallengeComplete) {
                    System.out.println("That's wrong!  : /\n");
                    wrongAnswers++;
                } else {
                    System.out.println("That's right! : )\n");
                }
                if (wrongAnswers == 2) {
                    return false;
                }

            }
        }

        System.out.println("Congratulation you get a reward for the challenge: " + areas[areaIndex].reward);
        player.addItemToBag(areas[areaIndex].reward);


        return true;
    }

    private boolean playAgain(String answer) {
        return answer.equalsIgnoreCase("yes");
    }

    private void printWelcomeToHoliday() {
        System.out.println("""

                ███████╗███╗░░██╗░░░░░██╗░█████╗░██╗░░░██╗  ██╗░░░██╗░█████╗░██╗░░░██╗██████╗░
                ██╔════╝████╗░██║░░░░░██║██╔══██╗╚██╗░██╔╝  ╚██╗░██╔╝██╔══██╗██║░░░██║██╔══██╗
                █████╗░░██╔██╗██║░░░░░██║██║░░██║░╚████╔╝░  ░╚████╔╝░██║░░██║██║░░░██║██████╔╝
                ██╔══╝░░██║╚████║██╗░░██║██║░░██║░░╚██╔╝░░  ░░╚██╔╝░░██║░░██║██║░░░██║██╔══██╗
                ███████╗██║░╚███║╚█████╔╝╚█████╔╝░░░██║░░░  ░░░██║░░░╚█████╔╝╚██████╔╝██║░░██║
                ╚══════╝╚═╝░░╚══╝░╚════╝░░╚════╝░░░░╚═╝░░░  ░░░╚═╝░░░░╚════╝░░╚═════╝░╚═╝░░╚═╝

                            ██╗░░██╗░█████╗░██╗░░░░░██╗██████╗░░█████╗░██╗░░░██╗
                            ██║░░██║██╔══██╗██║░░░░░██║██╔══██╗██╔══██╗╚██╗░██╔╝
                            ███████║██║░░██║██║░░░░░██║██║░░██║███████║░╚████╔╝░
                            ██╔══██║██║░░██║██║░░░░░██║██║░░██║██╔══██║░░╚██╔╝░░
                            ██║░░██║╚█████╔╝███████╗██║██████╔╝██║░░██║░░░██║░░░
                            ╚═╝░░╚═╝░╚════╝░╚══════╝╚═╝╚═════╝░╚═╝░░╚═╝░░░╚═╝░░░

                """);
    }

    private void printGameOver() {

        System.out.println("""

                              ░██████╗░░█████╗░███╗░░░███╗███████╗  ░█████╗░██╗░░░██╗███████╗██████╗░
                              ██╔════╝░██╔══██╗████╗░████║██╔════╝  ██╔══██╗██║░░░██║██╔════╝██╔══██╗
                              ██║░░██╗░███████║██╔████╔██║█████╗░░  ██║░░██║╚██╗░██╔╝█████╗░░██████╔╝
                              ██║░░╚██╗██╔══██║██║╚██╔╝██║██╔══╝░░  ██║░░██║░╚████╔╝░██╔══╝░░██╔══██╗
                              ╚██████╔╝██║░░██║██║░╚═╝░██║███████╗  ╚█████╔╝░░╚██╔╝░░███████╗██║░░██║
                              ░╚═════╝░╚═╝░░╚═╝╚═╝░░░░░╚═╝╚══════╝  ░╚════╝░░░░╚═╝░░░╚══════╝╚═╝░░╚═╝

                """);
    }

    private void printWelcomeToGame() {
        System.out.println("""

                                ░█████╗░██████╗░██╗░░░██╗███████╗███╗░░██╗████████╗██╗░░░██╗██████╗░███████╗
                                ██╔══██╗██╔══██╗██║░░░██║██╔════╝████╗░██║╚══██╔══╝██║░░░██║██╔══██╗██╔════╝
                                ███████║██║░░██║╚██╗░██╔╝█████╗░░██╔██╗██║░░░██║░░░██║░░░██║██████╔╝█████╗░░
                                ██╔══██║██║░░██║░╚████╔╝░██╔══╝░░██║╚████║░░░██║░░░██║░░░██║██╔══██╗██╔══╝░░
                                ██║░░██║██████╔╝░░╚██╔╝░░███████╗██║░╚███║░░░██║░░░╚██████╔╝██║░░██║███████╗
                                ╚═╝░░╚═╝╚═════╝░░░░╚═╝░░░╚══════╝╚═╝░░╚══╝░░░╚═╝░░░░╚═════╝░╚═╝░░╚═╝╚══════╝

                ████████╗██╗░░██╗██████╗░░█████╗░██╗░░░██╗░██████╗░██╗░░██╗  ███████╗██╗░░░██╗██████╗░░█████╗░██████╗░███████╗
                ╚══██╔══╝██║░░██║██╔══██╗██╔══██╗██║░░░██║██╔════╝░██║░░██║  ██╔════╝██║░░░██║██╔══██╗██╔══██╗██╔══██╗██╔════╝
                ░░░██║░░░███████║██████╔╝██║░░██║██║░░░██║██║░░██╗░███████║  █████╗░░██║░░░██║██████╔╝██║░░██║██████╔╝█████╗░░
                ░░░██║░░░██╔══██║██╔══██╗██║░░██║██║░░░██║██║░░╚██╗██╔══██║  ██╔══╝░░██║░░░██║██╔══██╗██║░░██║██╔═══╝░██╔══╝░░
                ░░░██║░░░██║░░██║██║░░██║╚█████╔╝╚██████╔╝╚██████╔╝██║░░██║  ███████╗╚██████╔╝██║░░██║╚█████╔╝██║░░░░░███████╗
                ░░░╚═╝░░░╚═╝░░╚═╝╚═╝░░╚═╝░╚════╝░░╚═════╝░░╚═════╝░╚═╝░░╚═╝  ╚══════╝░╚═════╝░╚═╝░░╚═╝░╚════╝░╚═╝░░░░░╚══════╝

                """);
    }

    public Route getChosenRoute(int routeIndex) {
        Route[] allRoutes = new Route[5];

        Route routeToHungary = new Route(new int[]{0, 1});
        Route routeToSerbia = new Route(new int[]{0, 1, 2});
        Route routeToSwiss = new Route(new int[]{0, 3});
        Route routeToFrance = new Route(new int[]{0, 3, 4});
        Route routeToSpain = new Route(new int[]{0, 3, 4, 5});

        allRoutes[0] = routeToHungary;
        allRoutes[1] = routeToSerbia;
        allRoutes[2] = routeToSwiss;
        allRoutes[3] = routeToFrance;
        allRoutes[4] = routeToSpain;

        return allRoutes[routeIndex];
    }
}
