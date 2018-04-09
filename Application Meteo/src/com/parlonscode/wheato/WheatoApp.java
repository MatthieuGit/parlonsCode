package com.parlonscode.wheato;

import javax.swing.*;
import java.awt.*;

/**
 * Created by matthieu.bailly on 09/04/2018.
 */
public class WheatoApp {

    public static void main(String[] args) {

        EventQueue.invokeLater(()-> {
            MainFrame mainFrame = new MainFrame("Wheato");
            mainFrame.setResizable(false);
            mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            mainFrame.pack();
            mainFrame.setLocationRelativeTo(null);
            mainFrame.setVisible(true);
        });

    }
}
