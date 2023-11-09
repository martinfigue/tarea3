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
    private  SpringLayout springLayout;
    public Depositos(Dimension size){
        dCoca = new Deposito<CocaCola>();
        dSprite = new Deposito<Sprite>();
        dFanta = new Deposito<Fanta>();
        dSnickers = new Deposito<Snickers>();
        dSuper8 = new Deposito<Super8>();
        this.setPreferredSize(new Dimension((int) size.getHeight(), (int) size.getWidth()));
        for(int i = 0 ; i<4; i++){
            dCoca.addElemento(new CocaCola(i));
            dSprite.addElemento(new Sprite(i));
            dFanta.addElemento(new Fanta(i));
            dSnickers.addElemento(new Snickers(i));
            dSuper8.addElemento(new Super8(i));
        }
        springLayout = new SpringLayout();
        this.setLayout(springLayout);
        this.setBackground(Color.BLUE);
    }

    public void fill(){
        this.removeAll();
        Image cocacola;
        Image sprite;
        Image fanta;
        Image snickers;
        Image super8;
        JLabel coca,coca2,coca3,coca4;
        JLabel sprite1,sprite2,sprite3,sprite4;
        JLabel fanta1,fanta2,fanta3,fanta4;
        JLabel snickers1,snickers2,snickers3,snickers4;
        JLabel super81,super82,super83,super84;

        cocacola=(new ImageIcon("coca.jpeg").getImage().getScaledInstance(this.getWidth()/4,this.getHeight()/5,Image.SCALE_DEFAULT));
        sprite=(new ImageIcon("sprite.jpg").getImage().getScaledInstance(this.getWidth()/4,this.getHeight()/5,Image.SCALE_DEFAULT));
        fanta=(new ImageIcon("fanta.jpeg").getImage().getScaledInstance(this.getWidth()/4,this.getHeight()/5,Image.SCALE_DEFAULT));
        snickers=(new ImageIcon("snickers.jpeg").getImage().getScaledInstance(this.getWidth()/4,this.getHeight()/5,Image.SCALE_DEFAULT));
        super8=(new ImageIcon("super 8.png").getImage().getScaledInstance(this.getWidth()/4,this.getHeight()/5,Image.SCALE_DEFAULT));
        for(int i=0; i<dCoca.getSize(); i++){
            if(i==0) {
                coca = new JLabel(new ImageIcon(cocacola));
                coca.setPreferredSize(new Dimension(this.getWidth()/4,this.getHeight()/5));
                this.add(coca);
                springLayout.putConstraint(SpringLayout.WEST,coca,this.getWidth()*i/4,SpringLayout.WEST,this);
                springLayout.putConstraint(SpringLayout.NORTH,coca,0,SpringLayout.NORTH,this);
            }
            if(i==1){
                coca2 = new JLabel(new ImageIcon(cocacola));
                coca2.setPreferredSize(new Dimension(this.getWidth()/4,this.getHeight()/5));
                this.add(coca2);
                springLayout.putConstraint(SpringLayout.WEST,coca2,this.getWidth()*i/4,SpringLayout.WEST,this);
                springLayout.putConstraint(SpringLayout.NORTH,coca2,0,SpringLayout.NORTH,this);
            }
            if(i==2){
                coca3= new JLabel(new ImageIcon(cocacola));
                coca3.setPreferredSize(new Dimension(this.getWidth()/4,this.getHeight()/5));
                this.add(coca3);
                springLayout.putConstraint(SpringLayout.WEST,coca3,this.getWidth()*i/4,SpringLayout.WEST,this);
                springLayout.putConstraint(SpringLayout.NORTH,coca3,0,SpringLayout.NORTH,this);
            }
            if(i==3){
                coca4 = new JLabel(new ImageIcon(cocacola));
                coca4.setPreferredSize(new Dimension(this.getWidth()/4,this.getHeight()/5));
                this.add(coca4);
                springLayout.putConstraint(SpringLayout.WEST,coca4,this.getWidth()*i/4,SpringLayout.WEST,this);
                springLayout.putConstraint(SpringLayout.NORTH,coca4,0,SpringLayout.NORTH,this);
            }
        }
        for(int i = 0; i < dSprite.getSize(); i++){
            if(i==0){
                sprite1 = new JLabel(new ImageIcon(sprite));
                sprite1.setPreferredSize(new Dimension(this.getWidth()/4,this.getHeight()/5));
                this.add(sprite1);
                springLayout.putConstraint(SpringLayout.WEST,sprite1,this.getWidth()*i/4,SpringLayout.WEST,this);
                springLayout.putConstraint(SpringLayout.NORTH,sprite1,this.getHeight()/5,SpringLayout.NORTH,this);
            }
            if(i==1){
                sprite2 = new JLabel(new ImageIcon(sprite));
                sprite2.setPreferredSize(new Dimension(this.getWidth()/4,this.getHeight()/5));
                this.add(sprite2);
                springLayout.putConstraint(SpringLayout.WEST,sprite2,this.getWidth()*i/4,SpringLayout.WEST,this);
                springLayout.putConstraint(SpringLayout.NORTH,sprite2,this.getHeight()/5,SpringLayout.NORTH,this);
            }
            if(i==2){
                sprite3 = new JLabel(new ImageIcon(sprite));
                sprite3.setPreferredSize(new Dimension(this.getWidth()/4,this.getHeight()/5));
                this.add(sprite3);
                springLayout.putConstraint(SpringLayout.WEST,sprite3,this.getWidth()*i/4,SpringLayout.WEST,this);
                springLayout.putConstraint(SpringLayout.NORTH,sprite3,this.getHeight()/5,SpringLayout.NORTH,this);
            }
            if(i==3){
                sprite4 = new JLabel(new ImageIcon(sprite));
                sprite4.setPreferredSize(new Dimension(this.getWidth()/4,this.getHeight()/5));
                this.add(sprite4);
                springLayout.putConstraint(SpringLayout.WEST,sprite4,this.getWidth()*i/4,SpringLayout.WEST,this);
                springLayout.putConstraint(SpringLayout.NORTH,sprite4,this.getHeight()/5,SpringLayout.NORTH,this);
            }
        }
        for(int i = 0; i < dFanta.getSize(); i++){
            if(i==0){
                fanta1 = new JLabel(new ImageIcon(fanta));
                fanta1.setPreferredSize(new Dimension(this.getWidth()/4,this.getHeight()/5));
                this.add(fanta1);
                springLayout.putConstraint(SpringLayout.WEST,fanta1,this.getWidth()*i/4,SpringLayout.WEST,this);
                springLayout.putConstraint(SpringLayout.NORTH,fanta1,this.getHeight()*2/5,SpringLayout.NORTH,this);
            }
            if(i==1){
                fanta2 = new JLabel(new ImageIcon(fanta));
                fanta2.setPreferredSize(new Dimension(this.getWidth()/4,this.getHeight()/5));
                this.add(fanta2);
                springLayout.putConstraint(SpringLayout.WEST,fanta2,this.getWidth()*i/4,SpringLayout.WEST,this);
                springLayout.putConstraint(SpringLayout.NORTH,fanta2,this.getHeight()*2/5,SpringLayout.NORTH,this);
            }
            if(i==2){
                fanta3 = new JLabel(new ImageIcon(fanta));
                fanta3.setPreferredSize(new Dimension(this.getWidth()/4,this.getHeight()/5));
                this.add(fanta3);
                springLayout.putConstraint(SpringLayout.WEST,fanta3,this.getWidth()*i/4,SpringLayout.WEST,this);
                springLayout.putConstraint(SpringLayout.NORTH,fanta3,this.getHeight()*2/5,SpringLayout.NORTH,this);
            }
            if(i==3){
                fanta4 = new JLabel(new ImageIcon(fanta));
                fanta4.setPreferredSize(new Dimension(this.getWidth()/4,this.getHeight()/5));
                this.add(fanta4);
                springLayout.putConstraint(SpringLayout.WEST,fanta4,this.getWidth()*i/4,SpringLayout.WEST,this);
                springLayout.putConstraint(SpringLayout.NORTH,fanta4,this.getHeight()*2/5,SpringLayout.NORTH,this);
            }
        }
        for(int i=0; i<dSnickers.getSize(); i++){
            if(i==0) {
                snickers1 = new JLabel(new ImageIcon(snickers));
                snickers1.setPreferredSize(new Dimension(this.getWidth()/4,this.getHeight()/5));
                this.add(snickers1);
                springLayout.putConstraint(SpringLayout.WEST,snickers1,this.getWidth()*i/4,SpringLayout.WEST,this);
                springLayout.putConstraint(SpringLayout.NORTH,snickers1,this.getHeight()*3/5,SpringLayout.NORTH,this);
            }
            if(i==1){
                snickers2 = new JLabel(new ImageIcon(snickers));
                snickers2.setPreferredSize(new Dimension(this.getWidth()/4,this.getHeight()/5));
                this.add(snickers2);
                springLayout.putConstraint(SpringLayout.WEST,snickers2,this.getWidth()*i/4,SpringLayout.WEST,this);
                springLayout.putConstraint(SpringLayout.NORTH,snickers2,this.getHeight()*3/5,SpringLayout.NORTH,this);
            }
            if(i==2){
                snickers3= new JLabel(new ImageIcon(snickers));
                snickers3.setPreferredSize(new Dimension(this.getWidth()/4,this.getHeight()/5));
                this.add(snickers3);
                springLayout.putConstraint(SpringLayout.WEST,snickers3,this.getWidth()*i/4,SpringLayout.WEST,this);
                springLayout.putConstraint(SpringLayout.NORTH,snickers3,this.getHeight()*3/5,SpringLayout.NORTH,this);
            }
            if(i==3){
                snickers4 = new JLabel(new ImageIcon(snickers));
                snickers4.setPreferredSize(new Dimension(this.getWidth()/4,this.getHeight()/5));
                this.add(snickers4);
                springLayout.putConstraint(SpringLayout.WEST,snickers4,this.getWidth()*i/4,SpringLayout.WEST,this);
                springLayout.putConstraint(SpringLayout.NORTH,snickers4,this.getHeight()*3/5,SpringLayout.NORTH,this);
            }
        }
        for(int i = 0; i < dSuper8.getSize(); i++){
            if(i==0){
                super81 = new JLabel(new ImageIcon(super8));
                super81.setPreferredSize(new Dimension(this.getWidth()/4,this.getHeight()/5));
                this.add(super81);
                springLayout.putConstraint(SpringLayout.WEST,super81,this.getWidth()*i/4,SpringLayout.WEST,this);
                springLayout.putConstraint(SpringLayout.NORTH,super81,this.getHeight()*4/5,SpringLayout.NORTH,this);
            }
            if(i==1){
                super82 = new JLabel(new ImageIcon(super8));
                super82.setPreferredSize(new Dimension(this.getWidth()/4,this.getHeight()/5));
                this.add(super82);
                springLayout.putConstraint(SpringLayout.WEST,super82,this.getWidth()*i/4,SpringLayout.WEST,this);
                springLayout.putConstraint(SpringLayout.NORTH,super82,this.getHeight()*4/5,SpringLayout.NORTH,this);
            }
            if(i==2){
                super83 = new JLabel(new ImageIcon(super8));
                super83.setPreferredSize(new Dimension(this.getWidth()/4,this.getHeight()/5));
                this.add(super83);
                springLayout.putConstraint(SpringLayout.WEST,super83,this.getWidth()*i/4,SpringLayout.WEST,this);
                springLayout.putConstraint(SpringLayout.NORTH,super83,this.getHeight()*4/5,SpringLayout.NORTH,this);
            }
            if(i==3){
                super84 = new JLabel(new ImageIcon(super8));
                super84.setPreferredSize(new Dimension(this.getWidth()/4,this.getHeight()/5));
                this.add(super84);
                springLayout.putConstraint(SpringLayout.WEST,super84,this.getWidth()*i/4,SpringLayout.WEST,this);
                springLayout.putConstraint(SpringLayout.NORTH,super84,this.getHeight()*4/5,SpringLayout.NORTH,this);
            }
        }
    }
    public void refill(){
        int x = 0;
        while(dCoca.getSize() < 4){
            dCoca.addElemento(new CocaCola(1000+x));
            x++;
        }
    } public void getCocacola() {
        dCoca.getElemento();
    }
}
