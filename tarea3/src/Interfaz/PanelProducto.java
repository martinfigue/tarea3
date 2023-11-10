package Interfaz;
import Código.CocaCola;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class PanelProducto extends JPanel {
    int estaLleno = 0;
    Depositos d;
    public PanelProducto(Depositos d){
        this.d=d;
        this.setBackground(Color.green);
        this.setPreferredSize(new Dimension(200,300));
        this.addMouseListener(new Listenerclick());
    }

    private class Listenerclick implements MouseListener {
        public void mouseClicked(MouseEvent e){
            sacarProducto();
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

    public void sacarProducto(){
        if(estaLleno == 1) {
            this.removeAll();
            this.repaint();
            this.revalidate();
            estaLleno = 0;

            if(d.cocacolacomprada!=null){
                d.cocacolacomprada=null;
            }
            if(d.spritecomprada!=null){
                d.spritecomprada=null;
            }
            if(d.fantacomprada!=null){
                d.fantacomprada=null;
            }
            if(d.snickerscomprado!=null){
                d.snickerscomprado=null;
            }
            if(d.super8comprado!=null){
                d.super8comprado=null;
            }
        }
    }
}
