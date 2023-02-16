package com.codecool.mightytextadventure.data;

import java.util.ArrayList;
import java.util.List;

public class Player{

    private String name;

    private List<String> bag = new ArrayList<>();

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

    public void addItemToBag (String item){
        bag.add(item);
    }
    public void printBag(){

        for(int i = 0; i< bag.size()-1 ; i++){
            System.out.println(bag.get(i));
        }
        System.out.println("\n\n");

    }
    public void cleaningBag(){
        bag.clear();
    }





}
