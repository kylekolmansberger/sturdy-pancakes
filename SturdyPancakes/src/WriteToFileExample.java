/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author nadaziab
 */
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class WriteToFileExample {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        String everything;
        /*
        Map m1 = new HashMap();
        m1.put("username1", "password1");
        m1.put("username2", "password2");
        m1.put("username3", "password3");
        */
        
        String u1, u2, u3;
        String p1, p2, p3;
        String s1, s2, s3;
        
        u1 = "username1";
        u2 = "username2";
        u3 = "username3";
        p1 = "password1";
        p2 = "password2";
        p3 = "password3";
        
        //String usernames = m1.keySet().toString();
        
        
        ArrayList<String> usernames = new ArrayList<>();
        ArrayList<String> passwords = new ArrayList<>();
        ArrayList<String> labels = new ArrayList<>();
                
        usernames.add(u1);
        usernames.add(u2);
        usernames.add(u3);
        
        passwords.add(p1);
        passwords.add(p2);
        passwords.add(p3);
        
        labels.add("Facebook");
        labels.add("Twitter");
        labels.add("Instagram");
        
        s1 = labels.get(0) + " " + usernames.get(0) + " " + passwords.get(0);
        s2 = labels.get(1) + " " + usernames.get(1) + " " + passwords.get(1);
        s3 = labels.get(2) + " " + usernames.get(2) + " " + passwords.get(2);
        
        
        
        
        
        try {

            String content = "This is the content to write into file";

            File file = new File("myfile.txt");

            // if file doesnt exists, then create it
            if (!file.exists()) {
                file.createNewFile();
            }

            FileWriter fw = new FileWriter(file.getAbsoluteFile());
            BufferedWriter bw = new BufferedWriter(fw);
            //bw.write(content);
            bw.write(s1);
            bw.newLine();
            bw.write(s2);
            bw.newLine();
            bw.write(s3);
            
            bw.close();


        } catch (IOException e) {
            e.printStackTrace();
        }

        BufferedReader br = new BufferedReader(new FileReader("myfile.txt"));
        try {
            StringBuilder sb = new StringBuilder();
            String line = br.readLine();

            while (line != null) {
                sb.append(line);
                sb.append(System.lineSeparator());
                line = br.readLine();
            }
            everything = sb.toString();
            
        } finally {
            br.close();
        }
       
        //System.out.println(everything);
        String[] tokens = everything.split("\\s+");
        //System.out.println(tokens.length);
        
        ArrayList<String> a1 = new ArrayList<>(); //usernames
        ArrayList<String> a2 = new ArrayList<>(); //passwords
        ArrayList<String> a3 = new ArrayList<>(); //labels
        
        
        
        for (int i = 0; i < tokens.length; i++) {
            if (i%2 == 0) {
                a1.add(tokens[i]);
            }
            else {
                a2.add((tokens[i]));
            }
            
        }
        /*
        System.out.println("usernames");
        for (int i = 0; i < a1.size(); i++) {
            System.out.println(a1.get(i));
        }
        
        System.out.println();
        System.out.println("passwords");
        for (int i = 0; i < a2.size(); i++) {
            System.out.println(a2.get(i));
        }
                */
        
        System.out.println(a1.get(0) + " " + a2.get(0) + " " + a3.get(0));
    }
}
