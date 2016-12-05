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
 * @author kck5178
 */
public class CreateCategory extends JPanel 
{
 private JButton createButton, backButton, editButton;
 private JLabel label1 ;
 private JTextField categoryName;
    public CreateCategory  () 
    {
        setLayout(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();
        setBackground(Color.WHITE);
        
        c.gridwidth = 1;
        c.gridheight = 1;
        c.weightx = 1;
        c.weighty = 1;
        c.ipadx = 0;
        c.ipady =20;
        
        backButton = new JButton("< Main Menu");
        backButton.setOpaque(false);
        backButton.setContentAreaFilled(false);
        c.anchor = GridBagConstraints.NORTHWEST;
        add(backButton,c);
        
        label1 = new JLabel("Category Name:", SwingConstants.CENTER);
        label1.setFont(new Font("Serif",Font.PLAIN, 18));
        label1.setOpaque(false);
        c.gridx = 1;
        c.gridy = 0;
        c.insets = new Insets(350,0,0,0); 
        add(label1, c);
        
        categoryName = new JTextField();
        categoryName.setFont(new Font("Serif",Font.PLAIN, 18));
        c.gridx = 1;   
        c.gridy = 1;
        c.ipadx = 150;
        c.ipady = 25;
        c.insets = new Insets(0,0,0,0); 
        add(categoryName,c);
        
        c.ipadx = 0;
        c.ipady =20;
        
        createButton = new JButton("Create Category");
        createButton.setOpaque(false);
        createButton.setContentAreaFilled(false);
        c.gridx = 1;
        c.gridy = 2;
        c.insets = new Insets(0,0,0,0);
        add(createButton,c);
        
        
        editButton = new JButton("Edit Existing Category");
        editButton.setOpaque(false);
        editButton.setContentAreaFilled(false);
        c.gridx = 1;
        c.gridy = 3;
        c.insets = new Insets(100,0,0,0);
        add(editButton,c);
        
        
    } 
    
    public JButton getBackButton() {
        return backButton;
    }
    public JLabel getLabel1(){
        return label1;
    }
    public JTextField getCategoryName(){
        return categoryName;
    }
    public JButton getCreateButton(){
        return createButton;
    }
    public JButton getEditButton(){
        return editButton;
    } 
}
