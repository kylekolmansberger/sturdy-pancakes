
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
public class ManagePortfolio extends JPanel{
    private JButton backButton, createCategoryButton, editCategoryButton, createCredentialsButton, editCredentialsButton, settingsButton; 
    
    public ManagePortfolio(){
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
        
        createCategoryButton = new JButton("Create Category");
        createCategoryButton.setOpaque(false);
        createCategoryButton.setContentAreaFilled(false);
        
        editCategoryButton = new JButton("Edit Category");
        editCategoryButton.setOpaque(false);
        editCategoryButton.setContentAreaFilled(false);
        
        createCredentialsButton = new JButton("Create Credentials");
        createCredentialsButton.setOpaque(false);
        createCredentialsButton.setContentAreaFilled(false);
        
        editCredentialsButton = new JButton("Edit Credentials");
        editCredentialsButton.setOpaque(false); 
        editCredentialsButton.setContentAreaFilled(false);
        
        settingsButton = new JButton("Settings");
        settingsButton.setOpaque(false);
        settingsButton.setContentAreaFilled(false);
        
        
        
    }
    public JButton getBackButton(){
        return backButton;
    }
    
}
