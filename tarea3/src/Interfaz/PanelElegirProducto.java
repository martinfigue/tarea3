package Interfaz;

import Código.Producto;

import javax.swing.*;
import java.awt.*;

public class PanelElegirProducto extends JPanel {
    private JToggleButton cocacola;
    private JToggleButton sprite;
    private JToggleButton fanta;
    private JToggleButton snickers;
    private JToggleButton super8;
    private ButtonGroup grupo;

    public PanelElegirProducto(){

        grupo = new ButtonGroup();

        cocacola = new JToggleButton(new ImageIcon("coca.jpeg"));
        sprite = new JToggleButton(new ImageIcon("sprite.jpg"));
        fanta = new JToggleButton(new ImageIcon("fanta.jpeg"));
        snickers = new JToggleButton(new ImageIcon("snickers.jpeg"));
        super8 = new JToggleButton(new ImageIcon("super 8.png"));

        this.setLayout(new GridLayout(3,3));

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
