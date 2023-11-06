package Interfaz;
import java.awt.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseListener;

public class PanelComprador extends JPanel {
    PanelMonedas m;
    public PanelComprador() {
        m = new PanelMonedas();
        JButton comprar = new JButton("comprar");

        comprar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        this.add(m);
        this.add(comprar);

        setVisible(true);
    }
}