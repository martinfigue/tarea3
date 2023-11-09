package Interfaz;
import Código.Deposito;
import Código.Expendedor;

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
    PanelProducto pp;
    public PanelExpendedor(int x, int y){
        super();
        this.setPreferredSize(new Dimension((int) (this.getWidth()*0.8), (int) (0.8*this.getHeight())));
        SpringLayout springLayout = new SpringLayout();
        this.setPreferredSize(new Dimension(425,550));
        d = new Depositos(this.getPreferredSize());
        pp = new PanelProducto();
        this.setLayout(springLayout);
        this.add(d);
        this.setBackground(Color.red);
        this.add(pp);
        springLayout.putConstraint(SpringLayout.SOUTH,pp,-10,SpringLayout.SOUTH,this);
        springLayout.putConstraint(SpringLayout.EAST,pp,-10,SpringLayout.EAST,this);
        d.addMouseListener(new Listenerclick());
        //this.setMaximumSize(new Dimension(30,70));
    }

    public void setSizePanel(){
        d.revalidate();
        d.repaint();
        this.revalidate();
        this.repaint();
        d.setPreferredSize(new Dimension((int) (this.getWidth()*0.8), (int) (0.8*this.getHeight())));
        d.fill();
        d.revalidate();
        d.repaint();
        this.revalidate();
        this.repaint();
        System.out.println(this.getWidth());
        System.out.println(this.getHeight());
    }

    public void comprarProducto(String producto){
        pp.removeAll();
        if(pp.estaLleno == 0) {
            if (producto == "fanta") {
                pp.add(new JLabel((new ImageIcon("fanta.jpeg"))));
                pp.estaLleno = 1;
            } else if (producto == "sprite") {
                pp.add(new JLabel((new ImageIcon("sprite.jpg"))));
                pp.estaLleno = 1;
            } else if (producto == "cocacola") {
                pp.add(new JLabel((new ImageIcon("coca.jpeg"))));
                pp.estaLleno = 1;
            } else if (producto == "snickers") {
                pp.add(new JLabel((new ImageIcon("snickers.jpeg"))));
                pp.estaLleno = 1;
            } else if (producto == "super8") {
                pp.add(new JLabel((new ImageIcon("super 8.png"))));
                pp.estaLleno = 1;
            }
        }
    }



    public void paint(Graphics g){
        super.paint(g);
    }


   /* public void mouseClicked(MouseEvent e) {
    }
    public void mousePressed(MouseEvent e) {
        System.out.println("press");
    }
    public void mouseReleased(MouseEvent e) {
    }
    public void mouseEntered(MouseEvent e) {
    }
    public void mouseExited(MouseEvent e) {

    }*/


    private class Listenerclick implements MouseListener {
        public void mouseClicked(MouseEvent e){
            d.refill();
            d.fill();
            d.revalidate();
            System.out.println("hola");
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
