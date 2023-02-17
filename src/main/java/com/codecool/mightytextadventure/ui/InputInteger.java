package com.codecool.mightytextadventure.ui;

import java.util.Scanner;

public class InputInteger {
    private Scanner scanner = new Scanner(System.in);

    public int getInputFromUser() {
        return scanner.nextInt();
    }
}
