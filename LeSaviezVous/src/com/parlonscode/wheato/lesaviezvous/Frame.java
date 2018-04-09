package com.parlonscode.wheato.lesaviezvous;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by matthieu.bailly on 05/04/2018.
 */
public class Frame extends JFrame {

    private JLabel titleLabel;
    private JLabel factLabel;
    private JButton showFactButton;
    private JPanel contentPane;

    public Frame(String title) {
        super(title);

        Font font = new Font("Comic Sans MS", Font.PLAIN, 19);
        Color cyanColor = Color.decode("#39add1");

        titleLabel = new JLabel("Avec qui je sors ce soir ? :");
        titleLabel.setFont(font);
        titleLabel.setForeground(new Color(255,255,255,128));

        factLabel = new JLabel("Natacha");
        factLabel.setFont(font);
        factLabel.setForeground(Color.WHITE);

        showFactButton = new JButton("montrer la personne avec qui je sors ce soir".toUpperCase());
        showFactButton.setFont(font.deriveFont(Font.BOLD,15));
        showFactButton.setForeground(cyanColor);
        showFactButton.setMargin(new Insets(12,12,12,12));
        showFactButton.setFocusPainted(false);

        contentPane = new JPanel(new BorderLayout());
        Border padding = BorderFactory.createEmptyBorder(25,25,25,25);
        contentPane.setBorder(padding);
        contentPane.setBackground(cyanColor);
        contentPane.add(titleLabel,BorderLayout.NORTH);
        contentPane.add(factLabel,BorderLayout.CENTER);
        contentPane.add(showFactButton,BorderLayout.SOUTH);
        setContentPane(contentPane);

        ImageIcon icon = new ImageIcon(getClass().getResource("/resources/logo64*64.png"));
        setIconImage(icon.getImage());

        showFactButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String fact = GirlFriendNames.getRandomName();
                Color color = ColorPalettes.getRandomColors();
                factLabel.setText(fact);
                showFactButton.setForeground(color);
                contentPane.setBackground(color);
            }
        });
    }
}
