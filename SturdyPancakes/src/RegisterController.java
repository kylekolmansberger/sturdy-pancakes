
import java.awt.event.*;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

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
                   
                    username = view.getMyJFrame().getLoginScreen().getUsername().toString();
                    password = view.getMyJFrame().getLoginScreen().getPassword().toString();
                    
                    try {
                        loginFile = new File (username + ".txt");

                        // if file doesnt exists, then create it
                        /*
                        if (!loginFile.exists()) {
                            loginFile.createNewFile();
                        }
                                */
                        loginFile.createNewFile();

            FileWriter fw = new FileWriter(loginFile.getAbsoluteFile());
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(password);
            bw.close();

        } catch (IOException e) {
            
        }
                    view.getMyJFrame().getRegister().getRegisterStatus().setText("Registered");
               }
               if(event.getSource() == view.getMyJFrame().getRegister().getBack()){
                   view.getMyJFrame().setContentPane(view.getMyJFrame().getLoginScreen());
               }
            }
        };
        view.getMyJFrame().getRegister().getRegister().addActionListener(register);
        view.getMyJFrame().getRegister().getBack().addActionListener(register);
    }
}
