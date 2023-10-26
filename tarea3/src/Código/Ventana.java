package Código;
import java.awt.*;
import javax.swing.*;

public class Ventana extends JFrame {
    public Ventana(){
        this.setLayout(new BorderLayout());

        this.add(new JButton("sur"), BorderLayout.SOUTH);
        this.add(new MiPanel(), BorderLayout.CENTER);
        this.add(new JButton("norte"), BorderLayout.NORTH);
        this.add(new JButton("este"), BorderLayout.EAST);
        this.add(new JButton("oeste"), BorderLayout.WEST);

        this.setTitle("Expendedor");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(400,300);
        this.setVisible(true);
    }
}
