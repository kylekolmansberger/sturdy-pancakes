
import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Frank
 */
public class Encryption {
        Cipher ecipher;
        Cipher dcipher;
    public Encryption(SecretKey key)throws Exception{
        ecipher = Cipher.getInstance("DES");
        dcipher = Cipher.getInstance("DES");
        ecipher.init(Cipher.ENCRYPT_MODE, key);
        dcipher.init(Cipher.DECRYPT_MODE,key);
    }
    public String encrypt(String text) throws Exception{
        byte[] utf8 = text.getBytes("UTF8");
        byte[] enc = ecipher.doFinal(utf8);
        return new sun.misc.BASE64Encoder().encode(enc);
    }
    
    public String decrypt(String text) throws Exception{
        byte[] dec = new sun.misc.BASE64Decoder().decodeBuffer(text);
        byte[] utf8 = dcipher.doFinal(dec);
        return new String(utf8, "UTF8");
    }

    
}
