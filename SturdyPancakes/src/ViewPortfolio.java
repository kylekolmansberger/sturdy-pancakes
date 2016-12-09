
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
public class ViewPortfolio extends JPanel{
    
    private JButton backButton, submitButton;
    private JTextField categoryName;
    
    public ViewPortfolio(){
        
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
        add(backButton, c);
        
        
        categoryName = new JTextField();
        categoryName.setFont(new Font("Serif", Font.PLAIN, 18));
        c.anchor = GridBagConstraints.CENTER;
        c.gridx = 1;
        c.gridy = 1;
        c.ipadx = 250;
        c.ipady = 25;
        c.insets = new Insets(0,0,0,0);
        add(categoryName, c);
        
        submitButton = new JButton("View Portfolio");
        submitButton.setOpaque(false);
        submitButton.setContentAreaFilled(false);
        c.gridx = 1;
        c.gridy = 2;
        c.insets = new Insets(10,0,20,0);
        add(submitButton, c);
        
    }
    
    public JButton getBackButton(){
        return backButton;
    }
    public JTextField getCategoryName() {
        return categoryName;
    }
    public JButton getSubmitButton() {
        return submitButton;
    }
    
}
