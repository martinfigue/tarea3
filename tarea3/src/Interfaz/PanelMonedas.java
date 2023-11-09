package Interfaz;

import Código.Moneda;

import javax.swing.*;
import java.awt.*;
import java.io.File;

public class PanelMonedas extends JPanel {
    private JRadioButton moneda100;
    private JRadioButton moneda500;
    private JRadioButton moneda1000;
    private JRadioButton moneda1500;

    ButtonGroup grupo;

    public PanelMonedas(){

        ImageIcon icon1 = createImageIcon("tarea3/moneda100.jpg");
        ImageIcon icon2 = createImageIcon("tarea3/moneda500.jpg");
        ImageIcon icon3 = createImageIcon("tarea3/billete1000.jpg");
        ImageIcon icon4 = createImageIcon("tarea3/moneda1500.jpg");

        moneda100 = new JRadioButton("",icon1);
        moneda500 = new JRadioButton("",icon2);
        moneda1000 = new JRadioButton("",icon3);
        moneda1500 = new JRadioButton("",icon4);
        this.setLayout(new GridLayout(2,2));
        this.add(moneda100);
        this.add(moneda500);
        this.add(moneda1000);
        this.add(moneda1500);
        grupo = new ButtonGroup();
        grupo.add(moneda100);
        grupo.add(moneda500);
        grupo.add(moneda1000);
        grupo.add(moneda1500);
    }
    public Moneda getSerie(){
        return this.getSerie();
    }
    protected static ImageIcon createImageIcon(String path) {
        try {
            File imgFile = new File(path);
            if (imgFile.exists()) {
                return new ImageIcon(path);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return null;
    }

}
