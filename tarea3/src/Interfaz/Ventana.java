package Interfaz;

import javax.swing.*;
import java.awt.*;

public class Ventana extends JFrame {
    
    Ventana(){
        super();
        this.setLayout(new GridLayout(2,3));
        this.add(new JButton(new ImageIcon("coca.jpeg")));
        this.add(new JButton(new ImageIcon("sprite.jpg")));
        this.add(new JButton(new ImageIcon("fanta.jpeg")));
        this.add(new JButton(new ImageIcon("snickers.jpeg")));
        this.add(new JButton(new ImageIcon("super 8.png")));
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(400,300);
        this.setVisible(true);
    }
}
