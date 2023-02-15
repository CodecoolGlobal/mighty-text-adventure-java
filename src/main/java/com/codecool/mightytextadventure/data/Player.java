package com.codecool.mightytextadventure.data;

public class Player{

    public Player(int lives){
        this.lives = lives;
    }
    private String name;
    private int lives;

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

    public int getLives(){
        return lives;
    }
    public void looseOneLives(){
        lives--;
    }



}
