
import java.awt.event.*;
import java.io.*;
import javax.swing.*;
import javax.swing.ActionMap;
import java.sql.*;
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
                    view.getMyJFrame().getLoginScreen().getUsername().requestFocusInWindow();
                    view.getMyJFrame().getWelcomeScreen().getPancake().getTim().stop();
                    view.getMyJFrame().getWelcomeScreen().getPancake2().getTim().stop();
                    view.getMyJFrame().getWelcomeScreen().getPancake3().getTim().stop();
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
                   
                   
                   
                   model.getAuthenticate().setLogin(view.getMyJFrame().getLoginScreen().getUsername().getText()+ "#" + view.getMyJFrame().getLoginScreen().getPassword().getText());
                   model.getAuthenticate().checkLogin(view.getMyJFrame().getLoginScreen().getUsername().getText()+ "#" + view.getMyJFrame().getLoginScreen().getPassword().getText());
                   
                   if(model.getAuthenticate().getCheck()==true){
                       view.getMyJFrame().getProfileNameAccess().setProfileName(view.getMyJFrame().getLoginScreen().getUsername().getText());
                       view.getMyJFrame().setContentPane(view.getMyJFrame().getMainMenu());
                       view.getMyJFrame().revalidate();
                       view.getMyJFrame().getLoginScreen().getUsername().setText("");
                       view.getMyJFrame().getLoginScreen().getPassword().setText("");
                   }
                   else{
                       System.out.println("Incorrect Login");
                       view.getMyJFrame().getLoginScreen().getPassword().setText("");
                       view.getMyJFrame().getLoginScreen().getLoginStatus().setText("Invalid Login");
                   }
               }
               if(event.getSource() == view.getMyJFrame().getLoginScreen().getRegister()){
                    view.getMyJFrame().setContentPane(view.getMyJFrame().getRegister());
                    view.getMyJFrame().revalidate();
               }
            }
        };
        KeyListener pressedKeys = new KeyListener(){
            @Override
            public void keyTyped(KeyEvent event) {
            }
            @Override
            public void keyReleased(KeyEvent event) {
            }
            @Override
            public void keyPressed(KeyEvent event) {
                int action = event.getKeyCode();
                if(action == event.VK_ENTER)
                {
                    model.getAuthenticate().setLogin(view.getMyJFrame().getLoginScreen().getUsername().getText().replace(" ", "#")+ "#" + view.getMyJFrame().getLoginScreen().getPassword().getText());
                    model.getAuthenticate().checkLogin(view.getMyJFrame().getLoginScreen().getUsername().getText()+ "#" + view.getMyJFrame().getLoginScreen().getPassword().getText());
                    System.out.println(model.getAuthenticate().getLogin());
                    if(model.getAuthenticate().getCheck()==true){
                       view.getMyJFrame().getProfileNameAccess().setProfileName(view.getMyJFrame().getLoginScreen().getUsername().getText());
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
            }
        };
         view.getMyJFrame().getWelcomeScreen().getClickToContinue().addActionListener(welcomeClicked);
         view.getMyJFrame().getLoginScreen().getLoginButton().addActionListener(loginClicked);
         view.getMyJFrame().getLoginScreen().getPassword().addKeyListener(pressedKeys);
         view.getMyJFrame().getLoginScreen().getRegister().addActionListener(loginClicked);
         
    }
}
