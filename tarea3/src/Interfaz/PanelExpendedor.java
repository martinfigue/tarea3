package Interfaz;
import Código.Deposito;
import Código.Expendedor;
import Código.Moneda;
import Código.NoHayProductoException;

import java.awt.Color;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.*;

public class PanelExpendedor extends JPanel {
    Expendedor exp;
    Depositos d;

    public PanelVuelto pv;
    public Deposito<Moneda> monedasusadas;
    PanelProducto pp;
    public PanelExpendedor(int x, int y){
        super();
        this.setPreferredSize(new Dimension((int) (this.getWidth()*0.8), (int) (0.8*this.getHeight())));
        SpringLayout springLayout = new SpringLayout();
        this.setPreferredSize(new Dimension(425,550));
        d = new Depositos(this.getPreferredSize());
        pp = new PanelProducto(this.d);
        pv= new PanelVuelto();
        this.setLayout(springLayout);
        this.add(d);
        this.setBackground(Color.red);
        this.add(pp);
        this.add(pv);
        springLayout.putConstraint(SpringLayout.SOUTH,pp,-10,SpringLayout.SOUTH,this);
        springLayout.putConstraint(SpringLayout.EAST,pp,-10,SpringLayout.EAST,this);
        springLayout.putConstraint(SpringLayout.SOUTH,pv,-10,SpringLayout.SOUTH,this);
        springLayout.putConstraint(SpringLayout.WEST,pv,10,SpringLayout.WEST,this);
        this.revalidate();
        this.repaint();
        d.addMouseListener(new Listenerclick());
        pv.addMouseListener(new Listenervuelto());
        monedasusadas=new Deposito<Moneda>();
    }

    public void setSizePanel(){

        d.setPreferredSize(new Dimension((int) (this.getWidth()*0.7), (int) (0.7*this.getHeight())));
        d.fill();
        d.revalidate();
        d.repaint();
        this.revalidate();
        this.repaint();
    }

    public void comprarProducto(String producto){
        pp.removeAll();
        if(pp.estaLleno == 0) {
            if (producto == "fanta") {
                try {
                    d.getFanta();
                    pp.add(new JLabel((new ImageIcon("fanta.jpeg"))));
                    pp.estaLleno = 1;
                }catch (NoHayProductoException ex){
                    ex.printStackTrace();
                }
                d.fill();
            } else if (producto == "sprite") {
                try {
                    d.getSprite();
                    pp.add(new JLabel((new ImageIcon("sprite.jpg"))));
                    pp.estaLleno = 1;
                } catch(NoHayProductoException ex) {
                    ex.printStackTrace();
                }
                d.fill();
            } else if (producto == "cocacola") {
                try {
                    d.getCocacola();
                    pp.add(new JLabel((new ImageIcon("coca.jpeg"))));
                    pp.estaLleno = 1;
                } catch (NoHayProductoException ex){
                        ex.printStackTrace();
                }
                d.fill();
            } else if (producto == "snickers") {
                try {
                    d.getSnickers();
                    pp.add(new JLabel((new ImageIcon("snickers.jpeg"))));
                    pp.estaLleno = 1;
                } catch (NoHayProductoException ex){
                    ex.printStackTrace();
                }
                d.fill();
            } else if (producto == "super8") {
                try {
                    d.getSuper8();
                    pp.add(new JLabel((new ImageIcon("super 8.png"))));
                    pp.estaLleno = 1;
                } catch (NoHayProductoException ex){
                    ex.printStackTrace();
                }
                d.fill();
            }
        }
        pp.revalidate();
    }



    public void paint(Graphics g){
        super.paint(g);
    }

    private class Listenerclick implements MouseListener {
        public void mouseClicked(MouseEvent e){
            d.refill();
            d.fill();
            d.revalidate();

        }

        public void mousePressed(MouseEvent e) {

        }

        public void mouseReleased(MouseEvent e) {

        }

        public void mouseEntered(MouseEvent e) {

        }

        public void mouseExited(MouseEvent e) {

        }
    }

    private class Listenervuelto implements MouseListener {
        public void mouseClicked(MouseEvent e){
            pv.getVuelto();
            pv.dibujarMonedas();
            pv.revalidate();
            pv.repaint();
        }

        public void mousePressed(MouseEvent e) {

        }

        public void mouseReleased(MouseEvent e) {

        }

        public void mouseEntered(MouseEvent e) {

        }

        public void mouseExited(MouseEvent e) {

        }
    }

}
