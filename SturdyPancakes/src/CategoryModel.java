
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author nadaziab
 */
public class CategoryModel {
    
    String categoryName;
    
    public CategoryModel() {
        
    }
    
    public void createCategory() {
        
        try {

            File file = new File(categoryName + ".txt");

            // if file doesnt exists, then create it
            if (!file.exists()) {
                file.createNewFile();
            }

            System.out.println("Done");

        } catch (IOException e) {
            
        }
    }
}
