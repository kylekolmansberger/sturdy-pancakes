
import java.awt.event.*;
import javax.swing.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author fyl5079
 */
public class LoginController {
    private Model model;
    private View view;
    public LoginController(Model a, View b){
        model = a;
        view = b;
        newActionListener();
    }
    
    private void newActionListener(){ 
        //=======================================================
        //Welcome Screen
        //=======================================================
        ActionListener welcomeClicked = new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent event)
            {
               if(event.getSource() == view.getMyJFrame().getWelcomeScreen().getClickToContinue()){
                   view.getMyJFrame().setContentPane(view.getMyJFrame().getLoginScreen());
                   view.getMyJFrame().revalidate();
               }
            }
        };
        //=======================================================
        //Login Screen
        //=======================================================
        ActionListener loginClicked = new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent event)
            {
               if(event.getSource() == view.getMyJFrame().getLoginScreen().getLoginButton()){
                   System.out.println(view.getMyJFrame().getLoginScreen().getUsername().getText()+ " " + view.getMyJFrame().getLoginScreen().getPassword().getText());
                   model.getAuthenticate().setLogin(view.getMyJFrame().getLoginScreen().getUsername().getText()+ " " + view.getMyJFrame().getLoginScreen().getPassword().getText());
                   model.getAuthenticate().checkLogin(view.getMyJFrame().getLoginScreen().getUsername().getText()+ " " + view.getMyJFrame().getLoginScreen().getPassword().getText());
                   if(model.getAuthenticate().getCheck()==true){
                       
                       view.getMyJFrame().setContentPane(view.getMyJFrame().getMainMenu());
                       view.getMyJFrame().revalidate();
                       view.getMyJFrame().getLoginScreen().getUsername().setText("");
                       view.getMyJFrame().getLoginScreen().getPassword().setText("");
                   }
                   else{
                       System.out.println("Incorrect Login");
                       view.getMyJFrame().getLoginScreen().getUsername().setText("");
                       view.getMyJFrame().getLoginScreen().getPassword().setText("");
                       view.getMyJFrame().getLoginScreen().getLoginStatus().setText("Invalid Login");
                   }
                   
               }
               if(event.getSource() == view.getMyJFrame().getLoginScreen().getHacker()){
                   view.getMyJFrame().setContentPane(view.getMyJFrame().getMainMenu());
                       view.getMyJFrame().revalidate();
               }
            }
        };
        //=======================================================
        //Adding Action Listeners
        //=======================================================
         view.getMyJFrame().getWelcomeScreen().getClickToContinue().addActionListener(welcomeClicked);
         view.getMyJFrame().getLoginScreen().getLoginButton().addActionListener(loginClicked);
         view.getMyJFrame().getLoginScreen().getHacker().addActionListener(loginClicked);
    }
}
