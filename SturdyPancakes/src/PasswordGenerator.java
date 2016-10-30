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
    
    public PasswordGenerator() {
        generatedPassword = "";
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
}
