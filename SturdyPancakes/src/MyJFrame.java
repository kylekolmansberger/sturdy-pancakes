
import javax.swing.*;



public class MyJFrame extends JFrame 
{
    private WelcomeScreen welcome;
    private LoginScreen login;
    private MainMenu mainMenu;
    private ManagePortfolio managePortfolio;
    private GeneratePassword generatePassword;
    private SearchSort searchsort;
    private Register register;
    private CreateCategory createCategory;
    private CreateCredentials createCredentials;
    public MyJFrame(String name)
    {
    super(name);
        
        welcome = new WelcomeScreen();
        login = new LoginScreen();
        mainMenu = new MainMenu();
        managePortfolio = new ManagePortfolio();
        generatePassword = new GeneratePassword();
        searchsort = new SearchSort();
        register = new Register();
        createCategory = new CreateCategory();
        createCredentials = new CreateCredentials();
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
    public SearchSort getSearchSort(){
        return searchsort;
    }
    public Register getRegister(){
        return register;
    }
    public JFrame getMyJFrame(){
       return this;
    }
    public CreateCategory getCreateCategory(){
        return createCategory;
    }
    public CreateCredentials getCreateCredentials(){
        return createCredentials;
    }
}
