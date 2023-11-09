package Interfaz;
import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class PanelProducto extends JPanel {

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
        this.removeAll();
        this.repaint();
        this.revalidate();
    }
}
