
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
    private JLabel filler, category;
    private JTextField categoryName;
    
    public ViewPortfolio(){
        
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
        c.gridx = 0;
        c.anchor = GridBagConstraints.NORTHWEST;
        add(backButton, c);
        
        category = new JLabel("Enter Category Name", SwingConstants.CENTER);
        category.setFont(new Font("Serif", Font.PLAIN, 18));
        c.anchor = GridBagConstraints.CENTER;
        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 1;
        c.gridy = 1;
        c.ipadx = 250;
        c.ipady = 25;
        c.insets = new Insets(0,0,0,0);
        add(category,c);
               
        categoryName = new JTextField();
        categoryName.setFont(new Font("Serif", Font.PLAIN, 18));
        c.gridx = 1;
        c.gridy = 2;
        add(categoryName, c);
        
        submitButton = new JButton("View Portfolio");
        submitButton.setOpaque(false);
        submitButton.setContentAreaFilled(false);
        c.gridx = 1;
        c.gridy = 3;
        c.insets = new Insets(0,0,0,0);
        add(submitButton, c);
        
        filler = new JLabel("");
        c.gridx = 2;
        add(filler,c);
        
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
