
import javax.swing.*;

public class Main 
{
    
    public static void main(String[]args)
    {
        Model model = new Model();
        View view = new View(model);
        Controller controller = new Controller(model, view);
        
        /*
        Authenticator a = new Authenticator();
        a.addTestUsers();
        a.getUserCredentials();
        a.findMathcingPassword();
        if (a.matchToPassword() == true) {
            MyJFrame initial = new MyJFrame("Sturdy Pancakes - Credential Manager");
        }
        else {
            
        }
        */
        

    }
}
