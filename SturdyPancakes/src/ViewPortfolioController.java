
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
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
public class ViewPortfolioController implements Menu {

    private Model model;
    private View view;
    private String label,username,password;
    
    
    public ViewPortfolioController(Model a, View b) {
        model = a;
        view = b;
        newActionListener();
    }
    
    private void newActionListener() {
        
        ActionListener submitCategory = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent event) {
                if (event.getSource() == view.getMyJFrame().getViewPortfolio().getSubmitButton()) {
                    String categoryName = view.getMyJFrame().getViewPortfolio().getCategoryName().getText();
                    String profileName = view.getMyJFrame().getProfileNameAccess().getProfileName();
                    String temp = "";
                    try {
                        Scanner in = new Scanner(new File("SuperSecretStuff/" + profileName + "/" + categoryName + ".txt"));
                        ArrayList<String> credentials = new ArrayList<>();
                        while (in.hasNextLine()) {
                            credentials.add(in.nextLine());
                        }
                        view.getMyJFrame().getSavedPortfolios().savePortfolio(credentials);
                       // view.getMyJFrame().getSavedPortfolios().separateLines();
                        
                        for (int i = 0; i < credentials.size(); i++) {
                            //model.getEncryption().decrypt(" "+credentials.get(i)+" ");
                            
                            
                            String temp2 = credentials.get(i);
                            int space = temp2.indexOf("#");
                            label =temp2.substring(0,space);
                            temp2 = temp2.substring(space + 1);
                            
                            space = temp2.indexOf("#");
                            username = temp2.substring(0, space);
                            temp2 = temp2.substring(space + 1);
                            
                            password = temp2;
                            
                            temp = temp + "<br>Credential: "+label+"<br>Username: "+ model.getEncryption().decrypt(username)+ "<br>Password: "+ model.getEncryption().decrypt(password)+ "<br>";
                            System.out.println("<html>" + temp+ "</html>");
                            view.getMyJFrame().getViewPortfolio().getInformation().setText("<html>" + temp + "</html>");
                            
                            
                        }
                        in.close();
                        
                        
                    } catch (IOException e) {
                        System.out.println("Failed");
                    } catch (Exception ex) {
                        System.out.println("Failed");
                    }
                }
            }
        };
        view.getMyJFrame().getViewPortfolio().getSubmitButton().addActionListener(submitCategory);
    }
    
    
    
    
    
    
    
    @Override
    public void getUserSelection() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void runUserSelection() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
