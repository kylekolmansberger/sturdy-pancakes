import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

public class PancakeFlop extends JPanel implements ActionListener
{
    
    Timer tm = new Timer(5, this);
    int x = 0, velX = 2;
    
    @Override
    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        
        g.setColor(Color.LIGHT_GRAY);
        g.drawOval(x,x,50,30);
        g.fillOval(x, x, 50, 30);
        
        tm.start();
    }
    
    @Override
    public void actionPerformed(ActionEvent e)
    {
        if (x < 0 || x > 450)
            velX = -velX;
        
        x = x + velX;
        repaint();
    }
    
    public static void main(String[] args)
    {
        PancakeFlop t = new PancakeFlop();
        JFrame jf = new JFrame();
        jf.setTitle("Sturdy Pancake");
        jf.setSize(500, 500);
        jf.setVisible(true);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.add(t);
    }
}