
import java.awt.BorderLayout;
import java.awt.*;
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
public class GeneratePassword extends JPanel{
    private JButton backButton;
    public GeneratePassword(){
        super();
        setVisible(true);
        setBackground(Color.white);
        setLayout(null);
        
        backButton = new JButton("< Main Menu");
        backButton.setBounds(0,0,110,40);
        
        add(backButton);
    }
    public JButton getBackButton(){
        return backButton;
    }
    
}
