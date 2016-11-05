
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import javax.swing.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Frank
 */
public class PancakeFlop extends JLabel{
    private Rectangle bounds;
    private int x,y, xVel,yVel;
    private Timer tim;
    public PancakeFlop(ImageIcon a) {
        super(a);
        bounds = new Rectangle(0,0,200,200);
        xVel = 3;
        yVel = 2;
        x = 0;
        y = 0;
        setBounds(getMyBounds());
        
        ActionListener action = new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent event) 
            {
                if(x < 0 || x > 1180){
                    xVel = -xVel;
                }
                if(y < 0 || y > 620){
                    yVel = -yVel;
                }
                x = x + xVel;
                y = y + yVel;
                bounds = new Rectangle(x,y,200,200);
                setBounds(bounds);
            }
        };
        tim = new Timer(5, action);
    }
                
    public int getXVel(){
        return xVel;
    }
    public void setXVel(int xVel){
        this.xVel = xVel;
    }
    public int getYVel(){
        return yVel;
    }
    public void setYVel(int yVel){
        this.yVel = yVel;
    }
    public Rectangle getMyBounds(){
        bounds = new Rectangle(x,y,50,50);
        return bounds;
    }
    public void setMyBounds(Rectangle bounds){
        this.bounds = bounds;
    }
    public Timer getTim(){
        return tim;
    }
    
}
