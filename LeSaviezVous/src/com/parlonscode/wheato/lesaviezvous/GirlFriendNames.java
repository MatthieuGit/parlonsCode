package com.parlonscode.wheato.lesaviezvous;

import java.util.Random;

/**
 * Created by matthieu.bailly on 06/04/2018.
 */
public class GirlFriendNames {

    public final static String[] name = {
            "Natacha.",
            "Marie.",
            "Camille.",
            "Audrey",
            "Celine",
            "Cecile",
            "Elodie.",
            "Jessica",
            "Lucile",
            "Judith"
    };

    public static String getRandomName() {
        Random randomGenerator = new Random();
        int randomNumber = randomGenerator.nextInt(name.length);
        return name[randomNumber];
    }



}
