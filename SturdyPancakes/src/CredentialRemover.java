
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JPanel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author nadaziab
 */
public class CredentialRemover extends JPanel {

    String profileName, categoryName, credentialName;

    public CredentialRemover() {
        
    }
    

    public void removeCredential(String profile, String category, String credential) {
        
        profileName = profile;
        categoryName = category;
        credentialName = credential;

        File file = new File("SuperSecretStuff/" + profileName + "/" + categoryName + ".txt");
        ArrayList<String> credentials = new ArrayList<>();
        int foundLocation = -1;

        try {

            Scanner in = new Scanner(new FileReader(file));

            while (in.hasNextLine()) {
                String temp = in.nextLine();
                credentials.add(temp);
            }

            for (int i = 0; i < credentials.size(); i++) {

                String temp = credentials.get(i);
                int space = temp.indexOf("#");
                String label = temp.substring(0, space);
               
                if (label.equals(" " + credentialName)) {
                    foundLocation = i;
                    break;
                }

            }

            credentials.remove(foundLocation);

        } catch (FileNotFoundException ex) {
            Logger.getLogger(DeleteCredentialController.class.getName()).log(Level.SEVERE, null, ex);
        }

        file.delete();

        try {
            file = new File("SuperSecretStuff/" + profileName + "/" + categoryName + ".txt");

            // if file doesnt exists, then create it
            if (!file.exists()) {
                file.createNewFile();
                FileWriter fw = new FileWriter(file, true);
                BufferedWriter bw = new BufferedWriter(fw);
                for (int i = 0; i < credentials.size(); i++) {
                    bw.write(credentials.get(i));
                    bw.newLine();
                }
                bw.close();

            }

        } catch (IOException e) {
            System.out.println("Failed");
        }
    }
}
