
import javax.swing.*;



public class MyJFrame extends JFrame 
{
    private WelcomeScreen welcome;
    private LoginScreen login;
    private MainMenu mainMenu;
    private ManagePortfolio managePortfolio;
    private GeneratePassword generatePassword;
    private ViewPortfolio viewPortfolio;
    private Register register;
    private CreateCategory createCategory;
    private EditCategory editCategory;
    private DeleteCategory deleteCategory;
    private CreateCredentials createCredentials;
    private EditCredential editCredential;
    private DeleteCredential deleteCredential;
    private ProfileNameAccess profileNameAccess;
    private SavedPortfolios savedPortfolios;
    private CredentialRemover credentialRemover;
    private CredentialAdder credentialAdder;
    public MyJFrame(String name)
    {
    super(name);
        
        welcome = new WelcomeScreen();
        login = new LoginScreen();
        mainMenu = new MainMenu();
        managePortfolio = new ManagePortfolio();
        generatePassword = new GeneratePassword();
        viewPortfolio = new ViewPortfolio();
        register = new Register();
        createCategory = new CreateCategory();
        editCategory = new EditCategory();
        deleteCategory = new DeleteCategory();
        createCredentials = new CreateCredentials();
        editCredential = new EditCredential();
        deleteCredential = new DeleteCredential();
        profileNameAccess = new ProfileNameAccess();
        savedPortfolios = new SavedPortfolios();
        credentialRemover = new CredentialRemover();
        credentialAdder = new CredentialAdder();
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
    public ViewPortfolio getViewPortfolio(){
        return viewPortfolio;
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
    public EditCategory getEditCategory() {
        return editCategory;
    }
    public DeleteCategory getDeleteCategory() {
        return deleteCategory;
    }
    public CreateCredentials getCreateCredentials(){
        return createCredentials;
    }
    public EditCredential getEditCredential() {
        return editCredential;
    }
    public DeleteCredential getDeleteCredentials() {
        return deleteCredential;
    }
    public ProfileNameAccess getProfileNameAccess() {
        return profileNameAccess;
    }
    public SavedPortfolios getSavedPortfolios() {
        return savedPortfolios;
    }
    public CredentialRemover getCredentialRemover() {
        return credentialRemover;
    }
    public CredentialAdder getCredentialAdder() {
        return credentialAdder;
    }
}
