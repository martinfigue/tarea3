package Interfaz;

import javax.swing.*;
import java.awt.*;

public class Ventana extends JFrame {
    
    Ventana() {
        super("Maquina Expendedora");
        this.setSize(1920,1080);
        this.setLayout(new GridLayout(1, 2));
        PanelExpendedor pizq = new PanelExpendedor(50, 100);
        PanelComprador pder = new PanelComprador(pizq);
        this.add(pizq);
        this.add(pder);

        pder.setBounds(500,100,300,230);

        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);
        pizq.setSizePanel();


    }
}
