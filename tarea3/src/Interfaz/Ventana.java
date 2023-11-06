package Interfaz;

import javax.swing.*;
import java.awt.*;

public class Ventana extends JFrame {
    
    Ventana(){
        super("Maquina Expendedora");

        PanelComprador pder = new PanelComprador();
        PanelExpendedor pizq = new PanelExpendedor(50, 100);


        this.add(pder);
        this.add(pizq);


        pder.setBounds(500,100,300,230);
        pder.setLayout(new GridLayout(2,2));


        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(850,550);
        this.setVisible(true);


    }
}
