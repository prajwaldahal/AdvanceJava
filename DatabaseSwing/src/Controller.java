
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author prajwal
 */
public class Controller {
    Model m;
    View v;

    public Controller(Model m,View v) {
        this.m = m;
        this.v=v;
        v.getSave().addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                
                m.setFname(v.getName().getText());
                m.insertDb();
                v.getName().setText("");
                
            }
        
        });
    }
    
    
}
