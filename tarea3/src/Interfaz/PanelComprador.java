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

    int count_serie=0;
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
            int valor=m.getValor(),vuelto=0;

            if(tipo=="cocacola"){
                if(valor>=Precios.PRECIOCOCA.getPrecio()) {
                    pe.monedasusadas.addElemento(m);
                    pe.comprarProducto("cocacola");
                    vuelto=valor-Precios.PRECIOCOCA.getPrecio();

                }else{
                    throw new PagoInsuficienteException("No insertó suficiente dinero");
                }
            }
            else if(tipo=="sprite"){
                if(valor>=Precios.PRECIOSPRITE.getPrecio()) {
                    pe.monedasusadas.addElemento(m);
                    pe.comprarProducto("sprite");
                    vuelto=valor-Precios.PRECIOSPRITE.getPrecio();
                }else{
                    throw new PagoInsuficienteException("No insertó suficiente dinero");
                }
            }
            else if(tipo=="fanta"){
                if(valor>=Precios.PRECIOFANTA.getPrecio()) {
                    pe.monedasusadas.addElemento(m);
                    pe.comprarProducto("fanta");
                    vuelto=valor-Precios.PRECIOFANTA.getPrecio();
                }else{
                    throw new PagoInsuficienteException("No insertó suficiente dinero");
                }
            }
            else if(tipo=="snickers"){
                if(valor>=Precios.PRECIOSNICKERS.getPrecio()) {
                    pe.monedasusadas.addElemento(m);
                    pe.comprarProducto("snickers");
                    vuelto=valor-Precios.PRECIOSNICKERS.getPrecio();
                }else{
                    throw new PagoInsuficienteException("No insertó suficiente dinero");
                }
            }
            else if(tipo=="super8"){
                if(valor>=Precios.PRECIOSUPER8.getPrecio()) {
                    pe.monedasusadas.addElemento(m);
                    pe.comprarProducto("super8");
                    vuelto=valor-Precios.PRECIOSUPER8.getPrecio();
                }else{
                    throw new PagoInsuficienteException("No insertó suficiente dinero");
                }




            }
            while(pe.pv.vuelto.getSize()>0){
                pe.pv.vuelto.getElemento();
            }
            if(vuelto>0){
                while(vuelto>=1000){
                    pe.pv.vuelto.addElemento(new Moneda1000(1000+count_serie));
                    count_serie++;
                    vuelto=vuelto-1000;
                }

                while(vuelto>=500){
                    pe.pv.vuelto.addElemento(new Moneda500(500+count_serie));
                    count_serie++;
                    vuelto=vuelto-500;
                }

            while(vuelto>=100){
                    System.out.println(vuelto);
                    pe.pv.vuelto.addElemento(new Moneda100(100+count_serie));
                    count_serie++;
                    vuelto=vuelto-100;
                }
            }
        }
    }

    private class comprarListener implements ActionListener {
        public void actionPerformed(ActionEvent ae){
            String tipoproducto=p.ProductoSeleccionado();
            Moneda moneda=m.monedaSeleccionada();
            if(moneda!=null){
                System.out.println("Número de serie de moneda:" + " " + moneda.getSerie());
            }
            try{
                if(pe.pp.estaLleno==0) {
                    comprarProducto(tipoproducto, moneda);
                    pe.pv.dibujarMonedas();
                }

            }catch (PagoInsuficienteException ex){
                ex.printStackTrace();
            }
            catch (PagoIncorrectoException ex){
                ex.printStackTrace();
            }

        }
    }
}