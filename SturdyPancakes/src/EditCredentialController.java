
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author nadaziab
 */
public class EditCredentialController implements Menu {

    Model model;
    View view;

    public EditCredentialController(Model a, View b) {
        model = a;
        view = b;
        actionListener();
    }

    private void actionListener() {
        ActionListener menuChoice = new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent event) {
                if (event.getSource() == view.getMyJFrame().getManagePortfolio().getEditCredentialsButton()) {
                    view.getMyJFrame().setContentPane(view.getMyJFrame().getEditCredential());
                    view.getMyJFrame().revalidate();
                }
            }
        };
        //=======================================================
        //Menu choice pressed
        //=======================================================
        view.getMyJFrame().getManagePortfolio().getEditCredentialsButton().addActionListener(menuChoice);

        ActionListener backButton = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent event) {
                if (event.getSource() == view.getMyJFrame().getEditCredential().getBackButton()) {
                    view.getMyJFrame().getEditCredential().getCategoryName().setText("");
                    view.getMyJFrame().getEditCredential().getCredentialName().setText("");
                    view.getMyJFrame().getEditCredential().getUsername().setText("");
                    view.getMyJFrame().getEditCredential().getPassword().setText("");
                    view.getMyJFrame().getEditCredential().getEditStatus().setText("");
                    
                    
                    view.getMyJFrame().setContentPane(view.getMyJFrame().getManagePortfolio());
                    view.getMyJFrame().revalidate();
                }
            }
        };
        //=======================================================
        //Back Button pressed
        //=======================================================
        view.getMyJFrame().getEditCredential().getBackButton().addActionListener(backButton);

        ActionListener editButton = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent event) {
                if (event.getSource() == view.getMyJFrame().getEditCredential().getEditButton()) {
                    String profileName = view.getMyJFrame().getProfileNameAccess().getProfileName();
                    String categoryName = view.getMyJFrame().getEditCredential().getCategoryName().getText();
                    String credentialName = view.getMyJFrame().getEditCredential().getCredentialName().getText();
                    String username = view.getMyJFrame().getEditCredential().getUsername().getText();
                    String password = view.getMyJFrame().getEditCredential().getPassword().getText();

                    view.getMyJFrame().getCredentialRemover().removeCredential(profileName, categoryName, credentialName);
                    view.getMyJFrame().getCredentialAdder().addCredential(profileName, categoryName, credentialName, username, password);

                    view.getMyJFrame().getEditCredential().getEditStatus().setText("Credential Updated");
                }

            }
        };
        //=======================================================
        //Edit Button pressed
        //=======================================================
        view.getMyJFrame().getEditCredential().getEditButton().addActionListener(editButton);

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
                    String profileName = view.getMyJFrame().getProfileNameAccess().getProfileName();
                    String categoryName = view.getMyJFrame().getEditCredential().getCategoryName().getText();
                    String credentialName = view.getMyJFrame().getEditCredential().getCredentialName().getText();
                    String username = view.getMyJFrame().getEditCredential().getUsername().getText();
                    String password = view.getMyJFrame().getEditCredential().getPassword().getText();

                    view.getMyJFrame().getCredentialRemover().removeCredential(profileName, categoryName, credentialName);
                    view.getMyJFrame().getCredentialAdder().addCredential(profileName, categoryName, credentialName, username, password);

                    view.getMyJFrame().getEditCredential().getEditStatus().setText("Credential Updated");
                }

            }
        };
        view.getMyJFrame().getEditCredential().getPassword().addKeyListener(pressedKeys);

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
