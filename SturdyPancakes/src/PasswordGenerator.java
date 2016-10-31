/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author nadaziab
 */
public class PasswordGenerator {
    private boolean numbers, letters, specialChars;
    private String generatedPassword;
    private char[] choices;
    
    public PasswordGenerator() {
        generatedPassword = "";
        choices = new char[3];
        choices[0] = '-';
        choices[1] = '-';
        choices[2] = '-';
    }
    
    public String generatePassword(boolean numbers, boolean letters, boolean specialChars) {
        this.numbers = numbers;
        this.letters = letters;
        this.specialChars = specialChars;
        
        if (numbers && letters && specialChars) {
            
        }
        else if (numbers && letters) {
            
        }
        else if (numbers && specialChars) {
            
        }
        else if (letters && specialChars) {
            
        }
        else if (numbers) {
            
        }
        else if (letters) {
            
        }
        else if (specialChars) {
            
        }
        
        
        return generatedPassword;
    }
    public char[] getChoices(){
        return choices;
    }
    
    public void setChoices(char[] choices){
        this.choices = choices;
    }
}
