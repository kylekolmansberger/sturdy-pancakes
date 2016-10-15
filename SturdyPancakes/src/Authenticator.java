
import java.util.*;

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
    
    public Authenticator() {
        login = new String();
        users = new ArrayList<>(5);
        check =  false;
        users.add("Frank Liang password");
        users.add("Danny Khouri password");
        users.add("Nada Ziab password");
        users.add("Kyle Kolmansberger password");
        
       
    }
    public void checkLogin(String string){
        for(int i = 0;i<users.size();i++){
            if(login.equals(users.get(i))){
                    check = true;
                }
                else{
                    check = false;
                }
        }
    }
    public void setLogin(String login){
        this.login = login;
    }
    
    public Boolean getCheck(){
        return check;
    }
}
