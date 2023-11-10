package Interfaz;

import Código.NoHayProductoException;
import Código.Producto;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Aca se crean los 5 botones de los productos del expendedor, teniendo seleccion unica
 */


public class PanelElegirProducto extends JPanel {
    private JToggleButton cocacola;
    private JToggleButton sprite;
    private JToggleButton fanta;
    private JToggleButton snickers;
    private JToggleButton super8;
    private ButtonGroup grupo;
    private JButton comprar;
    private PanelExpendedor pe;

    /**
     * Se crean los botones juntos a sus imagenes, asi como tambien el boton comprar
     * @param pe representa el panel expendedor
     */
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



    }

    /**
     * Aca se selecciona el producto a comprar
     * @return el producto que se quiere comprar
     */
    public String ProductoSeleccionado(){
        System.out.println(cocacola.isSelected());
        if(cocacola.isSelected()){
            return "cocacola";
        }
        else if(sprite.isSelected()){
            return "sprite";
        }
        else if(fanta.isSelected()){
            return "fanta";
        }
        else if(snickers.isSelected()){
            return "snickers";
        }
        else if(super8.isSelected()){
            return "super8";
        }
        else{
            return "";
        }
    }


}
