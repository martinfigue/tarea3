package Interfaz;

import Código.Producto;

import javax.swing.*;
import java.awt.*;

public class PanelElegirProducto extends JPanel {
    private JButton cocacola;
    private JButton sprite;
    private JButton fanta;
    private JButton snickers;
    private JButton super8;

    public PanelElegirProducto(){
        cocacola = new JButton(new ImageIcon("coca.jpeg"));
        sprite = new JButton(new ImageIcon("sprite.jpg"));
        fanta = new JButton(new ImageIcon("fanta.jpeg"));
        snickers = new JButton(new ImageIcon("snickers.jpeg"));
        super8 = new JButton(new ImageIcon("super 8.png"));

        this.setLayout(new GridLayout(3,3));

        this.add(cocacola);
        this.add(sprite);
        this.add(fanta);
        this.add(snickers);
        this.add(super8);

    }
    public int ProductoSeleccionado(){
        if(cocacola.isSelected()){
            return Producto.getSerie();
        }
        else if(sprite.isSelected()){
            return Producto.getSerie();
        }
        else if(fanta.isSelected()){
            return Producto.getSerie();
        }
        else if(snickers.isSelected()){
            return Producto.getSerie();
        }
        else if(super8.isSelected()){
            return Producto.getSerie();
        }
        else{
        return -1;
    }
    }
}
