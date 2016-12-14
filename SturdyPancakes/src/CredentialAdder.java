
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
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
public class CredentialAdder extends JPanel {

    String profileName, categoryName, credentialName, username, password;

    public CredentialAdder() {

    }

    public void addCredential(String profile, String category, String credential, String username, String password) {
        profileName = profile;
        categoryName = category;
        credentialName = credential;
        this.username = username;
        this.password = password;

        File file = new File("SuperSecretStuff/" + profileName + "/" + categoryName + ".txt");

        try {

            FileWriter fw = new FileWriter(file, true);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(" " +credentialName + "#" + this.username + "#" + this.password);
            bw.newLine();
            bw.close();

        } catch (IOException e) {

        }

    }

}
