package Interfaz;

import javax.swing.*;
import java.awt.*;

public class PanelMonedas extends JPanel {
    private JButton moneda100;
    private JButton moneda500;
    private JButton moneda1000;
    private JButton moneda1500;

    public PanelMonedas(){
        moneda100 = new JButton(new ImageIcon("moneda100"));
        moneda500 = new JButton(new ImageIcon("moneda500"));
        moneda1000 = new JButton(new ImageIcon("moneda1000"));
        moneda1500 = new JButton(new ImageIcon("moneda 1500"));
        this.setLayout(new GridLayout(2,2));
        this.add(moneda100);
        this.add(moneda500);
        this.add(moneda1000);
        this.add(moneda1500);
    }

}
