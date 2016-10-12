import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;



public class MyJFrame extends JFrame 
{
    public MyJFrame(String name)
    {
    super (name);
        
        MyJPanel initial = new MyJPanel();
        add(initial);
        
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(1280,750);
        setResizable(true);
        setVisible(true);   
        
        
    }
}
