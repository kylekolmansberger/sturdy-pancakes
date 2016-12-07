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
 private JLabel label1, label2, createStatus ;
 private JTextField categoryName, username;
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
        
        /*
        label2 = new JLabel("Username:", SwingConstants.CENTER);
        label2.setFont(new Font("Serif",Font.PLAIN, 18));
        label2.setOpaque(false);
        c.gridx = 1;
        c.gridy = 1;
        c.insets = new Insets(300,0,0,0); 
        add(label2, c);
        
        username = new JTextField();
        username.setFont(new Font("Serif",Font.PLAIN, 18));
        c.gridx = 1;   
        c.gridy = 2;
        c.ipadx = 150;
        c.ipady = 25;
        c.insets = new Insets(0,0,0,0); 
        add(username,c);
        */
        
        label1 = new JLabel("Category Name:", SwingConstants.LEFT);
        label1.setFont(new Font("Serif",Font.PLAIN, 18));
        label1.setOpaque(false);
        c.gridx = 1;
        c.gridy = 3;
        c.insets = new Insets(20,0,0,0); 
        add(label1, c);
        
        categoryName = new JTextField();
        categoryName.setFont(new Font("Serif",Font.PLAIN, 18));
        c.gridx = 1;   
        c.gridy = 4;
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
        c.gridy = 5;
        c.insets = new Insets(20,0,0,0);
        add(createButton,c);
        
        createStatus = new JLabel("",SwingConstants.CENTER);
        c.gridx = 1;
        c.gridy = 6;      
        c.insets = new Insets(0,0,0,0); 
        add(createStatus,c);
        
        editButton = new JButton("Edit Existing Category");
        editButton.setOpaque(false);
        editButton.setContentAreaFilled(false);
        c.gridx = 1;
        c.gridy = 7;
        c.insets = new Insets(10,0,20,0);
        add(editButton,c);
        
        
    } 
    
    public JButton getBackButton() {
        return backButton;
    }
    public JLabel getLabel1(){
        return label1;
    }
    public JLabel getLabel2(){
        return label2;
    }
    public JLabel getCreateStatus(){
        return createStatus;
    }
    public JTextField getCategoryName(){
        return categoryName;
    }
    public JTextField getUsername(){
        return username;
    }
    public JButton getCreateButton(){
        return createButton;
    }
    public JButton getEditButton(){
        return editButton;
    } 
    
}
