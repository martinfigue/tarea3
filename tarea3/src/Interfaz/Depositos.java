package Interfaz;

import Código.*;

import javax.swing.*;
import java.awt.*;

public class Depositos extends JPanel {
    private Deposito<CocaCola> dCoca;
    private Deposito<Sprite> dSprite;
    private Deposito<Fanta> dFanta;
    private Deposito<Snickers> dSnickers;
    private Deposito<Super8> dSuper8;

    public Depositos(){
        dCoca = new Deposito<CocaCola>();
        dSprite = new Deposito<Sprite>();
        dFanta = new Deposito<Fanta>();
        dSnickers = new Deposito<Snickers>();
        dSuper8 = new Deposito<Super8>();

        for(int i = 0 ; i<4; i++){
            dCoca.addElemento(new CocaCola(i));
            dSprite.addElemento(new Sprite(i));
            dFanta.addElemento(new Fanta(i));
            dSnickers.addElemento(new Snickers(i));
            dSuper8.addElemento(new Super8(i));
        }
        SpringLayout springLayout = new SpringLayout();
        this.setLayout(springLayout);
        this.setBackground(Color.BLUE);
        this.setPreferredSize(new Dimension(10,10));

    }


}
