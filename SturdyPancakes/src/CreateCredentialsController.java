
import java.awt.event.*;
import java.io.IOException;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
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

    public CreateCredentialsController(Model a, View b) {
        model = a;
        view = b;
        menuChoice();
    }

    private void menuChoice() {

        ActionListener menuChoice = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent event) {
                if (event.getSource() == view.getMyJFrame().getManagePortfolio().getCreateCredentialsButton()) {
                    view.getMyJFrame().getCreateCredentials().getCredentialName().setText("");
                    view.getMyJFrame().getCreateCredentials().getUsername().setText("");
                    view.getMyJFrame().getCreateCredentials().getPassword().setText("");
                    view.getMyJFrame().getCreateCredentials().getCategory().setText("");
                    view.getMyJFrame().getCreateCredentials().getCreateStatus().setText("");
                    view.getMyJFrame().setContentPane(view.getMyJFrame().getCreateCredentials());
                    view.getMyJFrame().revalidate();
                }
            }
        };
        //=======================================================
        //Menu choice pressed
        //=======================================================

        view.getMyJFrame().getManagePortfolio().getCreateCredentialsButton().addActionListener(menuChoice);
        ActionListener backButton = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent event) {
                if (event.getSource() == view.getMyJFrame().getCreateCredentials().getBackButton()) {
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
        createCredential = new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent event) {
                if (event.getSource() == view.getMyJFrame().getCreateCredentials().getCreateButton()) {
                    
                    credentialName = view.getMyJFrame().getCreateCredentials().getCredentialName().getText();
                    try {
                        username = model.getEncryption().encrypt(view.getMyJFrame().getCreateCredentials().getUsername().getText());
                    
                        password = model.getEncryption().encrypt(view.getMyJFrame().getCreateCredentials().getPassword().getText());
                        
                    } catch (Exception ex) {
                        Logger.getLogger(CreateCredentialsController.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    category = view.getMyJFrame().getCreateCredentials().getCategory().getText();
                    profileName = view.getMyJFrame().getProfileNameAccess().getProfileName();

                    
                    view.getMyJFrame().getCredentialAdder().addCredential(profileName, category, credentialName, username, password);
                    view.getMyJFrame().getCreateCredentials().getCreateStatus().setText("Created");
                }

            }

        };

        //=======================================================
        //Create Credential Button pressed
        //=======================================================
        view.getMyJFrame().getCreateCredentials().getCreateButton().addActionListener(createCredential);

        KeyListener pressedKeys = new KeyListener() {
            @Override
            public void keyTyped(KeyEvent event) {
            }

            @Override
            public void keyReleased(KeyEvent event) {
            }

            @Override
            public void keyPressed(KeyEvent event) {
                int action = event.getKeyCode();
                if (action == event.VK_ENTER) {
                    credentialName = view.getMyJFrame().getCreateCredentials().getCredentialName().getText();
                    try {
                        username = model.getEncryption().encrypt(view.getMyJFrame().getCreateCredentials().getUsername().getText());
                        password = model.getEncryption().encrypt(view.getMyJFrame().getCreateCredentials().getPassword().getText());
                    } catch (Exception ex) {
                        Logger.getLogger(CreateCredentialsController.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    
                    category = view.getMyJFrame().getCreateCredentials().getCategory().getText();
                    profileName = view.getMyJFrame().getProfileNameAccess().getProfileName();

                    view.getMyJFrame().getCredentialAdder().addCredential(profileName, category, credentialName, username, password);
                    view.getMyJFrame().getCreateCredentials().getCreateStatus().setText("Created");
                }

            }
        };
        view.getMyJFrame().getCreateCredentials().getCategory().addKeyListener(pressedKeys);
    }

    @Override
    public void getUserSelection() {

    }

    @Override
    public void runUserSelection() {

    }

}
