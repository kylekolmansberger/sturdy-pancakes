
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
        c.gridwidth = 1;
        c.gridheight = 1;
        c.weightx = 1;
        c.weighty = 1;
        c.ipady =20;
        
        backButton = new JButton("< Main Menu");
        backButton.setOpaque(false);
        backButton.setContentAreaFilled(false);
        c.anchor = GridBagConstraints.NORTHWEST;
        add(backButton,c);
        c.ipadx = 100;
        c.ipady = 100;
        c.fill = GridBagConstraints.HORIZONTAL;
        c.anchor = GridBagConstraints.WEST;
   
        c.gridx = 1;
        c.gridy = 0;
        createCategoryButton = new JButton("Create/Edit Categories");
        createCategoryButton.setOpaque(false);
        createCategoryButton.setContentAreaFilled(false);
        add(createCategoryButton,c);
        
        
        c.gridx = 1;
        c.gridy = 1;
        createCredentialsButton = new JButton("Create Credentials");
        createCredentialsButton.setOpaque(false);
        createCredentialsButton.setContentAreaFilled(false);
        add(createCredentialsButton,c);
        
        c.gridx = 1;
        c.gridy = 2;
        editCredentialsButton = new JButton("Edit Credentials");
        editCredentialsButton.setOpaque(false); 
        editCredentialsButton.setContentAreaFilled(false);
        add(editCredentialsButton,c);
        
        c.ipadx = 0;
        c.ipady = 0;
        c.gridx=2;
        c.fill = GridBagConstraints.NONE;
        c.anchor = GridBagConstraints.SOUTHEAST;
        settingsButton = new JButton("Settings");
        settingsButton.setOpaque(false);
        settingsButton.setContentAreaFilled(false);
        add(settingsButton,c);
        
        
    }
    public JButton getBackButton(){
        return backButton;
    }
    public JButton getCreateCredentialsButton() {
        return createCredentialsButton;
    }
    public JButton getEditCredentialsButton() {
        return editCredentialsButton;
    }
    public JButton getCreateCategoryButton() {
        return createCategoryButton;
    }
    public JButton getEditCategoryButton() {
        return editCategoryButton;
    }
    public JButton getSettingsButton() {
        return settingsButton;
    }
    
}
