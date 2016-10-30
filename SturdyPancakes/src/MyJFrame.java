
import javax.swing.*;



public class MyJFrame extends JFrame 
{
    private WelcomeScreen welcome;
    private LoginScreen login;
    private MainMenu mainMenu;
    private EditPortfolio editPortfolio;
    private GeneratePassword generatePassword;
    private Settings settings;
    public MyJFrame(String name)
    {
    super(name);
        
        welcome = new WelcomeScreen();
        login = new LoginScreen();
        mainMenu = new MainMenu();
        editPortfolio = new EditPortfolio();
        generatePassword = new GeneratePassword();
        settings = new Settings();
        
        add(welcome);
        
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(1280,750);
        setResizable(true);
        setVisible(true);   
        
    }
    public WelcomeScreen getWelcomeScreen(){
        return welcome;
    }
    public LoginScreen getLoginScreen(){
        return login;
    }
    public MainMenu getMainMenu(){
        return mainMenu;
    }
    public EditPortfolio getEditPortfolio(){
        return editPortfolio;
    }
    public GeneratePassword getGeneratePassword(){
        return generatePassword;
    }
    public Settings getSettings(){
        return settings;
    }
   
}
