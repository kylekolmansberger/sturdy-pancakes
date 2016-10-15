
import javax.swing.*;

public class Main 
{
    
    public static void main(String[]args)
    {
        Model model = new Model();
        View view = new View(model);
        LoginController loginController = new LoginController(model, view);
        MainMenuController mainController = new MainMenuController(model, view);
    }
}
