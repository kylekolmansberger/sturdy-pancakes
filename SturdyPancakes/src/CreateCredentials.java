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
 private JLabel label1, label2, label3, label4, createStatus;
 private JTextField username, password, credentialName, category;
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
        
        username = new JTextField();
        username.setFont(new Font("Serif",Font.PLAIN, 18));
        c.gridx = 1;   
        c.gridy = 4;      
        c.insets = new Insets(0,0,0,0); 
        add(username,c);   
        
      
        password = new JTextField();
        password.setFont(new Font("Serif",Font.PLAIN, 18));
        c.gridx = 1;   
        c.gridy = 6;      
        c.insets = new Insets(0,0,0,0); 
        add(password,c);
        
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
        
        credentialName = new JTextField();
        credentialName.setFont(new Font("Serif",Font.PLAIN, 18));
        c.gridx = 1;
        c.gridy = 2;
        c.insets = new Insets(0,0,0,0);
        add(credentialName, c);
        
        label4 = new JLabel("Category Name:", SwingConstants.LEFT);
        label4.setFont(new Font("Serif",Font.PLAIN, 18));
        label4.setOpaque(false);
        c.gridx = 1;
        c.gridy = 7;
        c.insets = new Insets(0,50,0,0);
        add(label4, c);
         
        category = new JTextField();
        category.setFont(new Font("Serif",Font.PLAIN, 18));
        c.gridx = 1;
        c.gridy = 8;
        c.insets = new Insets(0,0,0,0);
        add(category, c);
        
        createButton = new JButton("Create");
        createButton.setOpaque(false);
        createButton.setFont(new Font("Serif",Font.PLAIN, 20));
        c.gridx = 1;
        c.gridy = 9;
        c.ipadx = 100;
        c.insets = new Insets(0,0,0,0);
        add(createButton, c);
        
        createStatus = new JLabel("", SwingConstants.CENTER);
        c.gridx = 1;
        c.gridy = 10;
        c.insets = new Insets(0,0,0,0);
        add(createStatus, c);
        
        
        
    }    
    
    public JLabel getLabel1(){
        return label1;
    }
    public JLabel getLabel2(){
        return label2;
    }
    public JLabel getLabel3(){
        return label3;
    }
    public JLabel getLabel4(){
        return label4;
    }
    public JTextField getUsername(){
        return username;
    }
    public JTextField getPassword(){
        return password;
    }
    public JTextField getCredentialName (){
        return credentialName;
    }
    public JTextField getCategory(){
        return category;
    }
    public JButton getCreateButton(){
        return createButton;
    }
    public JButton getBackButton(){
        return backButton;
    }
    public JLabel getCreateStatus() {
        return createStatus;
    }
}