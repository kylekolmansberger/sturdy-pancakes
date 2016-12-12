
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
    private String label, username,password;
    
    public void savePortfolio(ArrayList<String> portfolio) {
        this.portfolio = new ArrayList<>();
        this.portfolio = portfolio;
        label = "";
        username = "";
        password = "";
    }
    
    public void separateLines() {
        for (int i = 0; i < portfolio.size(); i++) {
            String temp = portfolio.get(i);
            int space = temp.indexOf("#");
            setLabel(temp.substring(0,space));
            temp = temp.substring(space + 1);
            
            System.out.println("Label: " + label);
            
            space = temp.indexOf("#");
            setUsername(temp.substring(0, space));
            temp = temp.substring(space + 1);
            
            System.out.println("Username: " + username);
            
            setPassword(temp);
            System.out.println("Password: " + password);
        }
        
    }
    
    public ArrayList<String> getSavedPortfolio() {
        return portfolio;
    }
    public String getLabel(){
        return label;
    }
    public void setLabel(String label){
        this.label = label;
    }
    public String getUsername(){
        return username;
    }
    public void setUsername(String username){
        this.username = username;
    }
    public String getPassword(){
        return password;
    }
    public void setPassword(String password){
        this.password = password;
    }
}
