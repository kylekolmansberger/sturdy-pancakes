
import java.awt.event.*;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author kck5178
 */
public class CreateCategoryController implements Menu {

    private Model model;
    private View view;

    String profileName, username, categoryName;
    private File categoryFile;

    public CreateCategoryController(Model a, View b) {
        model = a;
        view = b;
        menuChoice();
    }

    private void menuChoice() {

        ActionListener menuChoice = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent event) {
                if (event.getSource() == view.getMyJFrame().getManagePortfolio().getCreateCategoryButton()) {
                    view.getMyJFrame().setContentPane(view.getMyJFrame().getCreateCategory());
                    view.getMyJFrame().getCreateCategory().getCategoryName().setText("");
                    view.getMyJFrame().getCreateCategory().getCreateStatus().setText("");
                    view.getMyJFrame().revalidate();
                }
            }
        };
        //=======================================================
        //Menu choice pressed
        //=======================================================

        view.getMyJFrame().getManagePortfolio().getCreateCategoryButton().addActionListener(menuChoice);
        ActionListener backButton = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent event) {
                if (event.getSource() == view.getMyJFrame().getCreateCategory().getBackButton()) {
                    view.getMyJFrame().setContentPane(view.getMyJFrame().getManagePortfolio());
                    view.getMyJFrame().revalidate();
                }
            }
        };
        //=======================================================
        //Back Button pressed
        //=======================================================
        view.getMyJFrame().getCreateCategory().getBackButton().addActionListener(backButton);

        ActionListener categorySave = new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent event) {

                if (event.getSource() == view.getMyJFrame().getCreateCategory().getCreateButton()) {
                    profileName = view.getMyJFrame().getProfileNameAccess().getProfileName();
                    categoryName = view.getMyJFrame().getCreateCategory().getCategoryName().getText();

                    try {
                        categoryFile = new File("SuperSecretStuff/" + profileName + "/" + categoryName + ".txt");

                        // if file doesnt exists, then create it
                        if (!categoryFile.exists()) {
                            categoryFile.createNewFile();
                            view.getMyJFrame().getCreateCategory().getCreateStatus().setText("Created");
                        }
                        else {
                            view.getMyJFrame().getCreateCategory().getCreateStatus().setText("Failed: category already exists");
                        }

                    } catch (IOException e) {
                        System.out.println("Failed");
                    }
                }
                
            }
        };
        //=======================================================
        //Create Category button pressed
        //=======================================================
        view.getMyJFrame().getCreateCategory().getCreateButton().addActionListener(categorySave);

        
        
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
                    profileName = view.getMyJFrame().getProfileNameAccess().getProfileName();
                    categoryName = view.getMyJFrame().getCreateCategory().getCategoryName().getText();

                    try {
                        categoryFile = new File("SuperSecretStuff/" + profileName + "/" + categoryName + ".txt");

                        // if file doesnt exists, then create it
                        if (!categoryFile.exists()) {
                            categoryFile.createNewFile();
                            view.getMyJFrame().getCreateCategory().getCreateStatus().setText("Created");
                        }
                        else {
                            view.getMyJFrame().getCreateCategory().getCreateStatus().setText("Failed: category already exists");
                        }

                    } catch (IOException e) {
                        //System.out.println("Failed");
                    }
                }
                
            }

        };
        //=======================================================
        //Enter button pressed
        //=======================================================
        view.getMyJFrame().getCreateCategory().getCategoryName().addKeyListener(pressedKeys);
    }

    @Override
    public void getUserSelection() {

    }

    @Override
    public void runUserSelection() {

    }

}
