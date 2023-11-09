package Interfaz;
import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class PanelProducto extends JPanel {
    int estaLleno = 0;
    public PanelProducto(){
        this.setBackground(Color.green);
        this.setPreferredSize(new Dimension(200,300));
        this.addMouseListener(new Listenerclick());
    }

    private class Listenerclick implements MouseListener {
        public void mouseClicked(MouseEvent e){
            sacarProducto();
            System.out.println("chao");
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
        }
    }
}
