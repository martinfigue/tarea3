package Interfaz;
import Código.Expendedor;

import java.awt.Color;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JPanel;

public class PanelExpendedor extends JPanel {
    Expendedor exp;
    public PanelExpendedor(int x, int y){
        super();

    }
    public void paint(Graphics g){
        super.paint(g);
    }
    public void mouseClicked(MouseEvent e) {
    }
    public void mousePressed(MouseEvent e) {
        System.out.println("press");
    }
    public void mouseReleased(MouseEvent e) {
    }
    public void mouseEntered(MouseEvent e) {
    }
    public void mouseExited(MouseEvent e) {

    }
}
