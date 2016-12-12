
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.File;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author nadaziab
 */
public class EditCategoryController implements Menu {

    private Model model;
    private View view;

    public EditCategoryController(Model a, View b) {
        model = a;
        view = b;
        menuChoice();
    }

    private void menuChoice() {

        ActionListener menuChoice = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent event) {
                if (event.getSource() == view.getMyJFrame().getManagePortfolio().getEditCategoryButton()) {
                    view.getMyJFrame().setContentPane(view.getMyJFrame().getEditCategory());
                    view.getMyJFrame().revalidate();
                }
            }
        };
        //=======================================================
        //Menu choice pressed
        //=======================================================
        view.getMyJFrame().getManagePortfolio().getEditCategoryButton().addActionListener(menuChoice);

        ActionListener backButton = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent event) {
                if (event.getSource() == view.getMyJFrame().getEditCategory().getBackButton()) {
                    view.getMyJFrame().getEditCategory().getCategoryName().setText("");
                    view.getMyJFrame().getEditCategory().getNewCategoryName().setText("");
                    view.getMyJFrame().setContentPane(view.getMyJFrame().getManagePortfolio());
                    view.getMyJFrame().revalidate();
                }
            }
        };
        //=======================================================
        //Back Button pressed
        //=======================================================
        view.getMyJFrame().getEditCategory().getBackButton().addActionListener(backButton);

        ActionListener editButton = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent event) {
                if (event.getSource() == view.getMyJFrame().getEditCategory().getEditButton()) {
                    String categoryName = view.getMyJFrame().getEditCategory().getCategoryName().getText();
                    String newCategoryName = view.getMyJFrame().getEditCategory().getNewCategoryName().getText();
                    String profileName = view.getMyJFrame().getProfileNameAccess().getProfileName();
                    File file1 = new File("SuperSecretStuff/" + profileName + "/" + categoryName + ".txt");
                    File file2 = new File("SuperSecretStuff/" + profileName + "/" + newCategoryName + ".txt");
                    if (file1.exists()) {
                        file1.renameTo(file2);
                        view.getMyJFrame().getEditCategory().getEditStauts().setText("Category Renamed");
                    } else {
                        //file doesn't exist
                        //System.out.println("no file");
                        view.getMyJFrame().getEditCategory().getEditStauts().setText("Category doesn't exist");
                    }

                }

            }
        };
        //=======================================================
        //Edit Category Button pressed
        //=======================================================
        view.getMyJFrame().getEditCategory().getEditButton().addActionListener(editButton);

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
                    String categoryName = view.getMyJFrame().getEditCategory().getCategoryName().getText();
                    String newCategoryName = view.getMyJFrame().getEditCategory().getNewCategoryName().getText();
                    String profileName = view.getMyJFrame().getProfileNameAccess().getProfileName();
                    File file1 = new File("SuperSecretStuff/" + profileName + "/" + categoryName + ".txt");
                    File file2 = new File("SuperSecretStuff/" + profileName + "/" + newCategoryName + ".txt");
                    if (file1.exists()) {
                        file1.renameTo(file2);
                        view.getMyJFrame().getEditCategory().getEditStauts().setText("Category Renamed");
                    } else {
                        //file doesn't exist
                        //System.out.println("no file");
                        view.getMyJFrame().getEditCategory().getEditStauts().setText("Category doesn't exist");
                    }
                }

            }
        };
        view.getMyJFrame().getEditCategory().getNewCategoryName().addKeyListener(pressedKeys);

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
