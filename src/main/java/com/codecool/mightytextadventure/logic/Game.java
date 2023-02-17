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

    private Route route;
    private boolean isRunning = true;



    public Game(Area[] areas, InputString inputString, InputInteger inputInteger, Display display) {
        this.areas = areas;
        this.inputString = inputString;
        this.inputInteger = inputInteger;
        this.display = display;

    }

    public void run() {
        Player player = new Player();
        Action action = new Action(inputInteger,inputString,areas,route);

        while (isRunning) {

           action.setPlayerName(player);
           action.chooseRouteToTravel(player);
           action.travelling(player);
           action.arrivedToDestionation(player);

        }

    }

}
