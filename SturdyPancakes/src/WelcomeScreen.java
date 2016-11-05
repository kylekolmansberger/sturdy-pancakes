
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author fyl5079
 */
public class WelcomeScreen extends JPanel{
    private JButton clickToContinue;
    private PancakeFlop pancake,pancake2,pancake3;
    public WelcomeScreen(){
        super();
        setVisible(true);
        setBackground(Color.white);
        setLayout(new BorderLayout());
        clickToContinue = new JButton("Welcome Screen, Click to Continue");
        clickToContinue.setOpaque(false);
        clickToContinue.setContentAreaFilled(false);
        clickToContinue.setBorderPainted(false);
        clickToContinue.setFocusable(false);
        
        pancake = new PancakeFlop(new ImageIcon("images/pancake.png"));
        pancake2 = new PancakeFlop(new ImageIcon("images/Original_ Buttermilk_Pancakes.png"));
        pancake3 = new PancakeFlop(new ImageIcon("images/pancake.jpg"));
        
        pancake2.setXVel(4);
        pancake3.setYVel(3);
        
        pancake.setMyBounds(pancake.getMyBounds());
        pancake2.setMyBounds(pancake2.getMyBounds());
        pancake3.setMyBounds(pancake3.getMyBounds());
        
        add(pancake);
        add(pancake2);
        add(pancake3);
        add(clickToContinue, BorderLayout.CENTER);
        
        pancake.getTim().start();
        pancake2.getTim().start();
        pancake3.getTim().start();
    }
    
   
    public JButton getClickToContinue() {
        return clickToContinue;
    }
}
