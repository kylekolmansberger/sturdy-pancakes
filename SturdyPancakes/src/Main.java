
import javax.swing.*;

public class Main 
{
    
    public static void main(String[]args)
    {
        Authenticator a = new Authenticator();
        a.addTestUsers();
        a.getUserCredentials();
        a.findMathcingPassword();
        if (a.matchToPassword() == true) {
            MyJFrame initial = new MyJFrame("Sturdy Pancakes - Credential Manager");
        }
        else {
            
        }
        
        

    }
}
