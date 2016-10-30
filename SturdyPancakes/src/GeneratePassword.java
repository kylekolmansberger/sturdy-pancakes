
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
    private JCheckBox passwordOptions;
    private JCheckBox numbers, letters, specialChars;
    public GeneratePassword(){
        super();
        setVisible(true);
        setBackground(Color.white);
        setLayout(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();
        c.gridwidth = 0;
        c.gridheight = 0;
        c.weightx = 1;
        c.weighty = 1;
        c.ipady =20;
        
        backButton = new JButton("< Main Menu");
        backButton.setOpaque(false);
        backButton.setContentAreaFilled(false);
        c.anchor = GridBagConstraints.NORTHWEST;
        add(backButton,c);
        
        numbers = new JCheckBox("Numbers");
        letters = new JCheckBox("Letters");
        specialChars = new JCheckBox("Special Characters");
        
        add(numbers);
        add(letters);
        add(specialChars);
                
    }
    public JButton getBackButton(){
        return backButton;
    }
    
}
