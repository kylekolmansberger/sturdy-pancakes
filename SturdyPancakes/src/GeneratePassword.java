
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
    private JButton backButton, generate;
    private JLabel passwordOptions,empty;
    private JCheckBox numbers, letters, specialChars;
    public GeneratePassword(){
        super();
        setVisible(true);
        setBackground(Color.white);
        setLayout(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();
        c.gridwidth = 1;
        c.gridheight = 1;
        c.weightx = 1;
        c.weighty = 1;
        c.ipady =60;
        
        backButton = new JButton("< Main Menu");
        
        backButton.setOpaque(false);
        backButton.setContentAreaFilled(false);
        c.anchor = GridBagConstraints.NORTHWEST;
        c.gridx = 0;
        c.gridy = 0;
        add(backButton,c);
        
        c.anchor = GridBagConstraints.WEST;
        
        passwordOptions = new JLabel("Choose Password Parameters:");
        passwordOptions.setFont(new Font("Serif",Font.PLAIN, 18));
        passwordOptions.setOpaque(false);
        c.gridwidth = 2;
        c.gridx = 1;
        c.gridy = 0;
        c.insets = new Insets(150,0,0,0);
        add(passwordOptions,c);
        
        numbers = new JCheckBox("Numbers");
        numbers.setContentAreaFilled(false);
        c.gridwidth = 1;
        c.gridx = 1;  
        c.gridy = 1;
        c.insets = new Insets(0,0,0,0);
        add(numbers, c);
        
        letters = new JCheckBox("Letters");
        letters.setContentAreaFilled(false);
        c.gridx = 1;  
        c.gridy = 2;
        c.insets = new Insets(0,0,0,0); 
        add(letters, c);
        
        specialChars = new JCheckBox("Special Characters");
        specialChars.setContentAreaFilled(false);
        c.gridx = 1;  
        c.gridy = 3;
         c.insets = new Insets(0,0,0,0);
        add(specialChars, c);
        
        generate = new JButton("Generate New Password");
        generate.setOpaque(false);
        generate.setContentAreaFilled(false);
        c.fill = GridBagConstraints.NONE;
        c.anchor = GridBagConstraints.WEST;
        c.gridx = 1;  
        c.gridy = 4;
        c.insets = new Insets(200,0,100,0);
        add(generate,c);
        
        empty = new JLabel("");
        add(empty,c);
    }
    public JButton getBackButton(){
        return backButton;
    }
    public JCheckBox getNumbers(){
        return numbers;
    }
    public JCheckBox getLetters(){
        return letters;
    }
    public JCheckBox getSpecialChars(){
        return specialChars;
    }
    public JButton getGenerate(){
        return generate;
    }
}
