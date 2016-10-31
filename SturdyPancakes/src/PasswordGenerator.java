/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Frank Liang
 */
public class PasswordGenerator {
    private String generatedPassword, parameters;
    private char[] choices;
    
    public PasswordGenerator() {
        generatedPassword = "";
        choices = new char[3];
        choices[0] = '-';
        choices[1] = '-';
        choices[2] = '-';
        parameters = "---";
    }
    
    public String generatePassword() {
        if(parameters == "---") {
            
        }
        else if(parameters == "t--") {
            
        }
        else if(parameters == "-t-") {
            
        }
        else if(parameters == "--t") {
            
        }
        else if(parameters == "tt-") {
            
        }
        else if(parameters == "t-t") {
            
        }
        else if(parameters == "-tt") {
            
        }
        else if(parameters == "ttt") {
            
        }
        
        
        return generatedPassword;
    }
    public char[] getChoices(){
        return choices;
    }
    
    public void setChoices(char[] choices){
        this.choices = choices;
    }
    
    public String getParameters(){
        return parameters;
    }
    
    public void setParameters(String parameters){
        this.parameters = parameters;
    }
    public String getGeneratedPassword(){
        return generatedPassword;
    }
}
