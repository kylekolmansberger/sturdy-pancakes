
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author nadaziab
 */
public class SavedPortfolios {
    
    private ArrayList<String> portfolio;
    
    public void savePortfolio(ArrayList<String> portfolio) {
        this.portfolio = new ArrayList<>();
        this.portfolio = portfolio;
    }
    
    public void separateLines() {
        for (int i = 0; i < portfolio.size(); i++) {
            String temp = portfolio.get(i);
            int space = temp.indexOf("#");
            String label = temp.substring(0,space);
            temp = temp.substring(space + 1);
            
            System.out.println("Label: " + label);
            
            space = temp.indexOf("#");
            String username = temp.substring(0, space);
            temp = temp.substring(space + 1);
            
            System.out.println("Username: " + username);
            
            String password = temp;
            System.out.println("Password: " + password);
        }
    }
    
    public ArrayList<String> getSavedPortfolio() {
        return portfolio;
    }
}
