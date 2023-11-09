package Interfaz;
import java.awt.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseListener;

public class PanelComprador extends JPanel {
    PanelMonedas m;
    Depositos d;
    PanelExpendedor pe;
    public PanelComprador(PanelExpendedor panexp) {
        m = new PanelMonedas();
        pe = panexp;
        JButton comprar = new JButton("comprar");

        comprar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        this.setBackground(Color.green);
        this.add(m);
        this.add(comprar);
        comprar.addActionListener(new ComprarListener());
        setVisible(true);
    }
    private class ComprarListener implements ActionListener{
        public void actionPerformed(ActionEvent ae) {
            pe.d.getCocacola();
            pe.comprarProducto("cocacola");
            pe.d.fill();
            pe.d.revalidate();
            pe.repaint();
        }
    }
}