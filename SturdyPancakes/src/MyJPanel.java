
import java.awt.Color;
import javax.swing.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kck5178
 */
public class MyJPanel extends JPanel {
    public MyJPanel()
    {
        super();
        setBackground(Color.gray);
        setLayout(null);
        
        WelcomeScreen welcome = new WelcomeScreen();
        welcome.setBounds(0,0,500,500);
        add(welcome);
    }
    
}
