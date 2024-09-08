
import javax.swing.*;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author prajwal
 */
public class View{
    JPanel pn;
    JButton save;
    JTextField jt;
    
    public JPanel getPn() {
        return pn;
    }

    public JButton getSave() {
        return save;
    }

    public JTextField getName() {
        return jt;
    }

    public View() {
        
        pn = new JPanel();
        save=new JButton("save");
        jt = new JTextField(30);
        
        pn.add(jt);
         pn.add(save);
    }
    
    
}
