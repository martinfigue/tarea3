package Código;
import java.awt.*;
import javax.swing.*;

public class Ventana extends JFrame {
    public Ventana(){
        this.setLayout(new BorderLayout());
        this.setTitle("Expendedor");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(1000,800);
        this.setVisible(true);
    }
}
