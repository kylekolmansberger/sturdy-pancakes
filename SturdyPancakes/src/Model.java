
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author fyl5079
 */
public class Model {
    private Authenticator authenticate;
    private PasswordGeneratorModel generator;
    private CategoryModel categoryManager;
    private CredentialModel credentialManager;
    public Model(){
        authenticate = new Authenticator();
        generator = new PasswordGeneratorModel();
        categoryManager = new CategoryModel();
        credentialManager = new CredentialModel();
    }
    
    public Authenticator getAuthenticate(){
        return authenticate;
    }
    public PasswordGeneratorModel getGenerator(){
        return generator;
    }
    public CategoryModel getCategoryManager() {
        return categoryManager;
    }
    public CredentialModel getCredentialManager() {
        return credentialManager;
    }
}
