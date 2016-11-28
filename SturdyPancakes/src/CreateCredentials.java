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
public class CreateCredentials extends JPanel 
{
 private JButton createButton, backButton;
 private JLabel label1, label2, label3;
 private JTextField text1, text2, text3;
    public CreateCredentials  () 
    {
        setLayout(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();
        setBackground(Color.WHITE);
        
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
       
        c.ipadx = 182;
        c.ipady = 10;
        
        
        label1 = new JLabel("Username: ", SwingConstants.LEFT);
        label1.setFont(new Font("Serif",Font.PLAIN, 18));
        label1.setOpaque(false);
        c.gridx = 1;  
        c.gridy = 3;
        c.insets = new Insets(0,50,0,0); 
        add(label1, c);
        
        text1 = new JTextField();
        text1.setFont(new Font("Serif",Font.PLAIN, 18));
        c.gridx = 1;   
        c.gridy = 4;      
        c.insets = new Insets(0,0,0,0); 
        add(text1,c);   
        
      
        text2 = new JTextField();
        text2.setFont(new Font("Serif",Font.PLAIN, 18));
        c.gridx = 1;   
        c.gridy = 6;      
        c.insets = new Insets(0,0,0,0); 
        add(text2,c);
        
         label2 = new JLabel("Password: ", SwingConstants.LEFT);
        label2.setFont(new Font("Serif",Font.PLAIN, 18));
        label2.setOpaque(false);
        c.gridx = 1;  
        c.gridy = 5;
        c.insets = new Insets(0,50,0,0); 
        add(label2, c);
        
        label3 = new JLabel("Credential Name:", SwingConstants.LEFT);
        label3.setFont(new Font("Serif",Font.PLAIN, 18));
        label3.setOpaque(false);
        c.gridx = 1;
        c.gridy = 1;
        c.insets = new Insets(350,30,0,0);
        add(label3, c);
        
        text3 = new JTextField();
        text3.setFont(new Font("Serif",Font.PLAIN, 18));
        c.gridx = 1;
        c.gridy = 2;
        c.insets = new Insets(0,0,0,0);
        add(text3, c);
         
        createButton = new JButton("Create");
        createButton.setFont(new Font("Serif",Font.PLAIN, 20));
        c.gridx = 1;
        c.gridy = 7;
        c.ipadx = 100;
        c.insets = new Insets(0,0,0,0);
        add(createButton, c);
        
        
        
    }    
    
    public JLabel getLabel1 (){
        return label1;
    }
    public JLabel getLabel2 (){
        return label2;
    }
    public JLabel getLabel3 (){
        return label3;
    }
    public JTextField getText1 (){
        return text1;
    }
    public JTextField getText2 (){
        return text2;
    }
    public JTextField getText3 (){
        return text3;
    }
    public JButton getCreateButton (){
        return createButton;
    }
    public JButton getBackButton (){
        return backButton;
    }
}