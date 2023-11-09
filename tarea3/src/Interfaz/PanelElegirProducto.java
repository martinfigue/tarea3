package Interfaz;

import javax.swing.*;
import java.awt.*;
import java.io.File;

public class PanelElegirProducto extends JPanel {
    private JRadioButton cocacola;
    private JRadioButton sprite;
    private JRadioButton fanta;
    private JRadioButton snickers;
    private JRadioButton super8;

    ButtonGroup grupo;

    public PanelElegirProducto(){
        ImageIcon icon1 = createImageIcon("tarea3/coca.jpeg");
        ImageIcon icon2 = createImageIcon("tarea3/sprite.jpg");
        ImageIcon icon3 = createImageIcon("tarea3/fanta.jpeg");
        ImageIcon icon4 = createImageIcon("tarea3/snickers.jpeg");
        ImageIcon icon5 = createImageIcon("tarea3/super 8.png");

        grupo = new ButtonGroup();

        cocacola = new JRadioButton("", icon1);
        sprite = new JRadioButton("", icon2);
        fanta = new JRadioButton("", icon3);
        snickers = new JRadioButton("", icon4);
        super8 = new JRadioButton("",icon5);

        this.setLayout(new GridLayout(3, 3));

        grupo.add(cocacola);
        grupo.add(sprite);
        grupo.add(fanta);
        grupo.add(snickers);
        grupo.add(super8);

        this.add(cocacola);
        this.add(sprite);
        this.add(fanta);
        this.add(snickers);
        this.add(super8);

    }
    protected static ImageIcon createImageIcon(String path) {
        try {
            File imgFile = new File(path);
            if (imgFile.exists()) {
                ImageIcon imageIcon = new ImageIcon(path);
                Image image = imageIcon.getImage();
                Image scaledImage = image.getScaledInstance(150, 150, Image.SCALE_SMOOTH);
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
}
