import java.awt.*;
import javax.swing.*;
package Código;

public class Ventana extends JFrame {
    public ventana(){
        this.setLayout(new BorderLayout());
        this.setTitle("Expendedor");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(1000,800);
        this.setVisible(true);
    }
}
