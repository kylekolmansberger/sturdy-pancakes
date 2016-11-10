
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author nadaziab
 */
public class CredentialModel {
    
    private String category;
    private File file = new File(category + ".txt");
    
    private String label, username, password;
    public CredentialModel() {
        
    }
    
    public void createCredential(String category) {
        try {
            
            FileWriter fw = new FileWriter(file, true);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(label + " " + username + " " + password);
            bw.newLine();
            bw.close();
        
        } catch (IOException e) {
            
        }
    }
}
