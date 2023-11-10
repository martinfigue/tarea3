package Interfaz;
import Código.NoHayProductoException;

import java.awt.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseListener;

public class PanelComprador extends JPanel {
    PanelMonedas m;
    PanelElegirProducto p;
    Depositos d;
    PanelExpendedor pe;
    public PanelComprador(PanelExpendedor panexp) {
        m = new PanelMonedas();
        pe = panexp;
        p = new PanelElegirProducto(pe);


        this.setLayout(new GridLayout(2, 1));
        this.setBackground(Color.green);
        this.add(p);
        //this.add(new JPanel());
        this.add(m);
        setVisible(true);
    }
    private class ComprarListener implements ActionListener{
        public void actionPerformed(ActionEvent ae) {



        }
    }
}