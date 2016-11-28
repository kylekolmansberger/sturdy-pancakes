import java.awt.event.*;

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
        
    }

    @Override
    public void getUserSelection() {
       
    }

    @Override
    public void runUserSelection() {
      
    }

}