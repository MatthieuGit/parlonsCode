package com.parlonscode.wheato.lesaviezvous;

import java.awt.*;
import java.util.Random;

/**
 * Created by matthieu.bailly on 06/04/2018.
 */
public class ColorPalettes {
    public static final String[] colors = {
            "#39add1", // light blue
            "#3079ab", // dark blue
            "#c25975", // mauve
            "#e15258", // red
            "#f9845b", // orange
            "#838cc7", // lavender
            "#7d669e", // purple
            "#53bbb4", // aqua
            "#51b46d", // green
            "#e0ab18", // mustard
            "#637a91", // dark gray
            "#f092b0", // pink
            "#b7c0c7" // light gray
    };

    public static Color getRandomColors() {
        Random randomGenerator = new Random();
        int randomNumber = randomGenerator.nextInt(colors.length);
        return Color.decode(colors[randomNumber]);
    }

}
