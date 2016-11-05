
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
    private int x,y, xVel,yVel,xRes,yRes;
    private Timer tim;
    public PancakeFlop(ImageIcon a) {
        super(a);
        bounds = new Rectangle(0,0,200,200);
        xVel = 3;
        yVel = 3;
        x = 0;
        y = 0;
        xRes = 1180;
        yRes = 680;
                
        setBounds(getMyBounds());
        
        ActionListener action = new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent event) 
            {
                if(x < -40){
                    xVel = Math.abs(xVel);
                }
                if(y < -40){
                    yVel = Math.abs(yVel);
                }
                if(x > xRes){
                    xVel = -Math.abs(xVel);
                }
                if(y > yRes){
                    yVel = -Math.abs(yVel);
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
    public int getX(){
        return x;
    }
    public void setX(int x){
        this.x = x;
    }
    public int getY(){
        return y;
    }
    public void setY(int y){
        this.y = y;
    }
    public int getYRes(){
        return yRes;
    }
    public void setYRes(int yRes){
        this.yRes = yRes;
    }
    public int getXRes(){
        return xRes;
    }
    public void setXRes(int xRes){
        this.xRes = xRes;
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
