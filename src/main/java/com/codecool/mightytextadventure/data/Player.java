package com.codecool.mightytextadventure.data;

import java.util.ArrayList;
import java.util.List;

public class Player {

    private String name;

    private List<String> bag = new ArrayList<>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addItemToBag(String item) {
        bag.add(item);
    }

    public void printBag() {

        for (String s : bag) {
            System.out.println(s);
        }
        System.out.println("\n\n");

    }

    public void cleaningBag() {
        bag.clear();
    }


}
