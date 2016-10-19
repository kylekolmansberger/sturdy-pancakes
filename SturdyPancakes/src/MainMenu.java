
import java.awt.*;
import java.util.Scanner;
import javax.swing.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author nadaziab
 */
public class MainMenu extends JPanel{
    private JLabel l1;
    private JButton b1,b2,b3,backButton;
    public MainMenu() {
        setLayout(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();
        
        c.gridwidth = 1;
        c.gridheight = 1;
        c.weightx = .5;
        c.weighty = .5;
        c.fill = GridBagConstraints.BOTH;
        c.ipady = 20;
        
        l1 = new JLabel("Select Your Menu Option: ", SwingConstants.CENTER);
        c.gridx = 1;  
        c.gridy = 1;
        c.insets = new Insets(10,0,0,0); 
        add(l1, c);
        
        b1 = new JButton("1: Edit Portfolio");
        c.gridx = 1;  
        c.gridy = 2;
        add(b1, c);
        
        b2 = new JButton("2: Generate Password");
        c.gridx = 1;  
        c.gridy = 3;
        add(b2, c);
        
        b3 = new JButton("3: Settings");
        c.gridx = 1;  
        c.gridy = 4;
        add(b3, c);
        
        backButton = new JButton("Log out");
        c.gridx = 1;  
        c.gridy = 5;
        c.fill = GridBagConstraints.NONE;
        add(backButton, c);
    }
    
    public JButton getB1(){
        return b1;
    }
    public JButton getB2(){
        return b2;
    }
    public JButton getB3(){
        return b3;
    }
    public JButton getBackButton(){
        return backButton;
    }
}
