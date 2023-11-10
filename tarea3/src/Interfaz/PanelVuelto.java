package Interfaz;

import Código.Deposito;
import Código.Moneda;

import javax.swing.*;
import java.awt.*;

public class PanelVuelto extends JPanel {

    public Deposito<Moneda> vuelto;
    PanelVuelto(){
        vuelto=new Deposito<Moneda>();

        this.setBackground(Color.yellow);
        this.setPreferredSize(new Dimension(500,100));
        this.setLayout(new FlowLayout());
        this.setVisible(true);
    }

    public void dibujarMonedas(){
        int monedas= vuelto.getSize();
        while(monedas>0){
            Moneda m=vuelto.getElemento();
            if(m.getValor()==1000){
                this.add(new JLabel( new ImageIcon(new ImageIcon("billete1000.jpg").getImage().getScaledInstance(100,50,Image.SCALE_DEFAULT))));
            }
            if(m.getValor()==500){
                this.add(new JLabel( new ImageIcon(new ImageIcon("moneda500.jpg").getImage().getScaledInstance(50,50,Image.SCALE_DEFAULT))));
            }
            if(m.getValor()==100){
                this.add(new JLabel( new ImageIcon(new ImageIcon("moneda100.jpg").getImage().getScaledInstance(50,50,Image.SCALE_DEFAULT))));
            }
            vuelto.addElemento(m);
            monedas--;

        }

    }
}
