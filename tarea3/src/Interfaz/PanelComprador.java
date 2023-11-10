package Interfaz;
import Código.*;

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
        JButton comprar = new JButton("Comprar");

        this.setLayout(new GridLayout(3, 1));
        this.setBackground(Color.green);
        this.add(p);
        //this.add(new JPanel());
        this.add(m);
        comprar.addActionListener(new comprarListener());
        this.add(comprar);
        setVisible(true);
    }


    public void comprarProducto(String tipo,Moneda m) throws PagoIncorrectoException, PagoInsuficienteException {
        if(m==null){
            throw new PagoIncorrectoException("Inserte una moneda");
        }else{
            int valor=m.getValor();

            if(tipo=="cocacola"){
                if(valor>=Precios.PRECIOCOCA.getPrecio()) {
                    pe.comprarProducto("cocacola");
                }else{
                    throw new PagoInsuficienteException("No insertó suficiente dinero");
                }
            }
            else if(tipo=="sprite"){
                pe.comprarProducto("sprite");

            }
            else if(tipo=="fanta"){
                pe.comprarProducto("fanta");
            }
            else if(tipo=="snickers"){
                pe.comprarProducto("snickers");
            }
            else if(tipo=="super8"){
                pe.comprarProducto("super8");
            }
        }
    }

    private class comprarListener implements ActionListener {
        public void actionPerformed(ActionEvent ae){
            String tipoproducto=p.ProductoSeleccionado();
            Moneda moneda=m.monedaSeleccionada();
            try{
                comprarProducto(tipoproducto,moneda);
            }catch (PagoInsuficienteException ex){
                ex.printStackTrace();
            }
            catch (PagoIncorrectoException ex){
                ex.printStackTrace();
            }

        }
    }
}