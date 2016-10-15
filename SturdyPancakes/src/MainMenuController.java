
import java.awt.event.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Frank
 */
public class MainMenuController implements Menu{
    private Model model;
    private View view;
    public MainMenuController (Model a, View b) {
        model = a;
        view = b;
        newActionListener();
    }
    
     private void newActionListener(){ 
        //=======================================================
        //Menu choice pressed
        //=======================================================
        ActionListener menuChoice = new ActionListener(){
            
            
            @Override
            public void actionPerformed(ActionEvent event){
                if(event.getSource() == view.getMyJFrame().getMainMenu().getB1()){
                    view.getMyJFrame().setContentPane(view.getMyJFrame().getEditPortfolio());
                    view.getMyJFrame().revalidate();
                    System.out.println("clicked");
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
        //Adding Action Listeners
        //=======================================================
        view.getMyJFrame().getMainMenu().getB1().addActionListener(menuChoice);
        view.getMyJFrame().getMainMenu().getB2().addActionListener(menuChoice);
        view.getMyJFrame().getMainMenu().getB3().addActionListener(menuChoice);
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
