
import java.awt.BorderLayout;
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
public class LoginScreen extends JPanel{
    
   private JTextField username,password;
   private JLabel enterUser, enterPass,loginStatus;
   private JButton login,register;
   private JOptionPane option;
   
   public LoginScreen(){
        super();
        setVisible(true);
        setBackground(Color.WHITE);
        setLayout(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();
        
        c.gridwidth = 1;
        c.gridheight = 1;
        c.weightx = 0;
        c.weighty = 0;
        c.fill = GridBagConstraints.HORIZONTAL;
        c.ipady = 20;
        
        enterUser = new JLabel("Enter Username Below", SwingConstants.CENTER);
        enterUser.setFont(new Font("Serif",Font.PLAIN, 18));
        c.gridx = 1;  
        c.gridy = 5;
        c.insets = new Insets(350,0,0,0); 
        add(enterUser, c); 
        
        username = new JTextField();
        username.setFont(new Font("Serif",Font.PLAIN, 18));
        c.gridx = 1;   
        c.gridy = 6;      
        c.insets = new Insets(0,0,0,0); 
        add(username,c);
        
        enterPass = new JLabel("Enter Password Below", SwingConstants.CENTER);
        enterPass.setFont(new Font("Serif",Font.PLAIN, 18));
        c.gridx = 1;  
        c.gridy = 7;  
        add(enterPass,c);
        
        password = new JPasswordField();
        password.setFont(new Font("Serif",Font.PLAIN, 18));
        c.gridx = 1;  
        c.gridy = 8;      
        add(password, c);
        
        login = new JButton("Login");
        c.gridx = 1;
        c.gridy = 9;      
        c.insets = new Insets(10,0,0,0); 
        login.setOpaque(false);
        login.setContentAreaFilled(false);
        add(login,c);
        
        loginStatus = new JLabel("",SwingConstants.CENTER);
        c.gridx = 1;
        c.gridy = 10;      
        c.insets = new Insets(0,0,0,0); 
        add(loginStatus,c);
        
        register = new JButton("Register");
        c.gridx = 1;
        c.gridy = 11;      
        c.insets = new Insets(0,0,0,0); 
        register.setOpaque(false);
        register.setContentAreaFilled(false);
        add(register,c);
        
        
    }
    public JTextField getUsername() {
        return username;
    }
   
    public JTextField getPassword() {
        return password;
    }
    public JButton getLoginButton(){
        return login;
    }
    public JLabel getLoginStatus(){
        return loginStatus;
    }
    public JButton getRegister(){
        return register;
    }
}
