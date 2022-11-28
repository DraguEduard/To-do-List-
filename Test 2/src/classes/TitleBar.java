package classes;

import java.awt.Color;
import javax.swing.*;
import java.awt.*;
import java.awt.Dimension;
import java.awt.Font;


public class TitleBar extends JPanel {

    //Constructor
    TitleBar(){
        this.setPreferredSize(new Dimension(400,80));


        JLabel titleText = new JLabel("Lista");
        titleText.setPreferredSize(new Dimension(200,80));
        titleText.setFont(new Font("Sans-serif",Font.BOLD, 20));
        titleText.setHorizontalAlignment(JLabel.CENTER);

        this.add(titleText);

    }
}
