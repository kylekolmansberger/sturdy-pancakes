
import java.io.*;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

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
    private String login;
    private ArrayList<String> users;
    private Boolean check;
    private File logins;
    
    public Authenticator(){
        logins = new File("SuperSecretStuff/logins.txt");
        try {
            login = new String();
            users = new ArrayList<>();
            check =  false;
            
            Scanner scanner = new Scanner(logins);
            
            while (scanner.hasNext()){
                users.add(scanner.next());
            }
            scanner.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Authenticator.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void checkLogin(String string){
        for(int i = 0;i<users.size();i++){
            if(login.equals(users.get(i))){
                System.out.println(users.get(i));
                check = true;
                break;
            }
            else{
                check = false;
            }
        }
    }
    public void setLogin(String login){
        this.login = login;
    }
    public String getLogin(){
        return login;
    }
    public Boolean getCheck(){
        return check;
    }
    public ArrayList<String> getUsers(){
        return users;
    }
}
