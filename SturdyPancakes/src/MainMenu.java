
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
public class MainMenu extends JPanel implements Menu{
    private JLabel l1;
    private JButton b1,b2,b3;
    int menuOption;
    MainMenuController m1;
    public MainMenu() {
        setLayout(new GridLayout(4,1));
        l1 = new JLabel("Select Your Menu Option: ", SwingConstants.CENTER);
        b1 = new JButton("1: Add Portfolio");
        b2 = new JButton("2: Generate Password");
        b3 = new JButton("3: Settings");
        
        add(l1);
        add(b1);
        add(b2);
        add(b3);
        
        menuOption = 0;
        m1 = new MainMenuController();
        System.out.println("Select Your Menu Option:");
        System.out.println("1: Add Portfolio");
        System.out.println("2: Generate Password");
        System.out.println("3: Settings");
    }

    @Override
    public void getUserSelection() {
        Scanner in = new Scanner(System.in);
        menuOption = in.nextInt();
        
    }

    @Override
    public void runUserSelection() {
        if (menuOption == 1) {
            m1.runAddPortfolioMenu();
        }
        else if (menuOption == 2) {
            m1.runGeneratePasswordMenu();
        }
        else if (menuOption == 3) {
            m1.runSettingsMenu();
        }
        else {
            System.out.println("Invalid Option");
        }
    }
    
    
}
