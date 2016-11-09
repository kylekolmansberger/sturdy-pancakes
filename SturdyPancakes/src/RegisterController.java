
import java.awt.event.*;

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
                    view.getMyJFrame().getRegister().getRegisterStatus().setText("Registered");
               }
            }
        };
        view.getMyJFrame().getRegister().getRegister().addActionListener(register);
    }
}
