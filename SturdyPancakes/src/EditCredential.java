
import java.awt.Color;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author nadaziab
 */
public class EditCredential extends JPanel {
    
    private JButton backButton, editButton;
    private JLabel label1, label2, label3, label4, editStatus;
    private JTextField categoryName, credentialName, username, password;
    
    public EditCredential() {
        
        setLayout(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();
        setBackground(Color.WHITE);
        
        c.gridwidth = 1;
        c.gridheight = 1;
        c.weightx = 1;
        c.weighty = 1;
        c.ipadx = 0;
        c.ipady = 20;
        
        backButton = new JButton("< Main Menu");
        backButton.setOpaque(false);
        backButton.setContentAreaFilled(false);
        c.anchor = GridBagConstraints.NORTHWEST;
        add(backButton,c);
        
        c.ipadx = 182;
        c.ipady = 10;
        
        label1 = new JLabel("Category Name:", SwingConstants.LEFT);
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
        
        label2 = new JLabel("Credential Name:", SwingConstants.LEFT);
        label2.setFont(new Font("Serif",Font.PLAIN, 18));
        label2.setOpaque(false);
        c.gridx = 1;
        c.gridy = 2;
        c.insets = new Insets(0,0,0,0); 
        add(label2, c);
        
        credentialName = new JTextField();
        credentialName.setFont(new Font("Serif",Font.PLAIN, 18));
        c.gridx = 1;   
        c.gridy = 3;
        c.ipadx = 150;
        c.ipady = 25;
        c.insets = new Insets(0,0,0,0); 
        add(credentialName,c);
        
        label3 = new JLabel("New Username:", SwingConstants.LEFT);
        label3.setFont(new Font("Serif",Font.PLAIN, 18));
        label3.setOpaque(false);
        c.gridx = 1;
        c.gridy = 4;
        c.insets = new Insets(0,0,0,0); 
        add(label3, c);
        
        username = new JTextField();
        username.setFont(new Font("Serif",Font.PLAIN, 18));
        c.gridx = 1;   
        c.gridy = 5;
        c.ipadx = 150;
        c.ipady = 25;
        c.insets = new Insets(0,0,0,0); 
        add(username,c);
        
        label4 = new JLabel("New Password:", SwingConstants.LEFT);
        label4.setFont(new Font("Serif",Font.PLAIN, 18));
        label4.setOpaque(false);
        c.gridx = 1;
        c.gridy = 6;
        c.insets = new Insets(0,0,0,0); 
        add(label4, c);
        
        password = new JTextField();
        password.setFont(new Font("Serif",Font.PLAIN, 18));
        c.gridx = 1;   
        c.gridy = 7;
        c.ipadx = 150;
        c.ipady = 25;
        c.insets = new Insets(0,0,0,0); 
        add(password,c);
        
        editButton = new JButton("Edit Credential");
        editButton.setOpaque(false);
        editButton.setContentAreaFilled(false);
        c.gridx = 1;
        c.gridy = 8;
        c.insets = new Insets(0,0,0,0);
        add(editButton,c);
        
        editStatus = new JLabel("", SwingConstants.CENTER);
        c.gridx = 1;
        c.gridy = 9;      
        c.insets = new Insets(0,0,0,0); 
        add(editStatus,c);
    }
    
    public JButton getBackButton() {
        return backButton;
    }
    public JLabel getLabel1() {
        return label1;
    }
    public JTextField getCategoryName() {
        return categoryName;
    }
    public JLabel getLabel2() {
        return label2;
    }
    public JTextField getCredentialName() {
        return credentialName;
    }
    public JLabel getLabel3() {
        return label3;
    }
    public JTextField getUsername(){
        return username;
    }
    public JLabel getLabel4() {
        return label4;
    }
    public JTextField getPassword() {
        return password;
    }
    public JButton getEditButton() {
        return editButton;
    }
    public JLabel getEditStatus() {
        return editStatus;
    }
    
}
