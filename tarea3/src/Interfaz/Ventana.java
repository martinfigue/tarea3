package Interfaz;

import javax.swing.*;
import java.awt.*;

public class Ventana extends JFrame {
    
    Ventana(){
        super();


        PanelExpendedor pizq = new PanelExpendedor();
        PanelComprador pder = new PanelComprador();
        this.add(pizq);
        this.add(pder);


        pizq.setLayout(new GridLayout(2,3));
        pizq.setBounds(50,20,400,300);

        pder.setLayout(new GridLayout(2,2));
        pder.setBounds(500,100,300,230);


        pizq.add(new JButton(new ImageIcon("coca.jpeg")));
        pizq.add(new JButton(new ImageIcon("sprite.jpg")));
        pizq.add(new JButton(new ImageIcon("fanta.jpeg")));
        pizq.add(new JButton(new ImageIcon("snickers.jpeg")));
        pizq.add(new JButton(new ImageIcon("super 8.png")));

        pder.add(new JButton("100"));
        pder.add(new JButton("500"));
        pder.add(new JButton("1000"));
        pder.add(new JButton("1500"));



        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(850,550);
        this.setVisible(true);

    }
}
