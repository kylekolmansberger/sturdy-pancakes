
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
    private JLabel test;
    public GeneratePassword(){
        super();
        setVisible(true);
        setBackground(Color.white);
        setLayout(new BorderLayout());
        test = new JLabel("Generate Password");
        add(test);
        
    }
    
}
