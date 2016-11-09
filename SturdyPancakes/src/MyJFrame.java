
import javax.swing.*;



public class MyJFrame extends JFrame 
{
    private WelcomeScreen welcome;
    private LoginScreen login;
    private MainMenu mainMenu;
    private ManagePortfolio managePortfolio;
    private GeneratePassword generatePassword;
    private Settings settings;
    private Register register;
    public MyJFrame(String name)
    {
    super(name);
        
        welcome = new WelcomeScreen();
        login = new LoginScreen();
        mainMenu = new MainMenu();
        managePortfolio = new ManagePortfolio();
        generatePassword = new GeneratePassword();
        settings = new Settings();
        register = new Register();
        add(welcome);
        
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(1280,750);
        setResizable(true);
        setVisible(true);  
        getContentPane().getSize();
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
    public ManagePortfolio getManagePortfolio(){
        return managePortfolio;
    }
    public GeneratePassword getGeneratePassword(){
        return generatePassword;
    }
    public Settings getSettings(){
        return settings;
    }
    public Register getRegister(){
        return register;
    }
   public JFrame getMyJFrame(){
       return this;
   }
}
