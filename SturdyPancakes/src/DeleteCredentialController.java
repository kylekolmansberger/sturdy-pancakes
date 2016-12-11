
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
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

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author nadaziab
 */
public class DeleteCredentialController implements Menu {

    
    Model model;
    View view;
    
    public DeleteCredentialController(Model a, View b) {
        model = a;
        view = b;
        actionListener();
    }
    
    private void actionListener() {
        ActionListener menuChoice = new ActionListener() {
            
            @Override
            public void actionPerformed(ActionEvent event) {
                if (event.getSource() == view.getMyJFrame().getManagePortfolio().getDeleteCredentialsButton()) {
                    view.getMyJFrame().setContentPane(view.getMyJFrame().getDeleteCredentials());
                    view.getMyJFrame().revalidate();
                }
            }
        };
        //=======================================================
        //Menu choice pressed
        //=======================================================
        view.getMyJFrame().getManagePortfolio().getDeleteCredentialsButton().addActionListener(menuChoice);
        
        
        
        ActionListener backButton = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent event) {
                if (event.getSource() == view.getMyJFrame().getDeleteCredentials().getBackButton()) {
                    view.getMyJFrame().setContentPane(view.getMyJFrame().getManagePortfolio());
                    view.getMyJFrame().revalidate();
                }
            }
        };
        //=======================================================
        //Back Button pressed
        //=======================================================
        view.getMyJFrame().getDeleteCredentials().getBackButton().addActionListener(backButton);
        
         
        
        ActionListener deleteButton = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent event) {
                if (event.getSource() == view.getMyJFrame().getDeleteCredentials().getDeleteButton()) {
                    String profileName = view.getMyJFrame().getProfileNameAccess().getProfileName();
                    String categoryName = view.getMyJFrame().getDeleteCredentials().getCategoryName().getText();
                    String credentialName = view.getMyJFrame().getDeleteCredentials().getCredentialName().getText();
                    
                    view.getMyJFrame().getCredentialRemover().removeCredential(profileName, categoryName, credentialName);
                    
                }
                view.getMyJFrame().getDeleteCredentials().getDeleteStatus().setText("Credential Successfully Deleted");
            }
            
        };
        
        //=======================================================
        //Delete Button pressed
        //=======================================================
        view.getMyJFrame().getDeleteCredentials().getDeleteButton().addActionListener(deleteButton);
        
        }
    
    
    
    
    
    @Override
    public void getUserSelection() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void runUserSelection() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
