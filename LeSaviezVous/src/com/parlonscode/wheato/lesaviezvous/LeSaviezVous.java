package com.parlonscode.wheato.lesaviezvous;

import javax.swing.*;

/**
 * Created by matthieu.bailly on 05/04/2018.
 */
public class LeSaviezVous {

    public static void main(String[] args) {
        Frame frame = new Frame("Le saviez-vous ?");
        frame.setSize(600,600);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

    }
}
