
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

    String username, categoryName;
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
                    username = view.getMyJFrame().getLoginScreen().getUsername().getText();
                    categoryName = view.getMyJFrame().getCreateCategory().getCategoryName().getText();

                    //new File("SuperSecretStuff/" + username + "/" + categoryName).mkdir();
                    try {
                        categoryFile = new File("SuperSecretStuff/" + username + "/" + categoryName + ".txt");

                        // if file doesnt exists, then create it
                        if (!categoryFile.exists()) {
                            categoryFile.createNewFile();

                        }

                        /*
                         FileWriter fw = new FileWriter(categoryFile, true);
                         PrintWriter pw = new PrintWriter(fw);
                         pw.write(" " + username + "#" + password + " ");
                         pw.close();
                         */
                    } catch (IOException e) {
                        System.out.println("Failed");
                    }
                }
            }
        };
        //=======================================================
        //Create Category button pressed
        //=======================================================
        view.getMyJFrame().getManagePortfolio().getCreateCategoryButton().addActionListener(categorySave);
        
    }

    @Override
    public void getUserSelection() {

    }

    @Override
    public void runUserSelection() {

    }

}
