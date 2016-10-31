
import java.util.*;

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
    private char[] generatedChar,choices;
    private final String alphabet,numbers,specialChars;
    private Random r;
    
    public PasswordGenerator() {
        generatedChar = new char[16];
        generatedPassword = "";
        choices = new char[3];
        choices[0] = '-';
        choices[1] = '-';
        choices[2] = '-';
        parameters = "";
        alphabet = "abcdefghijklmnopqrstuvwxyz";
        numbers = "0123456789";
        specialChars = "!@#$%^&*()?.";
        r = new Random();
    }
    public void Generator(){
        if(parameters.equals("t--")) {
            for(int i=0;i<16;i++){
                generatedChar[i] = numbers.charAt(r.nextInt(numbers.length()));
            }
        }
        else if(parameters.equals("-t-")) {
            for(int i=0;i<16;i++){
                generatedChar[i] = alphabet.charAt(r.nextInt(alphabet.length()));
            }
        }
        else if(parameters.equals("--t")) {
            for(int i=0;i<16;i++){
                generatedChar[i] = specialChars.charAt(r.nextInt(specialChars.length()));
            }
        }
        else if(parameters.equals("tt-")) {
            for(int i=0;i<8;i++){
                generatedChar[i] = numbers.charAt(r.nextInt(numbers.length()));
            }
            for(int i=9;i<16;i++){
                generatedChar[i] = alphabet.charAt(r.nextInt(alphabet.length()));
            }
        }
        else if(parameters.equals("t-t")) {
            for(int i=0;i<8;i++){
                generatedChar[i] = numbers.charAt(r.nextInt(numbers.length()));
            }
            for(int i=9;i<16;i++){
                generatedChar[i] = specialChars.charAt(r.nextInt(specialChars.length()));
            }
        }
        else if(parameters.equals("-tt")) {
            for(int i=0;i<8;i++){
                generatedChar[i] = alphabet.charAt(r.nextInt(alphabet.length()));
            }            
            for(int i=9;i<16;i++){
                 generatedChar[i] = specialChars.charAt(r.nextInt(specialChars.length()));
            }
        }
        else if(parameters.equals("ttt")) {
            for(int i=0;i<6;i++){
                generatedChar[i] = numbers.charAt(r.nextInt(numbers.length()));
            }            
            for(int i=7;i<11;i++){
                generatedChar[i] = alphabet.charAt(r.nextInt(alphabet.length()));
            }
            for(int i=12;i<16;i++){
                generatedChar[i] = specialChars.charAt(r.nextInt(specialChars.length()));
            }
        }
        generatedPassword = new String(generatedChar);
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
