
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
        add(clickToContinue, BorderLayout.CENTER);
        
        tm = new Timer(5, this);
        x = 0;
        y = 0;
        velx = 4;
        vely = 2;
    }
    
    @Override
    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        g.setColor(new Color(156, 93, 82));
        g.drawOval(x,y,50,30);
        g.fillOval(x, y, 50, 30);
        
        tm.start();
    }
    
    @Override
    public void actionPerformed(ActionEvent e)
    {
        if (x < 0 || x > 1280){
            velx = -velx;
        }
        if (y < 0 || y > 600){
            vely = -vely;
        }
            x = x + velx;
            y = y + vely;
            repaint();
        
    }
    public JButton getClickToContinue() {
        return clickToContinue;
    }
}
