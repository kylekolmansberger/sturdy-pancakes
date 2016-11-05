
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
        clickToContinue = new JButton("Click to Continue");
        clickToContinue.setOpaque(false);
        clickToContinue.setContentAreaFilled(false);
        clickToContinue.setBorderPainted(false);
        clickToContinue.setFocusable(false);
        
        pancake = new PancakeFlop(new ImageIcon("images/aPancake.png"));
        pancake2 = new PancakeFlop(new ImageIcon("images/pancake.png"));
        pancake3 = new PancakeFlop(new ImageIcon("images/thePancake.png"));
        
        pancake2.setXVel(3);
        pancake2.setYVel(4);
        pancake3.setXVel(4);
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
        
        this.addComponentListener(new ComponentListener() {

    		public void componentResized(ComponentEvent e) {
    			pancake.setXRes(e.getComponent().getWidth()-100);
                        pancake.setYRes(e.getComponent().getHeight()-100);
                        pancake2.setXRes(e.getComponent().getWidth()-100);
                        pancake2.setYRes(e.getComponent().getHeight()-100);
                        pancake3.setXRes(e.getComponent().getWidth()-100);
                        pancake3.setYRes(e.getComponent().getHeight()-100);
    		}
    		public void componentHidden(ComponentEvent e) {}

    		public void componentMoved(ComponentEvent e) {}

    		public void componentShown(ComponentEvent e) {}
    	});
    }
    
   
    public JButton getClickToContinue() {
        return clickToContinue;
    }
    public PancakeFlop getPancake(){
        return pancake;
    }
    public PancakeFlop getPancake2(){
        return pancake2;
    }
    public PancakeFlop getPancake3(){
        return pancake3;
    }
}
