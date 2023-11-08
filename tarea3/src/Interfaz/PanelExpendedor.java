package Interfaz;
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
    public PanelExpendedor(int x, int y){
        super();

        this.setPreferredSize(new Dimension(425,550));
        d = new Depositos(this.getPreferredSize());
        this.setLayout(new GridLayout(1,1));
        this.add(d);
        this.setBackground(Color.red);
        d.addMouseListener(new Listenerclick());
        //this.setMaximumSize(new Dimension(30,70));

    }

    public void setSizePanel(){
        //d.setSize(new Dimension((int) (this.getWidth()*0.8), (int) (0.8*this.getHeight())));
        d.fill();
        this.revalidate();
        this.repaint();
        System.out.println(this.getWidth());
        System.out.println(this.getHeight());
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
