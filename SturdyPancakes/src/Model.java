
import java.util.Base64;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;


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
    private Encryption encryption;
    private byte[] myKey;
    public Model() throws Exception{
        myKey = Base64.getDecoder().decode("BestKeyEver");
        SecretKey originalKey = new SecretKeySpec(myKey, 0, myKey.length, "DES"); 
        authenticate = new Authenticator();
        generator = new PasswordGeneratorModel();
        categoryManager = new CategoryModel();
        credentialManager = new CredentialModel();
        encryption = new Encryption(originalKey);
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
    public Encryption getEncryption(){
        return encryption;
    }
}
