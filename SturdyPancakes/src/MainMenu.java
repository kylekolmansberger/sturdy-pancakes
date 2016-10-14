
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author nadaziab
 */
public class MainMenu implements Menu{
    
    int menuOption;
    MainMenuController m1;
    public MainMenu() {
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
