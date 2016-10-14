
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

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
    
    public Authenticator() {
        
    }
    public void addTestUsers() {
        users.put("jsmith", "mypassword");
        users.put("teacher14", "schoolisgreat");
        users.put("pennstate12", "gopennstate");
    }
    
    public void getUserCredentials() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your ID: ");
        id = in.next();
        System.out.print("Enter your password: ");
        password = in.next();
    }
    
    public void findMathcingPassword() {
        matchingPassword = users.get(id).toString();
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
