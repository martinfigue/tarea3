package Interfaz;

import Código.Producto;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PanelElegirProducto extends JPanel {
    private JToggleButton cocacola;
    private JToggleButton sprite;
    private JToggleButton fanta;
    private JToggleButton snickers;
    private JToggleButton super8;
    private ButtonGroup grupo;
    private JButton comprar;
    private PanelExpendedor pe;
    public PanelElegirProducto(PanelExpendedor pe){

        this.pe=pe;

        grupo = new ButtonGroup();

        cocacola = new JToggleButton(new ImageIcon("coca.jpeg"));
        sprite = new JToggleButton(new ImageIcon("sprite.jpg"));
        fanta = new JToggleButton(new ImageIcon("fanta.jpeg"));
        snickers = new JToggleButton(new ImageIcon("snickers.jpeg"));
        super8 = new JToggleButton(new ImageIcon("super 8.png"));

        comprar = new JButton("Comprar");

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
        this.add(comprar);
        comprar.addActionListener(new comprarListener());

    }
    public int ProductoSeleccionado(){
        System.out.println(cocacola.isSelected());
        if(cocacola.isSelected()){
            pe.comprarProducto("cocacola");
            return Producto.getSerie();
        }
        else if(sprite.isSelected()){
            pe.comprarProducto("sprite");
            return Producto.getSerie();
        }
        else if(fanta.isSelected()){
            pe.comprarProducto("fanta");
            return Producto.getSerie();
        }
        else if(snickers.isSelected()){
            pe.comprarProducto("snickers");
            return Producto.getSerie();
        }
        else if(super8.isSelected()){
            pe.comprarProducto("super8");
            return Producto.getSerie();
        }
        else{
            return -1;
        }
    }

    private class comprarListener implements ActionListener {
        public void actionPerformed(ActionEvent ae){
            ProductoSeleccionado();
        }
    }
}
