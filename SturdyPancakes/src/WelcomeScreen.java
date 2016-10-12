
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
    public WelcomeScreen(){
        super();
        
        setBackground(Color.blue);
        setLayout(null);
        
        clickToContinue = new JButton("Click to Continue");
        add(clickToContinue);
        setVisible(true);
            
    }
    
}
