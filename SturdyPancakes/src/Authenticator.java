
import java.util.HashMap;
import java.util.Map;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author nadaziab
 */
public class Authenticator {
    String id, password, matchingPassword;
    Map users = new HashMap(); //userID, userPassword
    boolean authenticated = false;
    
    public Authenticator(String id, String password) {
        this.id = id;
        this.password = password;
    }
    public void addTestUsers() {
        users.put("jsmith", "mypassword");
        users.put("teacher14", "schoolisgreat");
        users.put("pennstate12", "gopennstate");
    }
    public void findMathcingPassword() {
        matchingPassword = users.get(id).toString(); //returns password
    }
    
    public boolean matchToPassword() {
        if (password.equals(matchingPassword)) {
            authenticated = true;
            System.out.println("User Authenticated");
        }
        else {
            authenticated = false;
            System.out.println("User Not Authenticated");
        }
        return authenticated;
    }
}
