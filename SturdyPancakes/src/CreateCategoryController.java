import java.awt.event.*;
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
    public CreateCategoryController (Model a, View b) {
        model = a;
        view = b;
        menuChoice();
    }
    private void menuChoice(){ 
        
    
    ActionListener menuChoice = new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent event){
                if(event.getSource() == view.getMyJFrame().getManagePortfolio().getCreateCategoryButton()){
                    view.getMyJFrame().setContentPane(view.getMyJFrame().getCreateCategory());
                    view.getMyJFrame().revalidate();
                }
                if(event.getSource() == view.getMyJFrame().getMainMenu().getB2()){
                    view.getMyJFrame().setContentPane(view.getMyJFrame().getGeneratePassword());
                    view.getMyJFrame().revalidate();
                }
                if(event.getSource() == view.getMyJFrame().getMainMenu().getB3()){
                    view.getMyJFrame().setContentPane(view.getMyJFrame().getSettings());
                    view.getMyJFrame().revalidate();
                }
            }
        };
        //=======================================================
        //Menu choice pressed
        //=======================================================
        ActionListener backButton = new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent event){

                if (event.getSource() == view.getMyJFrame().getMainMenu().getBackButton()){
                    if (JOptionPane.showConfirmDialog(null, "Are you sure?", "Logout",
                        JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) 
                        {
                        view.getMyJFrame().setContentPane(view.getMyJFrame().getLoginScreen());
                        view.getMyJFrame().revalidate();
                        } else {
                        view.getMyJFrame().setContentPane(view.getMyJFrame().getMainMenu());
                        view.getMyJFrame().revalidate();
                        }
                  
                }
            }
        };
        //=======================================================
        //Adding Action Listeners
        //=======================================================
        view.getMyJFrame().getManagePortfolio().getCreateCategoryButton().addActionListener(menuChoice);
        
    }

    @Override
    public void getUserSelection() {
       
    }

    @Override
    public void runUserSelection() {
      
    }

}
