package Interfaz;
import java.awt.Color;
import java.awt.*;
import javax.swing.JPanel;

public class MiPanel extends JPanel{
    public MiPanel(){
        this.setBackground(Color.CYAN);
    }
    public void paint(Graphics g){
        super.paint(g);
        g.setColor(Color.red);
        g.fillRect(40,40,50,30);
    }
}
