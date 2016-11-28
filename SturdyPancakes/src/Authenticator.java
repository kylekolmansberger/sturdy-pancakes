
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
    
    public Authenticator(){
        try {
            login = new String();
            users = new ArrayList<>();
            check =  false;
            /*users.add("Frank Liang password");
            users.add("Danny Khouri password");
            users.add("Nada Ziab password");
            users.add("Kyle Kolmansberger password");
            users.add("Test User password");
            */
            Scanner scanner = new Scanner(new File("logins.txt"));
            
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
}
