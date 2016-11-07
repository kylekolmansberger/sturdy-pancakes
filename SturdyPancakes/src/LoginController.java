
import java.awt.event.*;
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
    private String database;public LoginController(Model a, View b){
        model = a;
        view = b;
        newActionListener();
        database();
        
    
        
    }
    private void database(){
        try{
            Class.forName("sturdydatabase1.jdbc.odbc.JdbcOdbcDriver");
            database = "jdbs:odbc:Driver={Microsoft Access Driver (*.mdb)};DBQ=myDB.mdb;";
            Connection conn = DriverManager.getConnection(database, "","");
            Statement s = conn.createStatement();
            
            String tableName = "myTable" + String.valueOf((int)(Math.random() * 100.00));
            String createTable = "CREATE TABLE " + tableName + "(id Integer, name Text(32))";
            s.execute(createTable);
        }
        catch(Exception ex){
            ex.printStackTrace();
        }
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
            }
            
        };
         view.getMyJFrame().getWelcomeScreen().getClickToContinue().addActionListener(welcomeClicked);
         view.getMyJFrame().getLoginScreen().getLoginButton().addActionListener(loginClicked);
         view.getMyJFrame().getLoginScreen().getHacker().addActionListener(loginClicked);
         view.getMyJFrame().getLoginScreen().getPassword().addKeyListener(pressedKeys);
    }
}
