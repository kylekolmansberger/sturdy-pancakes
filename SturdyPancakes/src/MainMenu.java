
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
 * @author nadaziab
 */
public class MainMenu extends JPanel{
    private JLabel l1;
    private JButton b1,b2,b3;
    public MainMenu() {
        setLayout(new GridLayout(4,1));
        l1 = new JLabel("Select Your Menu Option: ", SwingConstants.CENTER);
        b1 = new JButton("1: Edit Portfolio");
        b2 = new JButton("2: Generate Password");
        b3 = new JButton("3: Settings");
        
        add(l1);
        add(b1);
        add(b2);
        add(b3);
    }
    
    public JButton getB1(){
        return b1;
    }
    public JButton getB2(){
        return b2;
    }
    public JButton getB3(){
        return b3;
    }
}
