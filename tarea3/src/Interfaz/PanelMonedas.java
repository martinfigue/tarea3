package Interfaz;

import Código.*;

import javax.swing.*;
import java.awt.*;
import java.io.File;

public class PanelMonedas extends JPanel {
    private JRadioButton moneda100;
    private JRadioButton moneda500;
    private JRadioButton moneda1000;
    private JRadioButton moneda1500;

    ButtonGroup group;

    public PanelMonedas() {

        ImageIcon icon1 = new ImageIcon(new ImageIcon("moneda100.jpg").getImage().getScaledInstance(200,200,Image.SCALE_DEFAULT));
        ImageIcon icon2 = new ImageIcon(new ImageIcon("moneda500.jpg").getImage().getScaledInstance(200,200,Image.SCALE_DEFAULT));
        ImageIcon icon3 = new ImageIcon(new ImageIcon("billete1000.jpg").getImage().getScaledInstance(200,100,Image.SCALE_DEFAULT));
        ImageIcon icon4 = new ImageIcon(new ImageIcon("Moneda1500.jpg").getImage().getScaledInstance(200,200,Image.SCALE_DEFAULT));

        group = new ButtonGroup();

        moneda100 = new JRadioButton("100", icon1);
        moneda500 = new JRadioButton("500", icon2);
        moneda1000 = new JRadioButton("1000", icon3);
        moneda1500 = new JRadioButton("1500", icon4);

        this.setLayout(new GridLayout(2, 2));

        group.add(moneda100);
        group.add(moneda500);
        group.add(moneda1000);
        group.add(moneda1500);

        this.add(moneda100);
        this.add(moneda500);
        this.add(moneda1000);
        this.add(moneda1500);
    }

    public Moneda getSerie() {
        return this.getSerie();
    }

    protected static ImageIcon createImageIcon(String path) {
        try {
            File imgFile = new File(path);
            if (imgFile.exists()) {
                ImageIcon imageIcon = new ImageIcon(path);
                Image image = imageIcon.getImage();
                Image scaledImage = image.getScaledInstance(100, 100, Image.SCALE_SMOOTH);
                return new ImageIcon(scaledImage);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return null;
    }

    private static JRadioButton createRadioButton(String imagePath, String text) {
        JRadioButton radioButton = new JRadioButton(text);
        ImageIcon icon = createImageIcon(imagePath);
        if (icon != null) {
            JLabel imageLabel = new JLabel(icon);
            radioButton.setLayout(new FlowLayout());
            radioButton.add(imageLabel);
        }
        return radioButton;
    }
    public Moneda monedaSeleccionada(){
        if(moneda100.isSelected()){
            return getSerie();
        }
        else if(moneda500.isSelected()){
            return getSerie();
        }
        else if(moneda1000.isSelected()){
            return getSerie();
        }
        else if(moneda1500.isSelected()){
            return getSerie();
        }
        return null;
    }
}