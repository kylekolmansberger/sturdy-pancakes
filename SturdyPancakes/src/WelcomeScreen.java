
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
public class WelcomeScreen extends JPanel implements ActionListener{
    private JButton clickToContinue;
    private Timer tm;
    private int x,y,velx,vely;
    private ImageIcon pancakeImage,pancakeImage2;
    private JLabel pancake,pancake2;
    private Rectangle bounds;
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
        
        bounds = new Rectangle(0,0,236,213);
        
        pancakeImage = new ImageIcon("images/pancake.jpg");
        pancake = new JLabel(pancakeImage);
        pancake.setBounds(bounds);
        
        pancakeImage2 = new ImageIcon("images/pancake.png");
        pancake2 = new JLabel(pancakeImage2);
        pancake2.setBounds(bounds);
        
        
        add(pancake);
        add(pancake2);
        add(clickToContinue, BorderLayout.CENTER);
        
        
        tm = new Timer(5, this);
        x = 0;
        y = 0;
        velx = 3;
        vely = 2;
        tm.start();
    }
    
    @Override
    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        g.setColor(new Color(156, 93, 82));
        g.drawOval(x,y,50,30);
        g.fillOval(x, y, 50, 30);
        
    }
    
    @Override
    public void actionPerformed(ActionEvent e)
    {
        if(x < 0 || x > 1180){
            velx = -velx;
        }
        if(y < 0 || y > 620){
            vely = -vely;
        }
            x = x + velx;
            y = y + vely;
            bounds = new Rectangle(x,y,200,200);
            pancake.setBounds(bounds);
            
            bounds = new Rectangle(x+42,y+42,200,200);
            pancake2.setBounds(bounds);
            repaint();
    }
    public JButton getClickToContinue() {
        return clickToContinue;
    }
}
