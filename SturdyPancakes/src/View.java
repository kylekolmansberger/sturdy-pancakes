/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author fyl5079
 */
public class View {
    private MyJFrame initial;
    private Model model;
    public View(Model a){
        initial = new MyJFrame("Sturdy Pancakes - Credential Manager");
        model = a;
    }
    public MyJFrame getMyJFrame() {
        return initial;
    }

    public void setIF(MyJFrame initial) {
        this.initial = initial;
    }

    public Model getView() {
        return model;
    }

    
}
