
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
public class DeleteCategoryController implements Menu {

    private Model model;
    private View view;

    public DeleteCategoryController(Model a, View b) {
        model = a;
        view = b;
        menuChoice();
    }

    private void menuChoice() {

        ActionListener menuChoice = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent event) {
                if (event.getSource() == view.getMyJFrame().getManagePortfolio().getDeleteCategoryButton()) {
                    view.getMyJFrame().getDeleteCategory().getDeleteStatus().setText("");
                    view.getMyJFrame().getDeleteCategory().getCategoryName().setText("");
                    view.getMyJFrame().setContentPane(view.getMyJFrame().getDeleteCategory());
                    view.getMyJFrame().revalidate();
                }
            }
        };
        //=======================================================
        //Menu choice pressed
        //=======================================================
        view.getMyJFrame().getManagePortfolio().getDeleteCategoryButton().addActionListener(menuChoice);

        ActionListener backButton = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent event) {
                if (event.getSource() == view.getMyJFrame().getDeleteCategory().getBackButton()) {
                    view.getMyJFrame().setContentPane(view.getMyJFrame().getManagePortfolio());
                    view.getMyJFrame().revalidate();
                }
            }
        };
        //=======================================================
        //Back Button pressed
        //=======================================================
        view.getMyJFrame().getDeleteCategory().getBackButton().addActionListener(backButton);

        ActionListener deleteButton = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent event) {
                if (event.getSource() == view.getMyJFrame().getDeleteCategory().getDeleteButton()) {
                    String categoryName = view.getMyJFrame().getDeleteCategory().getCategoryName().getText();
                    String profileName = view.getMyJFrame().getProfileNameAccess().getProfileName();
                    File file = new File("SuperSecretStuff/" + profileName + "/" + categoryName + ".txt");

                    file.delete();
                    view.getMyJFrame().getDeleteCategory().getDeleteStatus().setText("Category Successfully Deleted");
                }

            }
        };
        //=======================================================
        //Delete Button pressed
        //=======================================================

        view.getMyJFrame().getDeleteCategory().getDeleteButton().addActionListener(deleteButton);

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
                    String categoryName = view.getMyJFrame().getDeleteCategory().getCategoryName().getText();
                    String profileName = view.getMyJFrame().getProfileNameAccess().getProfileName();
                    File file = new File("SuperSecretStuff/" + profileName + "/" + categoryName + ".txt");

                    file.delete();
                    view.getMyJFrame().getDeleteCategory().getDeleteStatus().setText("Category Deleted");
                }

            }
        };
        view.getMyJFrame().getDeleteCategory().getCategoryName().addKeyListener(pressedKeys);

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
