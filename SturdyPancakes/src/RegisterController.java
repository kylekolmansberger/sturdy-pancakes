
import java.awt.event.*;
import java.io.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author fyl5079
 */
public class RegisterController{
    private Model model;
    private View view;
    String username, password;
    private File loginFile;
    public RegisterController(Model a, View b){
        super();
        model = a;
        view = b;
        newActionListener();
    }
    private void newActionListener(){ 
        //=======================================================
        //Register
        //=======================================================
        ActionListener register = new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent event)
            {
               if(event.getSource() == view.getMyJFrame().getRegister().getRegister()){
                   
                    username = view.getMyJFrame().getRegister().getUsername().getText();
                    username = username.replaceAll(" ", "#");
                    password = view.getMyJFrame().getRegister().getPassword().getText();
                    
                    
                    try {
                        loginFile = new File ("logins.txt");

                        // if file doesnt exists, then create it
                        
                        if (!loginFile.exists()) {
                            loginFile.createNewFile();
                        }
                       
                        FileWriter fw = new FileWriter(loginFile,true);
                        PrintWriter pw = new PrintWriter(fw);
                        pw.write(" " +username + "#" + password + " ");
                        pw.close();
                    } 
                    catch (IOException e) {
                        System.out.println("Failed");
                    }
                    view.getMyJFrame().getRegister().getRegisterStatus().setText("Registered");
                }
                    if(event.getSource() == view.getMyJFrame().getRegister().getBack()){
                    view.getMyJFrame().setContentPane(view.getMyJFrame().getLoginScreen());
                    view.getMyJFrame().getRegister().getRegisterStatus().setText("");
               }
            }
        };
        view.getMyJFrame().getRegister().getRegister().addActionListener(register);
        view.getMyJFrame().getRegister().getBack().addActionListener(register);
    }
}
