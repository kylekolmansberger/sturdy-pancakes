
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
public class DeleteCredential extends JPanel {
    
    private JButton backButton, deleteButton;
    private JLabel label1, label2, deleteStatus;
    private JTextField categoryName, credentialName;
    
    public DeleteCredential() {
        setLayout(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();
        setBackground(Color.WHITE);
        
        c.gridwidth = 1;
        c.gridheight = 1;
        c.weightx = 1;
        c.weighty = 1;
        c.ipadx = 0;
        c.ipady = 20;
        
        backButton = new JButton("< Back");
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
        
        
        deleteButton = new JButton("Delete Credential");
        deleteButton.setOpaque(false);
        deleteButton.setContentAreaFilled(false);
        c.gridx = 1;
        c.gridy = 5;
        c.insets = new Insets(0,0,0,0);
        add(deleteButton,c);
        
        deleteStatus = new JLabel("", SwingConstants.CENTER);
        c.gridx = 1;
        c.gridy = 6;      
        c.insets = new Insets(0,0,0,0); 
        add(deleteStatus,c);
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
    public JButton getDeleteButton() {
        return deleteButton;
    }
    public JLabel getDeleteStatus() {
        return deleteStatus;
    }
}
