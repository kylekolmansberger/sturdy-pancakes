import java.awt.event.*;
import java.io.IOException;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kck5178
 */
public class CreateCredentialsController implements Menu {
    private Model model;
    private View view;
    
    String credentialName, username, password, category, profileName;
    
    public CreateCredentialsController (Model a, View b) {
        model = a;
        view = b;
        menuChoice();
    }
    private void menuChoice(){ 
        
    
    ActionListener menuChoice = new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent event){
                if(event.getSource() == view.getMyJFrame().getManagePortfolio().getCreateCredentialsButton()){
                    view.getMyJFrame().setContentPane(view.getMyJFrame().getCreateCredentials());
                    view.getMyJFrame().revalidate();
                }
            }
        };
        //=======================================================
        //Menu choice pressed
        //=======================================================
    
        view.getMyJFrame().getManagePortfolio().getCreateCredentialsButton().addActionListener(menuChoice);
        ActionListener backButton = new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent event){
                if(event.getSource() == view.getMyJFrame().getCreateCredentials().getBackButton()){
                    view.getMyJFrame().setContentPane(view.getMyJFrame().getManagePortfolio());
                    view.getMyJFrame().revalidate();
                }
            }
        };
        
        //=======================================================
        //Back Button pressed
        //=======================================================
        view.getMyJFrame().getCreateCredentials().getBackButton().addActionListener(backButton);
        ActionListener createCredential;
        createCredential = new ActionListener(){
            
            @Override
            public void actionPerformed(ActionEvent event) {
                if(event.getSource() == view.getMyJFrame().getCreateCredentials().getCreateButton()){
                    credentialName = view.getMyJFrame().getCreateCredentials().getCredentialName().getText();
                    username = view.getMyJFrame().getCreateCredentials().getUsername().getText();
                    password = view.getMyJFrame().getCreateCredentials().getPassword().getText();
                    category = view.getMyJFrame().getCreateCredentials().getCategory().getText();
                    profileName = view.getMyJFrame().getProfileNameAccess().getProfileName();
                    
                    
                    File file = new File("SuperSecretStuff/" + profileName + "/" +  category + ".txt");
                
                    try {
            
                        FileWriter fw = new FileWriter(file, true);
                        BufferedWriter bw = new BufferedWriter(fw);
                        bw.write(credentialName + "#" + username + "#" + password);
                        bw.newLine();
                        bw.close();
        
                    } catch (IOException e) {
                        
                        
                        
                    }
                    
                    
                }
            }
            
        };
        
        //=======================================================
        //Create Credential Button pressed
        //=======================================================
        view.getMyJFrame().getCreateCredentials().getCreateButton().addActionListener(createCredential);
        
    }

    @Override
    public void getUserSelection() {
       
    }

    @Override
    public void runUserSelection() {
      
    }

}