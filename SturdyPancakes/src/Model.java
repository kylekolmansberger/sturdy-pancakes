
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
    public Model(){
        authenticate = new Authenticator();
        
    }
    
    public Authenticator getAuthenticate(){
        return authenticate;
    }
}
