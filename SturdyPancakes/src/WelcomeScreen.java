
import java.awt.*;
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
public class WelcomeScreen extends JPanel implements ActionListener{
    private JButton clickToContinue;
    public WelcomeScreen(){
        super();
        setVisible(true);
        setBackground(Color.blue);
        setLayout(new BorderLayout());
        clickToContinue = new JButton("Click to Continue");
       
        add(clickToContinue, BorderLayout.CENTER);
        
    }

    @Override
    public void actionPerformed(ActionEvent event) {
       if(event.getSource()== event){
           System.out.println("Clicked");
       }
    }
}
